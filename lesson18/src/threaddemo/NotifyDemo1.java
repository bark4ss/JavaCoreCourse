package threaddemo;

import threaddemo.model.Consumer;
import threaddemo.model.Producer;
import threaddemo.model.Store;

public class NotifyDemo1 {
    public static void main(String[] args) {
        Store store = new Store();
        Producer producer = new Producer(store);
        Consumer consumer = new Consumer(store);
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
