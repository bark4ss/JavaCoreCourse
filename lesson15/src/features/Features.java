package features;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Features {
    public static void main(String[] args) throws IOException {
        //https://metanit.com/java/tutorial/11.1.php
        //https://tproger.ru/translations/java-9-features-examples/
        //https://javarush.ru/groups/posts/542-novaja-java-opjatjh-vstrechaem-java-10
        var list = new ArrayList<String>();  //перед нами ArrayList<String>
        var stream = list.stream();
        //https://javarush.ru/groups/posts/1961-vihshla-java-11-novihe-fichi-i-vozmozhnosti-

        //https://javarush.ru/groups/posts/2171-java-12-uzhe-zdesjh-chto-novogo
        //https://javarush.ru/groups/posts/2353-java-13-novihe-vozmozhnosti
        //https://javarush.ru/groups/posts/2601-java-14-chto-novogo
        //https://metanit.com/java/tutorial/3.18.php
        //https://urvanov.ru/2021/02/15/%D1%87%D1%82%D0%BE-%D0%BD%D0%BE%D0%B2%D0%BE%D0%B3%D0%BE-%D0%B2-java-15/

        BufferedReader reader2 = new BufferedReader(new FileReader("journaldev.txt"));
        BufferedReader reader3 = new BufferedReader(new FileReader("journaldev.txt"));
        try (reader2;reader3) {
            System.out.println(reader2.readLine());
            System.out.println(reader3.readLine());
        }

        String htmlBlock = """
               	<html>
                 	<body>
                   	<p>CodeGym Web page</p>
                 	</body>
               	<html>
         	     """;

        String htmlBlock2 = " <html> " +
                "<body> " +
                "<p>CodeGym Web page</p> " +
                "</body> <html> " +
                "";

        Triangle triangle = new Triangle(4,5,"hello");
        triangle.name();
    }
}
