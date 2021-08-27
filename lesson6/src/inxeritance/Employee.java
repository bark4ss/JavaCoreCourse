package inxeritance;

import java.util.Random;

public class Employee extends Person {
    private String job;
    private int salary;

    public Employee() {

    }

    public Employee(String name, int age, String job, int salary) {
        super(name, age);
        this.job = job;
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.printf("Info: age: %d, name: %s, job: %s, salary: %d\n", getAge(), getName(), this.job, this.salary);
    }

    @Override
    public String toString() {
        return "My code";
    }

    public int getRandomNumber(int a) {
        return new Random().nextInt(a);
    }

    public int getRandomNumber(int a, int b) {
        return new Random().nextInt(b - a) + a;
    }

    public boolean isValid(int number) {
        if(number > 14) {
            throw new ArithmeticException();
        }
        return true;
    }
}
