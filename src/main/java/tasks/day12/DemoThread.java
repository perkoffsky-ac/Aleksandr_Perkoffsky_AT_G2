package main.java.tasks.day12;

import java.util.stream.IntStream;

public class DemoThread extends Thread {

    public static void main(String[] args) {

        Thread thread = new Thread(() -> IntStream.range(0, 100).forEach(System.out::println));
        thread.start();

        Runnable task = new Runnable() {

            public void run() {
                IntStream.range(0, 100).forEach(System.out::println);
            }
        };
    }
}
