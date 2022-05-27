package referenceMethod;

import model.Phone2;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReferenceDemo4 {
    public static void main(String[] args) {
        List<Phone2> res = Stream.of("Phone1","Phone2").map(p->new Phone2(p,new Random().nextInt(8))).collect(Collectors.toList());

        res.forEach(System.out::println);
    }
}
