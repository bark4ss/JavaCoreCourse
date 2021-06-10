package demo;

public class Person {
    private String name;
    private int age;
    private static int counter;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }
}
