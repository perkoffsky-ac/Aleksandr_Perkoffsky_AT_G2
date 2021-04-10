package tasks.day10_11.homeTasks;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    private static List<Person> groupPeople() {
        return IntStream.rangeClosed(0, 100)
                .mapToObj(i -> new Person("name", "surname",
                        ThreadLocalRandom.current().nextInt(15, 30)))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> selectList = groupPeople()
                .stream()
                .filter(a -> a.age < 21)
                .peek(q -> System.out.println(q.name + " " + q.age))
                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .limit(4)
                .map(Person::getName)
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
