package tasks.day10_11.homeTasks;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.IntStream.rangeClosed;

public class CreateList {

    public static void main(String[] args) {

        int minValue = 0;
        int maxValue = 199;

        List<Integer> wholeNumbers = rangeClosed(minValue, maxValue)
                .boxed()
                .filter(x -> x % 3 == 0 && x % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(wholeNumbers);
    }
}
