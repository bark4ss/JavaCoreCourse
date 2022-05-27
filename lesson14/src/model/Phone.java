package model;

public class Phone {
    private String name;
    private int price;

    public Phone(String name){
        this.name=name;
    }

    public Phone(int price) {
        this.price = price;
    }

    public Phone(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static boolean test2 (int a) {
        return a > 1;
    }

    public static boolean temp(Phone p){
        return p.getPrice() > 50000;
    }

    public boolean temp2(Phone p){
        return p.getPrice() > 40000;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
