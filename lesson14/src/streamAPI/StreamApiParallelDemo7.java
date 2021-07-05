package streamAPI;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamApiParallelDemo7 {
    public static void main(String[] args) {
        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6);
        Optional<Integer> result = numbersStream.parallel().reduce((x, y)-> x*y);
        System.out.println(result.get()); // 720

        Stream<String> wordsStream = Stream.of("мама", "мыла", "раму");
        String sentence = wordsStream.parallel().reduce("Результат:", (x,y)->x + " " + y);
        System.out.println(sentence);

        Stream<String> wordsStream2 = Stream.of("мама", "мыла", "раму", "hello world");
        String sentence2 = wordsStream2.parallel()
                .filter(s->s.length()<10) // фильтрация над параллельным потоком
                .sequential()
                .reduce("Результат:", (x,y)->x + " " + y); // операция над последовательным потоком
        System.out.println(sentence2);
    }
}
