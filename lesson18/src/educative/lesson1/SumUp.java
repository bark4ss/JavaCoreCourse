package educative.lesson1;

public class SumUp {
    private final int startRange;
    private final int endRange;
    private static final int MAX_VALUE = Integer.MAX_VALUE;
    private long count = 0;

    public SumUp(int start, int end) {
        this.startRange = start;
        this.endRange = end;
    }

    public void add() {
        for (int i = startRange; i < endRange; ++i) {
            count += i;
        }
    }

    public static void oneThread() {
        long start = System.currentTimeMillis();
        SumUp sumUp = new SumUp(1, MAX_VALUE);
        sumUp.add();
        long end = System.currentTimeMillis();
        System.out.println("One Thread-Count:" + sumUp.count + " Time: " + (end - start));
    }

    public static void twoThread() throws InterruptedException {
        long start = System.currentTimeMillis();
        SumUp firstSumUp = new SumUp(1, MAX_VALUE / 2);
        SumUp secondSumUp = new SumUp(MAX_VALUE / 2, MAX_VALUE);

        Thread thread1 = new Thread(firstSumUp::add);
        Thread thread2 = new Thread(secondSumUp::add);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        long total = firstSumUp.count + secondSumUp.count;
        long end = System.currentTimeMillis();
        System.out.println("Two Threads-Count:" + total + " Time: " + (end - start));
    }

    public static void threeThread() throws InterruptedException {
        long start = System.currentTimeMillis();
        SumUp firstSumUp = new SumUp(1, MAX_VALUE / 3);
        SumUp secondSumUp = new SumUp(MAX_VALUE / 3, (MAX_VALUE / 3) * 2);
        SumUp thirdSumUp = new SumUp((MAX_VALUE / 3) * 2, MAX_VALUE);

        Thread thread1 = new Thread(firstSumUp::add);
        Thread thread2 = new Thread(secondSumUp::add);
        Thread thread3 = new Thread(thirdSumUp::add);

        thread1.start();
        thread2.start();
        thread3.start();

        thread1.join();
        thread2.join();
        thread3.join();
        long total = firstSumUp.count + secondSumUp.count + thirdSumUp.count;
        long end = System.currentTimeMillis();
        System.out.println("Three Threads-Count:" + total + " Time: " + (end - start));
    }

    public static void runTests() throws InterruptedException {
        oneThread();
        twoThread();
        threeThread();
    }
}
