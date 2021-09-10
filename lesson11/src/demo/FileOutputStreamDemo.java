package demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {

        String line = "Temp Line";

        try (FileOutputStream fos = new FileOutputStream("file.txt")) {
            byte [] arr = line.getBytes();
            for (int i = 0; i < arr.length; i++) {
                fos.write(i);
            }

        } catch (FileNotFoundException e) {
            System.out.println("exception");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
