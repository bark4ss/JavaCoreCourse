package optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo2 {
    public static void main(String[] args) {
        //https://metanit.com/java/tutorial/10.12.php
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println(min.get());  // 1
    }
}
