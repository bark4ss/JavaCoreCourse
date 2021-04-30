package threaddemo.model;

import java.util.concurrent.Callable;

public class FactorialTask implements Callable<Integer> {

    private int number;

    public FactorialTask() {
    }

    public FactorialTask(int number) {
        this.number = number;
    }

    @Override
    public Integer call() {
        int fact = 1;
        // ...
        for(int count = number; count > 1; count--) {
            fact = fact * count;
        }

        return fact;
    }
}
