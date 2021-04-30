package threaddemo;

public class ThreadDemo5 {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        Runnable runnable = () -> {
            System.out.printf("%s started...  \n", Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("Thread has been interrupted");
            }
            System.out.printf("%s finished...  \n", Thread.currentThread().getName());
        };

        Thread myThread = new Thread(runnable, "MyRThread");
        myThread.start();
        System.out.println("Main thread finished...");
    }
}
