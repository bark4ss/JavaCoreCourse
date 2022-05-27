package threaddemo.model;

public class CounterThread implements Runnable {

    private final CommonResource commonResource;

    public CounterThread(CommonResource resource) {
        this.commonResource = resource;
    }

    @Override
    public void run() {
        try {
            commonResource.synchronizedIncrement();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
