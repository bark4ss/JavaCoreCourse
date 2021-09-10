package demo;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowDemo {
    public static void main(String[] args) {

        try {
            demoProc();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    static void demoProc() throws FileNotFoundException, IOException {
        try{
            throw new FileNotFoundException("demo");
        }catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        } catch (Exception e) {
            throw new IOException();
        }

    }
}
