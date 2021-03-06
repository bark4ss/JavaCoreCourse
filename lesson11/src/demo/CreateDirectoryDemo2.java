package demo;

import java.io.File;
import java.io.IOException;

//https://metanit.com/java/tutorial/6.11.php
//https://metanit.com/java/tutorial/6.12.php
public class CreateDirectoryDemo2 {
    public static void main(String[] args) throws IOException {

        // определяем объект для каталога
        File dir = new File("G://NewDir/NewDir");
        boolean created = dir.mkdirs();
        if(created)
            System.out.println("Folder has been created");
        // переименуем каталог
        File newDir = new File("G://NewDirRenamed");
        dir.renameTo(newDir);
        // удалим каталог
        //boolean deleted = newDir.delete();
        //if(deleted)
        //    System.out.println("Folder has been deleted");
    }
}
