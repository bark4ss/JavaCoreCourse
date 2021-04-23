package functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateDemo1 {
    public static void main(String[] args) {
        //https://www.examclouds.com/java/java-core-russian/predicate-interface-russian
        Predicate<Integer> negative = i -> i < 0;
        System.out.println(negative.test(-6));
        System.out.println(negative.test(6));
        System.out.println(negative.test(0));
    }
}
