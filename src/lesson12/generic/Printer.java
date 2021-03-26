package lesson12.generic;

public class Printer {

    public <T> void print(T[] items) {
        for (T item: items) {
            System.out.println(item);
        }
    }
}
