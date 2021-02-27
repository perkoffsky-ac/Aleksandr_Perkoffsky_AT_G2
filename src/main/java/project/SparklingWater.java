package main.java.project;

import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class SparklingWater extends Water {

    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {   //таймер вместо Thread.sleep()
            @Override
            public void run() {

                if (isOpened()) {
                    degas();
                }
            }
        }, 0, 2);

    }

    /*static class WaterTest extends Thread {

        public void run() {
            {
                for (int i = 0; i < 5; i++) {
                    try {
                        Thread.sleep(2000);        //Приостанавливает поток на 2 секунды
                    } catch (InterruptedException e) {
                    }
                }

                System.out.println("Вода открыта");
            }
        }

        public boolean checkIsOpened(boolean isOpened) {
            return isOpened;
        }
    }

    class CheckOpenClose    //Класс с методом main()
    {
        WaterTest mAnotherOpinion;    //Побочный поток

        public void main(String[] args) {
            mAnotherOpinion = new WaterTest();
            mAnotherOpinion.start();

            if (mAnotherOpinion.checkIsOpened(true))
            {
                degas();    //Вода открыта
            }
            System.out.println("Вода открыта");
        }
    }

    public void checkIsOpened(boolean isOpened) {
        this.isOpened = false;

    }*/

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;

    }

    public boolean setOpened(boolean isOpened) {
        this.isOpened = true;       //закрыта или нет
        return isOpened;
    }

    private boolean isOpened() {
        return true;
    }

    private void degas() {
        int bubbles = this.temperature * 5 + 10; //партия пузырьков зависящая от температуры

        while (this.bubbles != null && this.bubbles.length > 0) {
            int currLength = this.bubbles.length;
            if (currLength < bubbles) {
                //если осталось пузырьков меньше чем размер партии
                bubbles = currLength;
            }
            for (int i = 0; i < bubbles; i++) {
                //лопает пузырьки партиями (каждая партитя от 0 до bubbles)
                int index = currLength - i - 1;
                this.bubbles[index].burst(); // i = 0 - 1 (если партия 210, то index = 209...)
            }

            this.bubbles = Arrays.copyOf(this.bubbles, currLength - bubbles);
            //содаю новый массив из копии старого
            //длина нового массива = длина оригинального массива - кол-во пузырьков в партии
        }
    }

    public boolean isSparkle() {
        return this.bubbles != null && this.bubbles.length > 0;
        //возвращает true если в воде еще есть пузырьки газа

    }
}
