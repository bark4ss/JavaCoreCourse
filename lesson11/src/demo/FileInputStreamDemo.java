package demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file.txt");
        try (fis) {

            int a;
            while ((a = fis.read()) != -1) {
                System.out.println((char) a);
            }


        } catch (FileNotFoundException e) {
            System.out.println("file is absent");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
