package lesson12.collection;

import java.util.Comparator;

public class ComparatorPersonBaName implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
