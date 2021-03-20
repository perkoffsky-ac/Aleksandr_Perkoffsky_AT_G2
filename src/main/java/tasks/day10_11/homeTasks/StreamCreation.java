package main.java.tasks.day10_11.homeTasks;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamCreation {

    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader bufferedReader = new BufferedReader(new FileReader("file.txt"));
        Arrays.stream(bufferedReader.lines()
                .skip(4)
                .collect(Collectors.joining(";"))
                .split("<br>"))
                .filter(r -> r.startsWith("Date log:"))
                .map(r -> r.substring(0, Math.min(r.length(), 20)))
                .map(r -> r + LocalDateTime.now())
                .forEach(System.out::println);
    }
}
