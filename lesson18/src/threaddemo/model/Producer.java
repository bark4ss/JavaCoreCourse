package threaddemo.model;

public class Producer implements Runnable{

    private Store store;

    public Producer() {
    }

    public Producer(Store store) {
        this.store = store;
    }

    @Override
    public void run() {
        for (int i =0; i<6;i++) {
            store.put();
        }
    }
}
