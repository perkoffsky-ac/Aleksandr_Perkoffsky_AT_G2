package tasks.day7.homeTasks;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class SignsWords {

    public static void main(String[] args) throws Exception {

        File file1 = new File("file.txt");
        Scanner scanner = new Scanner(new FileInputStream(file1));

        int count = 0;
        int count2 = 0;

        while (scanner.hasNext()) {
            scanner.next();
            count++;
        }
        System.out.println("Number of words: " + count);

        while (scanner.hasNext()) {
            scanner.next().replaceAll("[\\W]", "");
            count2++;
        }
        System.out.println("Number of words: " + count2);
    }
}
