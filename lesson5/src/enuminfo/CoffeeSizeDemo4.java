package enuminfo;

public class CoffeeSizeDemo4 {
    public static void main(String[] args) {
        for (CoffeeSize4 c : CoffeeSize4.values()) {
            System.out.println(c);
            System.out.println("Ordinal" + c.ordinal());
            System.out.println("LifCode" + c.getLidCode());
            System.out.println("Ml" + c.getMl());
            System.out.println("--------------------");
        }
    }
}
