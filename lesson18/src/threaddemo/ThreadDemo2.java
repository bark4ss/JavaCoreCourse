package threaddemo;

import threaddemo.model.JThread;

public class ThreadDemo2 {
    public static void main(String[] args) {
        System.out.println("Main thread started...");
        JThread myJThread = new JThread("JThread");
        myJThread.start();
        System.out.println("Main thread finished...");
    }
}
