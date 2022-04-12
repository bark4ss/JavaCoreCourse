package model;

public class Employee extends Person {

    private String job;
    private String name;

    public Employee () {
        super();
        System.out.println("Default Employee");
    }

    public Employee (String name1, String name2) {
        super.setName(name1);
        this.name = name2;


    }

    public Employee (int age, boolean isMarried) {
        super.setAge(age);
        super.setMarried(isMarried);
    }

    public Employee (int age, int weight, String name, boolean isMarried) {
        super(age, weight, name, isMarried);
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        System.out.println(name + " " + name);
        super.setName(name);
    }

    public void displayInfo () {
        System.out.println("Hello Employee" + this.name);
    }
}
