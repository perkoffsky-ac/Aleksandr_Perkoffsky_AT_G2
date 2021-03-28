package main.java.tasks.day12;

import static main.java.tasks.day12.HMethod.heavyMethod;

public class ThreeThread {

    public static void main(String[] args) throws InterruptedException {

        /*Thread t1 = new Thread(() -> {
            IntStream.range(0, 100).forEach(i -> System.out.println("t1: " + i));
            Thread.yield();
        });

        Thread t2 = new Thread(() -> {
            IntStream.range(0, 100).forEach(i -> System.out.println("t2: " + i));
        });

        Thread t3 = new Thread(() -> {
            IntStream.range(0, 100).forEach(i -> System.out.println("t3: " + i));
        });
*/

        Thread t1 = new Thread(() -> {
            heavyMethod();
        });

        Thread t2 = new Thread(() -> {
            heavyMethod();
        });

        /*Thread t3 = new Thread(() -> {
            try {
                t1.join();
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            heavyMethod();
        });*/

        Thread t3 = new Thread(() -> {
            heavyMethod();
        });

        t1.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t3.setPriority(Thread.MIN_PRIORITY);
        t3.start();
    }
}
