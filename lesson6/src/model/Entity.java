package model;

public class Entity {

    private static String entityTest;

    static {
        System.out.println("start static block Entity");
        entityTest = "EntityTest";
        System.out.println("end static block Entity");
    }

    private int id;

    {
        System.out.println("start block Entity");
        this.id = 5;
        System.out.println("end block Entity");
    }

    public Entity() {
        System.out.println("start empty constructor Entity");
    }

    public Entity(int id) {
        System.out.println("start a constructor Entity");
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                '}';
    }

    public void displayInfo() {
        System.out.println("Entity{" +
                "id=" + id +
                '}');
    }

    public Integer getNumber(int number){
        return number;
    }
}
