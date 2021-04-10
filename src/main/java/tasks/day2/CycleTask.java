package tasks.day2;

import java.util.Random;

public class CycleTask {

    public static void main(String[] args) {

        allnum();
        oddnum();
        new CycleTask().elem();

    }

    static void allnum() {

        int i = 0;
        while (i <= 20) {

            System.out.print(i + " ");
            i = ++i;
        }

        System.out.print(" - все числа");
        System.out.println();
    }

    static void oddnum() {

        int i;
        for (i = 3; i <= 19; i++) {

            System.out.print(i + " ");
            i = ++i;
        }

        System.out.print(" - нечетные числа");
        System.out.println();
    }

    public void elem() {

        int[] array = new int[7];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(18);

            System.out.print(array[i] + " ");

        }

        System.out.print(" - прямой порядок");
        System.out.println();


        for (int i = array.length - 1; i >= 0; i--) {

            System.out.print(array[i] + " ");

        }

        System.out.print(" - обратный порядок");
        System.out.println();


        for (int k : array) {

            System.out.print(k * 5 + " ");

        }
        System.out.print(" - x5");
        System.out.println();


        int j = 2;
        for (int k : array) {

            System.out.print(Math.pow(k, j) + " ");

        }

        System.out.print(" - возведенные в квадрат");
        System.out.println();


        int min = array[0];
        for (int k : array) {

            if (k < min) {
                min = k;

            }

        }

        System.out.print(min + " - минимальный элемент массива");
        System.out.println();


        int first = array[0];
        int last = array.length - 1;
        int g;
        for (int k : array) {

            g = last;
            last = first;
            first = g;

            System.out.print(k + " ");

        }

        System.out.print(" - меняются местами первый и последний элементы");
        System.out.println();


        int temp;
        for (int i = 0; i < array.length; i++) {

            for (int z = i + 1; z < array.length; z++) {

                if (array[i] < array[z]) {

                    temp = array[i];
                    array[i] = array[z];
                    array[z] = temp;
                }

            }

            System.out.print(array[i] + " ");
        }

        System.out.print(" - элементы в порядоке убывания");
        System.out.println();
    }


}


