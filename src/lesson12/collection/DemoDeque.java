package lesson12.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DemoDeque {
    public static void main(String[] args) {
        Deque<String> states = new ArrayDeque<>();
        states.add("Germany");
        states.addFirst("France");
        states.push("Great Britain");
        states.addLast("Spain");
        states.add("Italy");

        String sFirst = states.getFirst();
        System.out.println(sFirst);

        String sLast = states.getLast();
        System.out.println(sLast);

        for (String state:states) {
            System.out.println(state);
        }
        System.out.println("==================");
        while (states.peek()!=null) {
            System.out.println(states.pop());
        }
        System.out.println("==================");
        for (String state:states) {
            System.out.println(state);
        }
    }
}
