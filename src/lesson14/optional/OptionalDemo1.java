package lesson14.optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println(min.get());  // 1
    }
}
