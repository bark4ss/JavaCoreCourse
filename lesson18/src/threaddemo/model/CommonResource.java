package threaddemo.model;

public class CommonResource {

    private int counter;

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void increment() {
        ++counter;
    }

    public void synchronizedIncrement() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s %d \n", Thread.currentThread().getName(), getCounter());
            increment();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
    }
}
