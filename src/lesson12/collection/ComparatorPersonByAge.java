package lesson12.collection;

import java.util.Comparator;

public class ComparatorPersonByAge implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge() - o2.getAge();
    }
}
