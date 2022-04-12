package demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {
    public static void main(String[] args) {
        //https://proglib.io/p/25-java-regex/
        Pattern pattern1 = Pattern.compile("[x-z]+");
        //Поиск будет происходить от x до z включительно.
        //Поиск будет происходить только по символам нижнего регистра.
        //Чтобы отключить чувствительность к регистру, можно использовать Pattern.CASE_INSENSITIVE.

        Matcher m = pattern1.matcher("x y z 1 2 3 4xz xx ");
        while (m.find())
            System.out.println("Found [" + m.group() + "] starting at "
                    + m.start() + " and ending at " + (m.end() - 1));
        //Поиск любого совпадения с шаблоном.
        //Выводится значение true, так как в строке есть символы шаблона.

        Matcher matcher2 = pattern1.matcher("X Y Z 1 2 3 4");
        System.out.println(matcher2.find());
        //Выводится значение false.
        //Так как в строке нет символов, подходящих по шаблону.

        Pattern pattern2 = Pattern.compile("[a-zA-Z0-9]");
        //Добавляется поиск по символам нижнего и верхнего регистра, а также цифр.

        Matcher matcher3 = pattern2.matcher("A B C D X Y Z a b c d x y z 1 2 3 4");
        System.out.println(matcher3.find()); //Выводится значение true
    }
}
