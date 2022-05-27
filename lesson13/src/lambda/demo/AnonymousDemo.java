package lambda.demo;

import lambda.util.Printable;

public class AnonymousDemo {
    public static void main(String[] args) {

        Printable printable = new Printable() {
            @Override
            public int count(int a) {
                return 0;
            }

            @Override
            public boolean isVisible(int c) {
                return false;
            }
        };
    }
}
