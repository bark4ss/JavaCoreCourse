package inxeritance;

public class InxDemo {
    public static void main(String[] args) {
        Person person = new Person("Name", 55);
        Employee employee = new Employee("Name2", 66, "Dev", 100);
        System.out.println(person.getName());
        System.out.println(employee.getName());
        employee.setName("Name22");
        System.out.println(employee.getName());
        person.display();
        employee.display();
        System.out.println(employee);
        System.out.println(employee.getRandomNumber(10));
        System.out.println(employee.getRandomNumber(10, 20));
        Person p = new Employee("N", 4, "job",35);
        p.display();
        if(employee.isValid(15)) {
            System.out.println(employee);
        }
    }
}
