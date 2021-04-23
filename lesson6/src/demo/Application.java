package demo;

import service.Calculator;
import service.Service;

import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type in a size of array: ");
        int sizeArray = scanner.nextInt();
        System.out.print("Please type in a bound of a Random: ");
        int boundRandom = scanner.nextInt();

        Random random = new Random();

        int[] arr1 = new int[sizeArray];
        int[] arr2 = new int[sizeArray];
        int[] arr3;

        for (int i = 0; i < sizeArray; i++) {
            arr1[i] = random.nextInt(boundRandom);
            arr2[i] = random.nextInt(boundRandom) + 1;
        }

        arr3 = getResultArrayBySum(arr1, arr2);
        Service.displayInfo(arr1);
        Service.displayInfo(arr2);
        Service.displayInfo(arr3);

        scanner.close();
    }

    private static int[] getResultArrayBySum(int[] array1, int[] array2) {
        Calculator calculator = new Calculator();
        int[] result = new int[array1.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = calculator.countSum(array1[i], array2[i]);
        }
        return result;
    }
}
