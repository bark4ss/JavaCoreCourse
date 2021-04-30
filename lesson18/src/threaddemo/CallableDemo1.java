package threaddemo;

import threaddemo.model.FactorialTask;

import java.util.concurrent.*;

public class CallableDemo1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        FactorialTask task = new FactorialTask(5);
        Future<Integer> future = executorService.submit(task);
        executorService.shutdown();
        System.out.println(future.get().intValue());

    }
}
