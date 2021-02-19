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

    public void setOpen() {
        this.isClosed = false;       //закрыта или нет
    }

    private boolean isOpened() {
        return !isClosed;            //закрыта или нет
    }

    private void degus() {

        if (this.bubbles != null) {
            for (int i = 0; i < this.bubbles.length; i++) { //лопает пузырьки

                int bubbles = this.temperature*5 + 10; //
                System.out.println(this.bubbles[i].burst());

            }

        }
    }

}