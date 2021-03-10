package main.java.tasks.day9;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<String>();
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> vegetables = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        names.add("Оля");
        names.add("Коля");
        names.add("Аня");
        names.add("Миша");
        names.add("Даша");

        vegetables.add("Помидор");
        vegetables.add("Огурец");
        vegetables.add("Кабачок");
        vegetables.add("Батат");
        vegetables.add("Картоха");

        printCollection(colors);
        printCollection(names);
        printCollection(vegetables);

        colors.add(2, "Pink");
        colors.add(4, "Yellow");

        names.set(2, "Оля");
        names.set(4, "Катя");

        int counter = 0;
        for (String string : vegetables) {
            if (vegetables.contains("a")) {
                counter++;
            }
        }

        printCollection(colors);
        printCollection(names);

        names.remove("Оля");
        names.remove(3);

        printCollection(names);

        System.out.print(colors.get(1) + " ");
        System.out.print(colors.get(5));
    }

    private static void printCollection(List<String> strings) {

        for (String string : strings) {
            System.out.print(string + " ");
        }
        System.out.println();
    }

}
