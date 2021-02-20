package main.java.tasks.day4;

import java.util.Random;

public class СurrMonth {

    public static void main(String[] args) {

        foo();

    }

    static void foo() {
        int n = 2;
        int i = 12;
        int[] array = new int[i];
        Random random = new Random();

        for (i = 0; i < array.length; i++) {

            if(array[i] % n == 0)

                array[i] = random.nextInt(55);
            int sum = 0;

            sum = sum + array[i];

            System.out.print(" " + sum + " ");

        }


    }

}
