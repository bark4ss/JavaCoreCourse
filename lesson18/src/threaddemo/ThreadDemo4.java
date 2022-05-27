package threaddemo;

import threaddemo.model.RThread;

public class ThreadDemo4 {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        RThread myRThread = new RThread();
        Thread myThread = new Thread(myRThread);
        myThread.start();
        System.out.println("Main thread finished...");
    }
}
