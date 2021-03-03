package Lesson6.service;

public class Service {

    public static void displayInfo(int[] array) {
        for (int element : array) {
            System.out.printf("%d ", element);
        }
        System.out.println();
    }
}
