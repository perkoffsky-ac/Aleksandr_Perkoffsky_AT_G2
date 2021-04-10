package tasks.day8;

import java.util.*;

public class CollectionTask5 {

    int i;

    public static void main(String[] args) {
        Set<String> myList1 = new HashSet<>();
        Set<String> myList2 = new TreeSet<>();
        String line = "мыла";

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            myList1.add(line);
        }
        System.out.println(System.currentTimeMillis() - t0);


        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            myList2.add(line);
        }
        System.out.println(System.currentTimeMillis() - t1);


        Iterator<String> iterator = myList1.iterator();
        long t2 = System.nanoTime();
        while (iterator.hasNext()) {
            iterator.next();
        }
        System.out.println(System.nanoTime() - t2);


        Iterator<String> iterator2 = myList2.iterator();
        long t3 = System.nanoTime();
        while (iterator2.hasNext()) {
            iterator2.next();
        }
        System.out.println(System.nanoTime() - t3);
    }
}
