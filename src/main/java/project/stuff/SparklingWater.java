package main.java.project.stuff;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SparklingWater extends Water implements Serializable {

    private boolean isOpened;
    List<Bubble> bubbles = new ArrayList<>();

    public SparklingWater(double volume) {
        super("no", "transparent", "no", 0);

        bubbles = IntStream.rangeClosed(0, (int) (volume * 10000))
                .boxed()
                .map(i -> new Bubble())
                .collect(Collectors.toList());
        isOpened();
    }

    @Override
    public void setOpened(boolean isOpened) {
        this.isOpened = isOpened;
    }

    public void isOpened() {
        new Thread(() -> {
            System.out.print("Degassing started");
            while (!isOpened) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            degas();
        }).start();
    }

    public void pump(List<Bubble> bubbles) {
        this.bubbles = bubbles;
        System.out.println();
    }

    private void degas() {
        new Thread(() -> {
            System.out.print("Gas come out");
            while (bubbles.size() != 0) {
                int bubbleСonsignment = 10 + 5 * getTemperature();
                bubbleСonsignment = Math.min(bubbles.size(), bubbleСonsignment);
                bubbles.stream().limit(bubbleСonsignment).forEach(Bubble::cramp);
                bubbles.subList(0, bubbleСonsignment).clear();
                System.out.println(bubbles.size());
            }
        }).start();
        isSparkle();
    }

    public boolean isSparkle() {
        return bubbles != null && bubbles.size() > 0;
    }
}