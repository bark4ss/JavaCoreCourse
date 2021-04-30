package threaddemo.model;

public class CounterThread implements Runnable {

    private CommonResource commonResource;

    public CounterThread(CommonResource resource) {
        this.commonResource = resource;
    }

    @Override
    public void run() {
        synchronized (commonResource) {
            commonResource.setCounter(1);
            for (int i = 0; i < 5; i++) {
                System.out.printf("%s %d \n", Thread.currentThread().getName(), commonResource.getCounter());
                commonResource.increment();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Thread has been interrupted");
                }
            }
        }
    //commonResource.synchronizedIncrement();
    }
}
