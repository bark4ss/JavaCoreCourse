package demo;

public class While {
    public static void main(String[] args) {
        int a = 9;
        do {
            System.out.println(a);
            a--;
        }
        while (a > 9);

        int b = 11;
        while (b < 20) {
            if (b == 15) {
                System.out.println(b);
                break;
            }
            System.out.println(b);
            b++;
        }

    }
}
