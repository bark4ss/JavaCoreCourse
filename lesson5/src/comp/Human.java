package comp;

public class Human {
    private int age;
    private int weight;
    private String name;
    private String lastName;
    private boolean isMarried;

    public Human () {
    }

    public Human (int age) {
        this.age = age;
    }
    public Human (int age, int weight, String name, String lastName) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public void display () {
        System.out.println("Вся информация: " + this.age + " " + this.name + " " + this.lastName);
        System.out.printf("Вся информация: %d %s %s",this.age,this.name,this.lastName);
    }

}
