package demo;

import java.util.regex.Pattern;

public class RegexDemo6 {
    public static void main(String[] args) {
        String input = "Hello Java! Hello JavaScript!J avaSE 8.";
        Pattern pattern = Pattern.compile("[ ,.!?]");//"\\s*(\\s|,|!|\\.)\\s*"
        String[] words = pattern.split(input);
        for(String word:words)
            System.out.println(word);
    }
}
