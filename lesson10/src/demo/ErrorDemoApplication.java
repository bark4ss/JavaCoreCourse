package demo;

public class ErrorDemoApplication {

    static int counter = 0;

    public static void main(String[] args) {
        invokeStackOutOfMemory(2_111_111_111);
    }

    private static void invokeStackOutOfMemory (long i) {
        ++counter;
        long m = i*2;
        invokeStackOutOfMemory(m);
    }
}
