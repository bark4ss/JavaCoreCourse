package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo8 {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("(cat(cat))");
        Matcher m = p.matcher("one catcat, two cats, or three cats on a fence");
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, "$1erpillar");
        }
        m.appendTail(sb);
        System.out.println(sb);
    }
}
