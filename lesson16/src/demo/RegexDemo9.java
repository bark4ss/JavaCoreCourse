package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo9 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("\\s+");
        Matcher m = p.matcher("Удаляем      \t\t лишние пробелы.   \r");
        while (m.find()){
            System.out.println("Group " + m.group() + " start " + m.start() + " end " + (m.end()-1));
        }
        System.out.println(m.replaceAll(" "));
    }
}
