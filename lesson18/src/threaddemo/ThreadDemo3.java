package threaddemo;

import threaddemo.model.JThread;

public class ThreadDemo3 {
    public static void main(String[] args) throws InterruptedException {
        //https://www.examclouds.com/java/java-core-russian/method-join
        //https://javarush.ru/groups/posts/1998-upravlenie-potokami-metodih-volatile-i-yield
        System.out.println("Main thread started...");
        JThread worker1 = new JThread("worker-1", 5000);
        JThread worker2 = new JThread("worker-2", 3000);
        JThread worker3 = new JThread("worker-3", 2000);

        worker1.start();
        worker1.join();
        worker2.start();
        worker3.start();


        worker3.join();
        System.out.println("Work is done...");
    }
}
