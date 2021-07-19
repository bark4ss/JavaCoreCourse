package threaddemo.model;

public class RThread implements Runnable{
    @Override
    public void run() {
        System.out.printf("%s started...  \n", Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s finished...  \n", Thread.currentThread().getName());
    }
}
