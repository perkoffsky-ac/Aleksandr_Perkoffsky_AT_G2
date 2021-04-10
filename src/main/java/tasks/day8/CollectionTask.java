package tasks.day8;

import java.util.ArrayList;
import java.util.List;

public class CollectionTask {
    int i;

    public static void main(String[] args) {
        String line = "мама мыла раму мыла";
        String[] words = line.split(" ");
        List<String> myList = new ArrayList<>();
        for (String lineAdd1 : words) {
            myList.add(lineAdd1);
            System.out.println(lineAdd1);
        }

        for (String lineAdd2 : myList) {
            System.out.println(lineAdd2);
        }

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }
}

