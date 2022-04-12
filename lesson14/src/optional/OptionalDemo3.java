package optional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

public class OptionalDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        if(min.isPresent()){

            System.out.println(min.get());
        }
        System.out.println(min.orElse(-1)); // -1
        Random rnd = new Random();
        System.out.println(min.orElseGet(()->rnd.nextInt(100)));
         //генеррация исключения IllegalStateException
        System.out.println(min.orElseThrow(IllegalStateException::new));
        min.ifPresentOrElse(
                System.out::println,
            () -> System.out.println("Value not found")
        );
    }

}
