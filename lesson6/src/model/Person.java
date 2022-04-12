package model;

public class Person extends Entity {
    private static String personTest;
    private int age;
    protected int weight;
    String name;
    private boolean isMarried;

    static {
        System.out.println("start static block Person");
        personTest = "personTest";
        System.out.println("end static block Person");
    }

    {
        System.out.println("start block Person");
        this.age = 18;
        System.out.println("end block Person");
    }

    public Person() {
        super();
        System.out.println("start empty constructor Person");
    }

    public Person(int age, int weight, String name, boolean isMarried) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.isMarried = isMarried;
    }

    public Person(int id, int age){
        super(id);
        System.out.println("start a constructor Person");
        this.age = age;
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

    public void displayInfo () {
        System.out.println("Hello Person" + this.name);
    }

     public Integer getNumber(int number1){
        return number1;
    }
}
