package main.java.project.substance;

import main.java.project.including.Bubble;

import java.io.Serializable;
import java.util.Arrays;
import java.lang.Thread;

public class SparklingWater extends Water implements Serializable {

    private boolean isOpened;
    private Bubble[] bubbles;

    public SparklingWater(String color, String transparency, String smell, int temperature) {
        super(color, transparency, smell, temperature);
    }

    private void checkIsOpened() {

        Thread thread = new Thread() {

            public void run() {
                while (!isOpened) {
                    System.out.println("Bottle is closed..");
                }
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    degas();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;
    }

    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;                                            //закрыта или нет
        isOpened();
    }

    private void isOpened() {
        checkIsOpened();
        }

    private void degas() {
        int bubbles = this.temperature * 5 + 10;                         //партия пузырьков зависящая от температуры

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
