package main.java.project.stuff;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SparklingWater extends Water implements Serializable {

    private boolean isOpened;
    private List<Bubble> bubbles = new ArrayList<>();

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
    public void pump(List<Bubble> bubbles) {
        this.bubbles = bubbles;
    }
    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
        isOpened();
    }
    private void isOpened() {
        checkIsOpened();
    }
    private void degas() {
        int bubblesСonsignment = this.temperature * 5 + 10;
        while (this.bubbles != null && this.bubbles.size() > 0) {
            int currSize = this.bubbles.size();
            if (currSize < bubblesСonsignment) {
                bubblesСonsignment = currSize;
            }
            for (int i = 0; i < bubblesСonsignment; i++) {
                int index = currSize - i - 1;
                this.bubbles.get(index).burst();
            }
            /*this.bubbles = new ArrayList(currSize - bubblesСonsignment);*/
            bubbles.subList(0, bubblesСonsignment).clear();
            isSparkle();
        }
    }
    public boolean isSparkle() {
        return this.bubbles != null && this.bubbles.size() > 0;
    }
}
