package streamAPI;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiDemo1 {
    public static void main(String[] args) {
        //https://metanit.com/java/tutorial/10.1.php
        Stream<String> streamFromValues = Stream.of("a1", "a2", "a3");
        int[] numbers = {-5, -4, -3, -3, -2, -1, 0, 1, 2, 2, 3, 4, 5};
        int count=0;
        for(int i:numbers){

            if(i > 0) count++;
        }
        System.out.println(count);

        IntStream intStream = IntStream.of(numbers);
        long countWithStream = intStream.filter(element -> element > 0).count();
        long sum = intStream.filter(element -> element > 0).sum();
        System.out.println(countWithStream);

        //distinct
        IntStream intDistinctStream = IntStream.of(numbers);
        long countDistinctNumber = intDistinctStream.filter(w -> w > 0).distinct().count();
        System.out.println(countDistinctNumber);

        //allMatch
        IntStream intAllMatchStream = IntStream.of(numbers);
        boolean isAllMatchNumber = intAllMatchStream.allMatch(n -> n <10);
        System.out.println(isAllMatchNumber);

        //max
        int[] emptyNumbers = {};
        IntStream intMaxNumberStream = IntStream.of(emptyNumbers);
        OptionalInt maxNumber = intMaxNumberStream.max();
        System.out.println(maxNumber.getAsInt());

        //findFirst
        IntStream intFindFirstStream = IntStream.of(emptyNumbers);
        OptionalInt findFirstNumber = intFindFirstStream.filter(el -> el > -2 ).findFirst();
        System.out.println(findFirstNumber.getAsInt());
    }
}
