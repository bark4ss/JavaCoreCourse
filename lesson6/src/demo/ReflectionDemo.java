package demo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionDemo {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        Field[] fields = Person.class.getDeclaredFields();
        for (Field field: fields) {
            field.setAccessible(true);
            System.out.println(field.getName());
            System.out.println(field.getType());
            System.out.println(field.get(new Person()));
            System.out.println("===================");
        }

        Method[] methods = Person.class.getDeclaredMethods();
        for (Method method: methods) {
            method.setAccessible(true);
            method.invoke(new Person());
        }

        Person demo = new Person("Name2", 34);
        Person demo2 = new Person();
        System.out.println(Person.getCounter());
        Person.setCounter(5);
        System.out.println(Person.getCounter());

    }
}
