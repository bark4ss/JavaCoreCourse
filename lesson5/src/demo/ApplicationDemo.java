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
        int exResult= Person.sum(2,3,5);
        int extraResult = Person.sum(1,2,3,4,5,6);
        double resultDouble = Person.sum(3.5,4.2);
        System.out.println(result);
        System.out.println(exResult);
        System.out.println(extraResult);
        System.out.println(resultDouble);
        int max = Math.max(2,3);
        System.out.println();
    }
}
