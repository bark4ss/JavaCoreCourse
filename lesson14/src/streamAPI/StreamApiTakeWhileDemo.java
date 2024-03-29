package streamAPI;

import java.util.stream.Stream;

public class StreamApiTakeWhileDemo {
    public static void main(String[] args) {
        //https://metanit.com/java/tutorial/10.13.php
        //https://metanit.com/java/tutorial/10.7.php
        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5, 7);
        numbers.takeWhile(n -> n < 0)
                .forEach(System.out::println);

        //dropWhile
        Stream<Integer> numbers2 = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5, 2, 3);
        numbers2.sorted().dropWhile(n -> n < 0)
                .forEach(System.out::println);

        //concat
        Stream<String> people1 = Stream.of("Tom", "Bob", "Sam");
        Stream<String> people2 = Stream.of("Alice", "Kate", "Sam");

        Stream.concat(people1, people2).forEach(System.out::println);
    }
}
