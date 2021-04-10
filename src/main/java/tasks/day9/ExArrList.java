package tasks.day9;

import java.util.ArrayList;

public class ExArrList {

    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<String>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Orange");
        colors.add("White");
        colors.add("Black");

        for (String color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();

        colors.add(2, "Pink");
        colors.add(4, "Yellow");

        /*Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }*/

        for (int i = 0; i < colors.size(); i++) {
            System.out.print(colors.get(i) + " ");
        }
        System.out.println();
        System.out.print(colors.get(1) + " ");
        System.out.print(colors.get(5));
    }
}
