package model;

public class Person {

    int height = 180;
    double weight = 100;
    String name;
    public static String className = "Person class";
    Profession prof;

    public Person () {
        this.height = 190;
        weight = 90;
    }

    public Person (int height) {
        this.height = height;
        System.out.println("Person has been initialized");
    }

    public Person (double weight) {
        this.weight = weight;
        System.out.println("Person has been initialized");
    }

    public Person (String name, Profession prof) {
        this.name = name;
        this.prof = prof;
    }

    public Person (int height, int weight) {
        this.height = height;
        this.weight = weight;
        System.out.println("Person has been initialized");
    }

    public void displayInfo () {
        System.out.println("Info: " + "Height:" + this.height + " ; " + "Weight:" + weight);
    }

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public void displayProfessionName() {
        System.out.println(prof.getName());
    }

    public double getBodyIndex () {

        return height/weight;
    }
}
