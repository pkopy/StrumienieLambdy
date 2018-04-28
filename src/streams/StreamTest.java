package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Maja", "Kaja", "Oskar", "Tadek", "Karolina","Tomek", "Konrad");

//        String name ="Tomek";
//        Optional<String> stringOptional = Optional.ofNullable(name);
//        System.out.println(stringOptional.orElse("Brak imienia"));

        System.out.println(list.stream()
                .filter(s -> !s.endsWith("a"))
                .sorted()
                .distinct()

                .skip(2)
                .collect(Collectors.joining(", ", "Imiona: ", ".")));

        System.out.println(IntStream.of(1, 2, 3, 4, 5).summaryStatistics());
//                .mapToInt(s -> s.length())
//                .average());
//                .reduce ((s, s1) -> s1 + s)
//                .ifPresent(s-> System.out.println(s));
//                .forEach(s -> System.out.println(s));
        IntStream.range(0,99)
                .filter(s->s%2==0)
                .mapToObj(String::valueOf )
                .forEach(System.out::println);
    }
}
