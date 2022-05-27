package demo;

import customexception.MyException;
import customexception.StatusCode;

import java.io.FileNotFoundException;

public class ExceptionDemo {
    public static void main(String[] args) {
        String statusCode = "";
        try {
            compute(1);
            compute(20);
        } catch (MyException e) {
            statusCode = e.getStatusCode().name();
        }
        System.out.println(statusCode);
    }

    public static void compute(int a) throws MyException {
        System.out.println("called computer " + a);
        try {
            int c = a*5;
            throw new FileNotFoundException();
        } catch (Exception ex){
            throw new MyException(StatusCode.ERROR);
        }
        finally {
            try {
                int d =5/0;
            } finally {
                System.out.println("Finally 2");
            }
        }
    }
}
