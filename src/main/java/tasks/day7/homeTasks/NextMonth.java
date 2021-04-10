package tasks.day7.homeTasks;

import java.util.Scanner;

public class NextMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число месяца: ");
        int i = scanner.nextInt();
        if (i < 13) {
            if (i > 0) {
                if (i == 12) {
                    System.out.print(i - 11);
                    System.out.println("-й месяц следующего года");
                } else {
                    i++;
                    System.out.print(i);
                    System.out.println("-й месяц текущего года");
                }
            } else {
                System.out.println("Месяцев в году не может быть меньше 1-го");
            }
        } else {
            System.out.println("В году всего 12 месяцев");
        }
    }
}
