package main.java.tasks.day8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTask4 {
    public static void main(String[] args) {
        Set<String> myList = new TreeSet();
        String[] words = "типо мама мыла раму мыла".split(" ");

        for (String lineAdd : words) {
            myList.add(lineAdd);

        }
        Iterator<String> iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

