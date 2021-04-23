package functionalinterface;

import functionalinterface.functional.TestFunctionalInterface;

public class Test implements TestFunctionalInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Functional interfaces in Java 8");
    }
}
