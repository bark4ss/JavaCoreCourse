package demo;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "V"};
        int length = arr.length;
        String element = arr[1];
        arr[1] = "D";
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //System.out.println(length);
        //System.out.println(element);
        int[] numbers = {9,5,3,7,8,7};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("----------------");
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        for (int a: numbers) {
            System.out.print(a + " ");
        }
    }
}
