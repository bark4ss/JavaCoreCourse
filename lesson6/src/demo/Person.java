package demo;

public class Person {
    private String name;
    private final String secondName = "second";
    private int age;
    private static int counter;

    public Person() {

    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    private void printInfo() {
        System.out.println("Hello");
    }
}
