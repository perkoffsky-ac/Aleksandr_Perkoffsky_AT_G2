package main.java.tasks.day8;

import main.java.tasks.day5.stringTask.LogTask;

import java.util.HashMap;
import java.util.Map;

public class MapTask {

    int i;

    public static void main(String[] args) {
        String[] array = "мама мыла раму мыла".split(" ");
        Map<Integer, String> words = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            words.put(i, array[i]);

            words.keySet();
            words.entrySet();
            words.values();
        }
        System.out.println(words.keySet());
        System.out.println(words.values());
        System.out.println(words.entrySet());
    }

}
