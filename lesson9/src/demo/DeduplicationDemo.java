package demo;

import java.lang.reflect.Field;

public class DeduplicationDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InterruptedException {
        char[] chars = {'T', 'o', 'p', 'J', 'a', 'v', 'a'};
        String[] strings = {new String(chars), new String(chars)};
        Field value = String.class.getDeclaredField("value");
        value.setAccessible(true);

        System.out.println("Хеш первого объекта: " + value.get(strings[0]));
        System.out.println("Хеш второго объекта: " + value.get(strings[1]));

        System.gc();
        System.out.println("Запустили сборщик мусора");
        Thread.sleep(100);

        System.out.println("Хеш первого объекта: " + value.get(strings[0]));
        System.out.println("Хеш второго объекта: " + value.get(strings[1]));
    }
}
