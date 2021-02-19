package main.java.project;

import java.util.Timer;
import java.util.TimerTask;

public class SparklingWater extends Water {

    private boolean isClosed;
    private Bubble[] bubbles;

    protected SparklingWater(int temperature) {
        super(temperature);
        this.isClosed = true;

        Timer timer = new Timer();

        timer.schedule(new TimerTask() {   //таймер вместо Thread.sleep()

            @Override
            public void run() {

                if (isOpened()) {
                    degus();
                    timer.cancel();
                }
            }
        }, 0, 2);

    }

    public SparklingWater() {
        super();
    }

    public void pump(Bubble[] bubbles) {
        this.bubbles = bubbles;

    }

    public void open() {
        this.isClosed = false;       //закрыта или нет
    }

    private boolean isOpened() {
        return !isClosed;            //закрыта или нет
    }

    private void degus() {

        if (this.bubbles != null) {
            for (int i = 0; i < this.bubbles.length; i++) { //лопает пузырьки, но не удаляет из массива (удалить)
                this.bubbles[0].burst();
            }

            /*while (this.bubbles.length > 0) {
                this.bubbles[0].burst();
                //сделать удаление 0-го элемента из массива ???????????
            }*/
        }
    }

}