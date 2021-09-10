package demo;

import customexception.MyException;

public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("caught: " + e.getDetail());
        }
    }

    public static void compute(int a) throws MyException {
        System.out.println("called computer " + a);
        if(a>10) {
            throw new MyException(a);
        }
        System.out.println("normal exit.");
    }
}
