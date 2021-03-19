package lesson9;

public class Book {
    private int price;
    private String name;

    public Book() {
    }

    public Book(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.join(" : ","Name: " + this.name,"Price: " + this.price);
    }
}
