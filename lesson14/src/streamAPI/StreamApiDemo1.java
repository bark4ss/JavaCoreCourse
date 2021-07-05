package streamAPI;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApiDemo1 {
    public static void main(String[] args) {
        //https://metanit.com/java/tutorial/10.1.php
        int[] numbers = {-5, -4, -3, -3, -2, -1, 0, 1, 2, 2, 3, 4, 5};
        int count=0;
        for(int i:numbers){

            if(i > 0) count++;
        }
        System.out.println(count);

        IntStream intStream = IntStream.of(numbers);
        long countWithStream = intStream.filter(w -> w > 0).count();
        System.out.println(countWithStream);

        //distinct
        IntStream intDistinctStream = IntStream.of(numbers);
        long countDistinctNumber = intDistinctStream.distinct().count();
        System.out.println(countDistinctNumber);

        //allMatch
        IntStream intAllMatchStream = IntStream.of(numbers);
        boolean isAllMatchNumber = intAllMatchStream.allMatch(n -> n <10);
        System.out.println(isAllMatchNumber);

        //max
        IntStream intMaxNumberStream = IntStream.of(numbers);
        OptionalInt maxNumber = intMaxNumberStream.max();
        System.out.println(maxNumber.getAsInt());
    }
}
