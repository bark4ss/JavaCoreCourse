package threaddemo;

public class DaemonThreadDemo1 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            int count = 0;
            while (true) {
                count++;
                try {
                    System.out.println("inside try"+ count);
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } finally {
                    System.out.println("finally executed"+ count);
                }
            }
        });
        t.setDaemon(true);
        t.start();

        Thread.currentThread().sleep(10000);
        System.out.println("main thread exited");
    }
}
