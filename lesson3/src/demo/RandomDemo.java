package demo;

import java.util.Arrays;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(9) + 1;
        int [] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();
        Arrays.sort(arr);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
}
