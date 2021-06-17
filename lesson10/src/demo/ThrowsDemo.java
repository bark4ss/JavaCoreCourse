package demo;

public class ThrowsDemo {
    public static void main(String[] args) {
        try {
            procedure();
        } catch (IllegalAccessException e) {
            System.out.println("caught " + e);
        }
    }

    static void procedure() throws IllegalAccessException {
        System.out.println(" inside procedure");
        throw new IllegalAccessException("demo");
    }
}
