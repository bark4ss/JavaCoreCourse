package functionalinterface;

import functionalinterface.functional.TestFunctionalInterface;

public class FunctionalAppl {
    public static void main(String[] args) {
        TestFunctionalInterface functionalInterface = new Test();
        functionalInterface.abstractMethod();
        TestFunctionalInterface functionalInterface2 = new TestFunctionalInterface() {
            @Override
            public void abstractMethod() {
                System.out.println("Test");
            }
        };
    }
}
