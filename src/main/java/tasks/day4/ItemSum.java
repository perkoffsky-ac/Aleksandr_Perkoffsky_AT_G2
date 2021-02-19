package main.java.tasks.day4;

import java.util.Random;

public class ItemSum {

    public static void main(String[] args) {

        foo();

    }

    static void foo() {
        int n = 7;
        int i = 888;
        int[] array = new int[i];
        Random random = new Random();

        for (i = 0; i < array.length; i++) {

            if(array[i] % n == 0)

            array[i] = random.nextInt(55);
            int sum = array[i];

            sum = sum + array[i];

            System.out.print(" " + sum + " ");

        }


    }

}


