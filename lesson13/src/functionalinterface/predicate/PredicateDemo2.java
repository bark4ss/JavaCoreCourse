package functionalinterface.predicate;

import java.util.function.Predicate;

public class PredicateDemo2 {
    public static void main(String[] args) {
        Predicate<String> containsA = t -> t.contains("A");
        Predicate<String> containsB = t -> t.contains("B");
        Predicate<String> containsF = t -> t.contains("F");
        Predicate<String> containsD = containsF.negate();
        System.out.println(containsA.and(containsB).negate().test("ABCD"));
    }
}
