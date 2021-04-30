package threaddemo;

import threaddemo.model.FactorialTask;

import java.util.concurrent.*;

public class CallableDemo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FactorialTask task = new FactorialTask(5);
        FutureTask<Integer> futureTask = new FutureTask<>(task);
        new Thread(futureTask).start();
        System.out.println(futureTask.get().intValue());

    }
}
