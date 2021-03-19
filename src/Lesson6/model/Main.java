package Lesson6.model;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(36);
        person.setName("Ivan");
        person.setWeight(79);
        person.setMarried(false);
        Person person1 = new Person(36,78,"Nick", true);
        Printable periodic = new Journal("murzilka", 22);
        //periodic.print();

        Service service = new Service();
        service.displayInfo(periodic);
    }
}
