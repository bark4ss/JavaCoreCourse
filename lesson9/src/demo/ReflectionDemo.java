package demo;

import java.lang.reflect.Field;

public class ReflectionDemo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Book book = new Book(14,"Hi");
        Field field = Book.class.getDeclaredField("price");
        field.setAccessible(true);
        field.set(book,15);
        System.out.println(field.get(book));
    }
}
