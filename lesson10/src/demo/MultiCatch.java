package demo;

public class MultiCatch {
    public static void main(String[] args) {
        int[] arr = new int[10];
        try {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i;
            }
        } catch (ArithmeticException e) {
            System.out.println("divide by 0: " + e);
        } catch (Exception e) {
            System.out.println("Catch block");
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println("something goes wrong" + e);
        } finally {
            System.out.println("Final block");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }
}
