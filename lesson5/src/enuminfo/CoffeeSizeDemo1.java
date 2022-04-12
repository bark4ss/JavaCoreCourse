package enuminfo;

public class CoffeeSizeDemo1 {
    public static void main(String[] args) {
        String cup = "BIG";
        CoffeeSize coffeeSize = CoffeeSize.valueOf(cup);
        if (coffeeSize == CoffeeSize.BIG) {
            System.out.println(coffeeSize);
        }
    }
}
