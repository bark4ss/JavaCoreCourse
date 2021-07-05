package referenceMethod;

import model.Phone;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class ReferenceDemo1 {
    //https://www.examclouds.com/ru/java/java-core-russian/method-references-russian
    //https://vertex-academy.com/tutorials/ru/java-8-ssylki-na-metody/
    public static void main(String[] args) {
        Consumer<String> consumer = str -> System.out.println(str);
        Consumer<String> consumerReference = System.out::println;

        //static reference method
        Function<String, Boolean> function = e -> Boolean.valueOf(e);
        System.out.println(function.apply("TRUE"));

        Function<String, Boolean> functionReference = Boolean::valueOf;
        System.out.println(function.apply("TRUE"));

        //reference nonStatic method on particular object
        Integer integer = 5;
        Supplier<String> supplier = () -> integer.toString();
        System.out.println(supplier.get());

        Integer integerReference = 5;
        Supplier<String> supplierReference = integerReference::toString;
        System.out.println(supplierReference.get());

        //reference constructor
        Function<String, Phone> functionConstructor = (d) -> new Phone(d);
        System.out.println(functionConstructor.apply("4"));

        Function<String, Phone> functionConstructorReference = Phone::new;
        System.out.println(functionConstructorReference.apply("4"));
    }
}
