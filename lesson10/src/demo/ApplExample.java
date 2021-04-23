package demo;

import customexception.NotContextException;

public class ApplExample {
    public static void main(String[] args) throws Exception {
        try {
            throw new NotContextException();
        } catch (NotContextException e) {
            System.err.println("Catch checked exception");
        }
        divideByZero(42,0,14);
    }

    public static void divideByZero (int a , int b, int value) throws Exception {
        int c;
        int[] arr = new int[value];

        System.out.println("Check");
        try {
            c = a / b ;
            for (int i = 0; i<12; i++ ) {
                System.out.println("i= " + arr[i]);
            }
        }
         finally {
            System.out.println("Finally");
        }

    }
}
