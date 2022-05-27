package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
    public static void main(String[] args) {
        String input = "FIFA ! will!never,regret it";
        String pattern = "\\s*(!|,|\\s)\\s*";

        /*String[] split = input.split(pattern);
        for (String i: split) System.out.println(i);*/

        Pattern p = Pattern.compile(pattern);
        Matcher matcher = p.matcher(input);
        System.out.println(matcher.replaceAll(" "));
        /*while (matcher.find()){
            System.out.println(matcher.group());
        }*/
    }
}
