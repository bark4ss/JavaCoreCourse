package model;

public class Person {
    private int age;
    private int weight;
    private String name;
    private boolean isMarried;

    public Person() {
    }

    public Person(int age, int weight, String name, boolean isMarried) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.isMarried = isMarried;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }
}
