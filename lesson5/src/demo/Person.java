package demo;

public class Person {
    private int age;
    private String name;
    private static int counter;

    static {
        counter = 2;
    }

    public Person () {
        counter++;
    }
    public Person (int age1) {
        age = age1;
    }
    public Person (int age2, String name) {
        counter++;
        age = age2;
        this.name = name;
    }

    public void setAge (int age) {
        if (age < 0) {
            this.age = 0;
            System.out.println(this.age);
            System.out.println(this.name);
        } else {
            this.age = age;
        }
    }

    public int getAge () {
        return this.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public int getCounter () {
        return counter;
    }

    public void displayInfo () {
        System.out.println("Person:" + counter + " age: " + this.age + " : " + "name: " + this.name);
    }

    public static int sum (int a, int b) {
        return a+b;
    }

    public static int sum (int a, int b, int c) {
        return a+b+c;
    }

    public static int sum (int... a) {
        int sum = 10;
        for (int x : a) {
            sum=sum + x;
        }
        return sum;
    }

    public static double sum (double a, double b) {
        return a+b;
    }
}
