package threaddemo;

import threaddemo.model.CommonResource;
import threaddemo.model.CounterThread;

public class ThreadDemo6 {
    public static void main(String[] args) {
        CommonResource commonResource = new CommonResource();
        for (int i = 0; i < 5;i++) {
            Thread thread = new Thread(new CounterThread(commonResource));
            thread.setName("Thread" + i);
            thread.start();
        }
    }
}
