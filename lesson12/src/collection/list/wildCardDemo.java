package collection.list;

import java.util.ArrayList;
import java.util.List;

public class wildCardDemo {

    static class Food {}
    static class Fruit extends Food {}
    static class Apple extends Fruit {}

    public static void main(String[] args) {
        /*List<? super Fruit> fruits = new ArrayList<>();
        fruits.add(new Food());     // compile error
        fruits.add(new Fruit());    // compile success
        fruits.add(new Apple());    // compile success

        fruits = new ArrayList<Fruit>(); // compile success
        fruits = new ArrayList<Apple>(); // compile error
        fruits = new ArrayList<Food>(); // compile success
        fruits = new ArrayList<? super Fruit>(); // ошибка компиляции: тип подстановочного знака не может быть создан

        Fruit object = fruits.get(0); // compile error*/

        /*List<? extends Fruit> fruits = new ArrayList<>();
        fruits.add(new Food());     // compile error
        fruits.add(new Fruit());    // compile error
        fruits.add(new Apple());    // compile error

        fruits = new ArrayList<Fruit>(); // compile success
        fruits = new ArrayList<Apple>(); // compile success
        fruits = new ArrayList<Food>(); // compile error
        fruits = new ArrayList<? extends Fruit>(); // ошибка компиляции: тип подстановочного знака не может быть создан

        Fruit object = fruits.get(0);*/    // compile success
    }
}
