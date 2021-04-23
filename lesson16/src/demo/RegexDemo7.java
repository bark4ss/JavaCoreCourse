package demo;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class RegexDemo7 {
    public static void main(String[] args) {
        List<String> progLangs = Arrays.asList("apl", "basic", "c", "c++", "c#", "cobol", "java", "javascript", "perl", "python", "scala");
        Pattern p = Pattern.compile("^c");
        progLangs.stream().filter(p.asPredicate()).forEach(System.out::println);

        for (String progLang : progLangs)
            if (p.matcher(progLang).find())
                System.out.println(progLang);
    }
}
