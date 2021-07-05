package model;

public class AdvancedPhone {

    private String name;
    private String company;
    private int price;

    public AdvancedPhone(String name, String comp, int price){
        this.name=name;
        this.company=comp;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
    public String getCompany() { return company; }
}
