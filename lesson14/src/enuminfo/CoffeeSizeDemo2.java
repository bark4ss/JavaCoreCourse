package enuminfo;

public class CoffeeSizeDemo2 {
    public static void main(String[] args) {
        CoffeeSize coffeeSize = CoffeeSize.HUGE;
        String result = switch (coffeeSize) {
            case BIG->
                "Дайте мне большую чашку кофе!";
            case HUGE->
                "Дайте мне огромную чашку кофе!";
            case OVERWHELMING->
                "Дайте мне громадную чашку кофе!";
        };
        System.out.println(result);
    }
}
