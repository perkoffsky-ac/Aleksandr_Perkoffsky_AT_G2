package main.java.tasks.day10;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LineCollection {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("мама", "мыла", "раму", "мама", "чисто");

        long a = list.stream().filter("мама"::equals).count();
        System.out.println(a);

        String s = list.stream()
                .distinct()
                .filter("baba"::equals)
                .findAny()
                .orElse("Папа");
        System.out.println(s);

        String d = list.stream().findFirst().orElse("мама");
        System.out.println(d);

        String f = list.stream().filter("мама"::equals).findFirst().get();
        System.out.println(f);

        String g = list.stream().skip(4).findFirst().get();
        System.out.println(g);

        Object[] h = list.stream().skip(3).limit(2).toArray();
        System.out.println(Arrays.toString(h));

        List<String> j = list.stream()
                .filter((x) -> x.contains("м"))
                .distinct()
                .collect(Collectors.toList());
        j.forEach(System.out::println);
    }
}
