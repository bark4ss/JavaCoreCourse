package demo;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInStreamDemo {
    public static void main(String[] args) {

        try(FileInputStream fin=new FileInputStream("notes.txt"))
        {
            System.out.printf("File size: %d bytes \n", fin.available());

//            int i;
//            while((i=fin.read())!=-1){
//                System.out.println((char)i);
//            }
            byte[] buffer = new byte[fin.available()];
            // считаем файл в буфер
            fin.read(buffer, 0, fin.available());

            System.out.println("File data:");
            for(int i=0; i<buffer.length;i++){

                System.out.print((char)buffer[i]);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
