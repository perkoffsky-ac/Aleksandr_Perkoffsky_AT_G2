package tasks.day8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionTask2 {
    int i;

    public static void main(String[] args) {
        List<String> myList1 = new ArrayList<>();
        List<String> myList2 = new LinkedList<>();
        String line = "мыла";

        long t0 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            myList1.add(line);
        }
        System.out.println(System.currentTimeMillis() - t0);

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            myList2.add(line);
        }
        System.out.println(System.currentTimeMillis() - t1);

        long t2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            myList1.get(i);
        }
        System.out.println(System.currentTimeMillis() - t2);

        long t3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            myList2.get(i);
        }
        System.out.println(System.currentTimeMillis() - t3);
    }
}
