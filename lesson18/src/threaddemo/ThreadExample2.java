package threaddemo;

import threaddemo.model.SumUpExample;

import java.time.Instant;
import java.util.concurrent.atomic.AtomicLong;

public class ThreadExample2 {
    public static void main(String[] args) throws InterruptedException {
        SumUpExample.runTest();
    }
}
