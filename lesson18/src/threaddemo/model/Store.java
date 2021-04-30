package threaddemo.model;

public class Store {
    private int product;

    public synchronized void get () {
        while (product<1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product--;
        System.out.println("Покупатель купил 1 товар");
        System.out.println("Товаров на складе:" + product);
        notify();
    }

    public synchronized void put () {
        while (product>=3) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        product++;
        System.out.println("Производитель добавил 1 товар");
        System.out.println("Товаров на складе:" + product);
        notify();
    }
}
