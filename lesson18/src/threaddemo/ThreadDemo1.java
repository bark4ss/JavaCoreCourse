package threaddemo;

public class ThreadDemo1 {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            System.out.println(i);
        }
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.isAlive());
        System.out.println(thread.isDaemon());
    }
}
