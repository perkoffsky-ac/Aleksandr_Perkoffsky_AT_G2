package tasks.day12;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NewMap {

    static int i;

    public static void main(String[] args) throws InterruptedException {
        /*Map<Integer, Integer> map = new HashMap<>();*/
        /*Map<Integer, Integer> map = new ConcurrentHashMap<>();*/
        Map<Integer, Integer> map = Collections.synchronizedMap(new HashMap<>());

        Thread t1 = new Thread(() -> {
            for (int j = 0; j < 1_0_000; j++) {
                map.put(j, j);
            }
        });


        Thread t2 = new Thread(() -> {
            for (int j = 0; j < 1_0_000; j++) {
                map.forEach((k, v) -> i += v);
            }
        });

        t1.start();
        t2.start();
        /*t2.join();
        Thread.sleep(1000);*/
        System.out.println(i);
    }
}
