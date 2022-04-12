package enuminfo;

public enum CoffeeSize2 {
    // 100, 150, 200 передаются в конструктор
    BIG(100, 5), HUGE(150), OVERWHELMING(200, 7);

    private final int ml;
    private final int price;

    CoffeeSize2(int ml) {
        this.ml = ml;
        price = 100;
    }

    CoffeeSize2(int ml, int price) {
        this.ml = ml;
        this.price = price;
    }

    public int getMl() {
        return ml;
    }

    public int getPrice() {
        return price;
    }
}
