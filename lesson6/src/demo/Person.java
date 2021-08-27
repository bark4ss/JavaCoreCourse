package demo;

public class Person {
    private String name;
    private final String secondName = "second";
    private int age;
    private static int counter;

    public Person() {
        counter++;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }

    public static int getCounter() {

        return counter;
    }

    public static void setCounter(int counter) {
        Person.counter = counter;
    }

    private void printInfo() {
        System.out.println("Hello");
    }
}
