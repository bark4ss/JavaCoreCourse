package threaddemo.model;

public class JThread extends Thread{

    public JThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.printf("%s started...  \n", Thread.currentThread().getName());
        System.out.printf("Current state: %s\n",Thread.currentThread().getState());
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s finished...  \n", Thread.currentThread().getName());
    }

}
