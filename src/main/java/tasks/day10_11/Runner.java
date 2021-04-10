package tasks.day10_11;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.justMethod(x -> new ClassX(x));

        List<Person> list = Arrays.asList(
                new Person("Вася", 13, Person.Sex.Man),
                new Person("Катя", 28, Person.Sex.Women),
                new Person("Вова", 24, Person.Sex.Man),
                new Person("Маша", 38, Person.Sex.Women),
                new Person("Роман Петрович", 72, Person.Sex.Man));

        int i = 0;
        for (Person person : list) {
            if (((person.age > 18 && person.age < 55) && (person.sex == Person.Sex.Women))
                    || ((person.age > 18 && person.age < 60) && (person.sex == Person.Sex.Man))) {
                i++;
                System.out.println(person.name);
            }
        }

        long d = list.stream().filter(person -> person.age >= 18).filter(person -> (person.age < 55) ||
                (person.sex == Person.Sex.Man && person.age < 60)).count();
        System.out.println(d);

        list.stream()
                .sorted((person1, person2) -> {
                    if (person1.sex != person2.sex) {
                        return person1.sex.compareTo(person2.sex);
                    }
                    return person1.age - person2.age;
                }).peek(person -> System.out.println(person.name))

                .collect(Collectors.toList());

        Person ngg = list.stream().min(Comparator.comparingInt(person -> person.age)).get();

        list.stream()
                .collect(Collectors.toMap(person -> person.hashCode(), person -> person));

        list.stream()
                .collect(Collectors.groupingBy(person -> person.sex))
                .keySet()
                .forEach(System.out::println);
    }
}

