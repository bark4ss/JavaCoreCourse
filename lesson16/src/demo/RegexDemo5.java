package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo5 {
    public static void main(String[] args) {
        String input = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern = Pattern.compile("Java(\\w*)");
        Matcher matcher = pattern.matcher(input);
        String newStr = matcher.replaceAll("HTML");
        System.out.println(newStr); // Hello HTML! Hello HTML! HTML 8.
    }
}
