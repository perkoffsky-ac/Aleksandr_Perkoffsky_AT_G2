package main.java.tasks.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionTask3 {

    public static void main(String[] args) {
        Set<String> myList = new HashSet();
        String[] words = "мама мыла раму мыла".split(" ");

        for (String lineAdd : words) {
            myList.add(lineAdd);

        }
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
