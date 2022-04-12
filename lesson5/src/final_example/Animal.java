package final_example;

public class Animal {
     final String name;
     int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public final int compute() {
        return 5;
    }

    public int compute(int a) {
        return a;
    }
}
