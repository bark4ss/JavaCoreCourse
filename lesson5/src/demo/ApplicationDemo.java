package demo;

public class ApplicationDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(5);
        person.setName("Mike");
        person.displayInfo();
        Person person2 = new Person(12, "Vlad");
        person2.displayInfo();
        int result = Person.sum(2,3);
        System.out.println(result);
        int max = Math.max(2,3);
        System.out.println();
    }
}
