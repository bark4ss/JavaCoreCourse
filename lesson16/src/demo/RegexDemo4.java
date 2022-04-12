package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo4 {
    public static void main(String[] args) {
        String input = "Hello Java! Hello JavaScript! JavaSE8.";
        Pattern pattern = Pattern.compile("Java(\\w*)");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find())
            System.out.println(matcher.group());
    }
}
