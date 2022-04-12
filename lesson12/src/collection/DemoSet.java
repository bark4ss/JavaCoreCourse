package collection;

import java.util.*;

public class DemoSet {
    public static void main(String[] args) {
        Set<String> states = new HashSet<>();
        states.add("Germany");
        states.add("France");
        states.add("Great Britain");
        states.add("Spain");
        states.add("Italy");

        boolean isAdded = states.add("Germany");
        System.out.println(isAdded);
        System.out.printf("Set contains %d elements \n", states.size());

        for (String state:states) {
            System.out.println(state);
        }

        ComparatorPersonByName comparator = new ComparatorPersonByName();
        ComparatorPersonByAge comparatorPersonByAge = new ComparatorPersonByAge();
        Set<Person> persons = new TreeSet<>(comparator.thenComparing(comparatorPersonByAge));
        persons.add(new Person("Tom", 26));
        persons.add(new Person("Alice", 26));
        persons.add(new Person("Alice", 25));
        persons.add(new Person("Kate", 31));
        persons.add(new Person("Nick", 31));
        persons.add(new Person("Nick", 32));
        persons.add(new Person("Robert", 32));

        boolean isPersonAdded = persons.add(new Person("Robert", 32));
        System.out.println(isPersonAdded);

        for (Person person:persons) {
            System.out.printf("Name: %s , Age: %d \n",person.getName(), person.getAge());
        }
    }
}
