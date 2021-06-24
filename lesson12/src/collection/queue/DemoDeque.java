package collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;
//https://metanit.com/java/tutorial/5.7.php
public class DemoDeque {
    public static void main(String[] args) {
        Deque<String> states = new ArrayDeque<>();
        states.add("Germany");
        states.addFirst("France"); // добавляем элемент в самое начало
        states.push("Great Britain"); // добавляем элемент в самое начало
        states.addLast("Spain"); // добавляем элемент в конец коллекции
        states.add("Italy");

        // получаем первый элемент без удаления
        String sFirst = states.getFirst();
        System.out.println(sFirst);

        String sLast = states.getLast();
        System.out.println(sLast);

        for (String state:states) {
            System.out.println(state);
        }
        System.out.println("==================");
        //возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null
        //poll - возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null
        while (states.peek()!=null) {
            System.out.println(states.pop());
        }
        System.out.println("==================");
        for (String state:states) {
            System.out.println(state);
        }
    }
}
