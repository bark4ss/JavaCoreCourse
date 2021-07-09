package features;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Features {
    public static void main(String[] args) throws IOException {

        var list = new ArrayList<String>();  //перед нами ArrayList<String>
        var stream = list.stream();

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
