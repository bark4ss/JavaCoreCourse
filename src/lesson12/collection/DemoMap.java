package lesson12.collection;

import java.util.*;

public class DemoMap {
    public static void main(String[] args) {
        Map<Integer, String> states = new HashMap<>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");

        String second = states.get(2);
        System.out.println(second);

        Set<Integer> keys = states.keySet();
        for (Integer key:keys) {
            System.out.println(key);
        }
        Collection<String> values = states.values();
        for (String value:values) {
            System.out.println(value);
        }

        states.replace(1, "Poland");
        states.remove(2);

        for (Map.Entry<Integer, String> item:states.entrySet()) {
            System.out.printf("Key: %d  Value: %s \n", item.getKey(),item.getValue());
        }

        Map<Person, String> persons = new TreeMap<>();
        persons.put(new Person("Tom",32), "1240i54");
        persons.put(new Person("Bob",26), "1564i55");
        persons.put(new Person("Nick",28), "4540i56");
        persons.put(new Person("Den",28), "4540i57");
        persons.put(new Person("Tven",27), "4540i59");

        for (Map.Entry<Person, String > item:persons.entrySet()) {
            System.out.printf("Key: %s  Value: %s \n", item.getKey().getName() + item.getKey().getAge(),item.getValue());
        }
    }
}
