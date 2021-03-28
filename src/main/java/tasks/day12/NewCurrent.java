package main.java.tasks.day12;

public class NewCurrent {
    static long i = 0;

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                for (int j = 0; j < 1_000_000; j++) {
                    i++;
                }
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                for (int j = 0; j < 1_000_000; j++) {
                    i--;
                }
            }
        });

        t1.start();
        t2.start();
        t2.join();
        Thread.sleep(100);
        System.out.println(i);
    }
}
