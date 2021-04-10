package tasks.day10_11;

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

        Boolean k = list.stream().anyMatch("мама"::equals);
        System.out.println(k);

        Boolean l = list.stream().allMatch("м"::contains);
        System.out.println(l);

        List<String> z = list.stream().map(c -> c + "м").collect(Collectors.toList());
        System.out.println(z);

        List<String> v = list.stream()
                .flatMap(c -> Arrays.stream(c.split("а")))
                .filter(c -> !c.equals(""))
                .collect(Collectors.toList());
        System.out.println(v);

        List<String> vv = list.stream().sorted().collect(Collectors.toList());
        System.out.println(vv);

        List<String> vvv = list.stream()
                .sorted((x, y) -> -x.compareTo(y))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(vvv);

        String nb = list.stream().flatMap(c -> Arrays.stream(c.split("")))
                .max(String::compareTo)
                .get();
        System.out.println(nb);

        long gg = list.stream().flatMap(c -> Arrays.stream(c.split("")))
                .count();
        System.out.println(gg);


        Integer nbb = list.stream().map(String::length)
                .reduce((x, y) -> x + y)
                .get();
        System.out.println(nbb);


        Integer nbbv = list.stream().mapToInt(String::length)
                .sum();
        System.out.println(nbbv);


        long nbv = list.stream().flatMap(x -> Arrays.stream(x.split("")))
                .count();
        System.out.println(nbv);

        long vrv = list.stream().map(String::length).
                collect(Collectors.summingInt(x -> x % 2 == 1 ? x : 0));
        System.out.println(vrv);


        String nbn = list.stream()
                .collect(Collectors.joining(":", "<p> ", " </p>"));
        System.out.println(nbn);
    }
}
