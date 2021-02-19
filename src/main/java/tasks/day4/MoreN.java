package main.java.tasks.day4;

import java.util.Random;

public class MoreN {

    public static void main(String[] args) {

        foo();

    }

    static void foo() {
        int n = 5;
        int i = 20;
        int[] array = new int[i];
        Random random = new Random();

        for (i = array.length - 1; i >= 0; i--) {

            if(i > n)

                array[i] = random.nextInt(55);

            System.out.print(" " + array[i] + " ");

        }


    }

}

