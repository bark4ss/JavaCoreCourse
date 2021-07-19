package threaddemo;

import threaddemo.model.JThread;

public class ThreadDemo2 {
    public static void main(String[] args) {
        //https://www.examclouds.com/java/java-core-russian/thread-state
        System.out.println("Main thread started...");
        JThread myJThread = new JThread("JThread");
        System.out.printf("Current state: %s \n",myJThread.getState());
        myJThread.start();
        System.out.println("Main thread finished...");

    }
}
