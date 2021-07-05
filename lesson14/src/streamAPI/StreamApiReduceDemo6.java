package streamAPI;

import model.Phone;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiReduceDemo6 {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1,2,3,4,5);
        Optional<Integer> result = numbers.reduce((x,y) -> x*y);
        System.out.println(result.get());

        Stream<String> wordStream = Stream.of("мама", "мыла", "раму");
        Optional<String> resultString = wordStream.reduce((x,y) -> x + " " + y);
        System.out.println(resultString.get());

        Stream<String> wordStream2 = Stream.of("мама", "мыла", "раму");
        String resultString2 = wordStream2.reduce("Result:",(x,y) -> x + " " + y);
        System.out.println(resultString2);

        Stream<Phone> phoneStream = Stream.of(new Phone("iphone 6 s", 54000),
                new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy s6", 40000),
                new Phone("LG G 4", 32000));

        int sum = phoneStream.reduce(0, (x,y) -> {
            if(y.getPrice()<50000) {
                return x + y.getPrice();
            } else {
                return x;
            }
        }, Integer::sum);

        System.out.println(sum);
    }
}
