package threaddemo.model;

public class CounterThread implements Runnable {

    private volatile CommonResource commonResource;

    public CounterThread(CommonResource resource) {
        this.commonResource = resource;
    }

    @Override
    public void run() {
    commonResource.synchronizedIncrement();
    }
}
