package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexDemo1 {
    public static void main(String[] args) {
        //https://javarush.ru/groups/posts/136-reguljarnihe-vihrazhenija-v-java-chastjh-1
        String regex = ".*+ox";//aaox, ox, ox 111 ox,
        //.ox
        //[csw]
        //[^asw]
        //[a-p]
        //[a-pA-Z]
        //[a-d[m-p]] , [ab[c-e]]
        //[a-z&&[d-f]]
        //[a-z&&[^m-p]] , [a-f&&[^a-c]&&[^e]]
        //(Java( language)\2)
        //^The\w* ,
        //greedy quantifier: ?,*,+ : .*ox, .?ox, .+ox
        //reluctant quantifier: ?+,*+,++
        //possessive quantifier: ??,*?,+?


        String input = "oxfox box paa";

        //crabapple
        //The quick brown fox jumps over the lazy ox.
        //The Java language language
        //Therefore
        //fox box pox


        try {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(input);
            System.out.println(m.find());
            while (m.find())
                System.out.println("Found [" + m.group() + "] starting at "
                        + m.start() + " and ending at " + (m.end() - 1));
        } catch (PatternSyntaxException pse) {
            System.err.println("Неправильное регулярное выражение: " + pse.getMessage());
            System.err.println("Описание: " + pse.getDescription());
            System.err.println("Позиция: " + pse.getIndex());
            System.err.println("Неправильный шаблон: " + pse.getPattern());
        }
    }


}
