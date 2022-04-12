package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo9 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\s+");
        Matcher m = p.matcher("Удаляем      \t\t лишние пробелы.   \r");
        System.out.println(m.replaceAll(" "));
    }
}
