package lesson13.functionalinterface;

import lesson13.functionalinterface.functional.TestFunctionalInterface;

public class Test implements TestFunctionalInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Functional interfaces in Java 8");
    }
}
