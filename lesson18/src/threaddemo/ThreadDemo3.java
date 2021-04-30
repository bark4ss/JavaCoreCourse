package threaddemo;

import threaddemo.model.JThread;

public class ThreadDemo3 {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        JThread myJThread = new JThread("JThread");
        myJThread.start();
        try {
            myJThread.join();
        } catch (InterruptedException e) {
            System.out.printf("%s has been interrupted", myJThread.getName());
        }
        System.out.println("Main thread finished...");
    }
}
