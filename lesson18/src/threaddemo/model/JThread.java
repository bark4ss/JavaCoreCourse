package threaddemo.model;

public class JThread extends Thread{

    private long time;

    public JThread(String name) {
        super(name);
    }

    public JThread(String name, long t) {
        super(name);
        this.time = t;
    }

    @Override
    public void run() {
        System.out.printf("%s started...  \n", Thread.currentThread().getName());
        System.out.printf("Current state: %s\n",Thread.currentThread().getState());
        try {
            Thread.sleep(this.time);
        } catch (InterruptedException ex) {
            System.out.println("Thread has been interrupted");
        }
        System.out.printf("%s finished...  \n", Thread.currentThread().getName());
    }

}
