package main.java.tasks.day12;

public class NewThread {

    public static void main(String[] args) throws InterruptedException {

        Object lock = new Object();

        new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 3; i++) {
                    try {
                        Thread.currentThread().sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.printf("t1-%s ", i);
                }
            }
        }).start();

        new Thread(() -> {
            syncMethod("t1");
        }).start();

        Thread.sleep(1000);
        
        syncMethod("m");

        synchronized (lock) {
            for (int i = 0; i < 3; i++) {
                Thread.currentThread().sleep(1000);
                System.out.printf("m-%s ", i);
            }
        }
    }

    private static synchronized void syncMethod(String threadName) {
        for (int i = 0; i<3; i++){
            try{
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
            e.printStackTrace();
        }
            System.out.printf("%s-%s ", threadName, i);
        }
    }
}
