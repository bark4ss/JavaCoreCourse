package demo;

public class ExclDemo2 {
    public static void main(String[] args) {
        subroutine();
    }

    public static void subroutine() {
        int b = 0;
        try {
            int a = 0;
            b = 42 / a;
            b= 6;
            System.out.println(b);
        } catch (Exception e) {
            b = 5;
            System.out.println("divide by 0" + b);
        }

        System.out.println(b);


    }
}
