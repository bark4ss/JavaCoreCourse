package demo;

import java.util.Random;
import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type number: ");
        int a = sc.nextInt();
        Random random = new Random();

        while (a > 0) {
            int r = random.nextInt(13) + 5;
            System.out.println(r);
            a--;
        }

    }
}
