package tasks.day12;

import java.util.concurrent.atomic.AtomicLong;

public class Atom {

    public static void main(String[] args) throws InterruptedException {

        AtomicLong co = new AtomicLong();

        Thread t1 = new Thread(() -> {

            for (int j = 0; j < 1_000_000; j++) {
                co.incrementAndGet();
            }

        });

        Thread t2 = new Thread(() -> {

            for (int j = 0; j < 1_000_000; j++) {
                co.incrementAndGet();
            }

        });

        t1.start();
        t2.start();
        t2.join();
        Thread.sleep(100);
        System.out.println(co);
    }
}

