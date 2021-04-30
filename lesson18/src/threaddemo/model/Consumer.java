package threaddemo.model;

public class Consumer implements Runnable {

    private Store store;

    public Consumer() {
    }

    public Consumer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            store.get();
        }
    }
}
