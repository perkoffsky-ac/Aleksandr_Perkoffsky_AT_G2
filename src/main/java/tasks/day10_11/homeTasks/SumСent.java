package tasks.day10_11.homeTasks;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class SumСent {

    public static void main(String[] args) {
        double СentList = IntStream.rangeClosed(1, 20)
                .boxed()
                .filter(d -> d % 2 == 0)
                .peek(System.out::println)
                .map(s -> s * 2.54)
                .peek(System.out::println)
                .flatMapToDouble(x -> DoubleStream.of(x * 1.0)).sum();
        System.out.println(СentList);
    }
}
