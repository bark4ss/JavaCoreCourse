package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
//https://metanit.com/java/tutorial/5.1.php
//https://metanit.com/java/tutorial/5.2.php
public class DemoAppl1 {
    public static void main(String[] args) {

        List<? extends Number> temp = List.of(5,6,7);
        temp.get(1);
        List<String> peoples = new ArrayList<>();
        peoples.add("Tom");
        peoples.add("Alice");
        peoples.add("Bob");
        peoples.add(1,"Kate");
        System.out.printf("ArrayList has %d elements \n", peoples.size());
        peoples.add(4,"Sam");
        System.out.println(peoples.get(1));
        peoples.set(1,"Robert");
        peoples.add("Robert");
        System.out.printf("ArrayList has %d elements \n", peoples.size());
        System.out.println("===========================================");
        for (String people:peoples) {
            System.out.println(people);
        }
        System.out.println("===========================================");
        if(peoples.contains("Tom")) {
            System.out.println("peoples contains Tom");
        }
        System.out.println("====================!");
        System.out.printf("ArrayList has %d elements \n", peoples.size());
        peoples.remove("Robert");
        System.out.printf("ArrayList has %d elements \n", peoples.size());
        System.out.println("====================!");
        peoples.remove(1);

        for (String people:peoples) {
            System.out.println(people);
        }
        System.out.println("===================");
        Object[] peopleArray = peoples.toArray();
        for (Object person:peopleArray) {
            System.out.println(person);
        }
    }
}
