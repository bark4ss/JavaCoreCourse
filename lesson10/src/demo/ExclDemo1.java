package demo;

public class ExclDemo1 {
    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 42 / a;
            int c[] = {1};
            c[0] = 5;

        } catch (ArithmeticException | IndexOutOfBoundsException exc) {
            System.out.println("divide by zero:" + exc);
        } catch (RuntimeException exc) {
            System.out.println(exc);
        } catch (Exception e) {
            System.out.println("exception " + e);
        }
        finally {
            System.out.println("Finally");
        }

    }
}
