package demo;

import java.io.FileNotFoundException;

public class ThrowDemo {
    public static void main(String[] args) {

        try {
            demoProc();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    static void demoProc() throws FileNotFoundException {
        try{
            throw new FileNotFoundException("demo");
        }catch (FileNotFoundException e) {
            System.out.println("caught:" + e.getMessage());
            throw new FileNotFoundException();
        }

    }
}
