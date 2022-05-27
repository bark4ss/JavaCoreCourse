package demo;

import java.util.Objects;

public class Book {
    private int price;
    private String name;

    public Book() {
    }

    public Book(int price, String name) {
        this.price = price;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.join(" : ","Name: " + this.name,"Price: " + this.price);
    }
}
