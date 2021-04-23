package demo;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        System.out.println("Введите размерность массива NxM");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = 0, m = 0;
        if(scanner.hasNext()) {
            n = scanner.nextInt();
            m = scanner.nextInt();
        }
        scanner.close();
        int[][] mass = new int[n][m];
        for (int i = 0; i< n; i++) {
            for (int j = 0; j < m; j++) {
                mass[i][j] = random.nextInt(9);
            }
        }
        for (int i = 0; i< n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        int max = mass[0][0];
        for (int i = 0; i< n; i++) {
            for (int j = 0; j < m; j++) {
                if(mass[i][j]> max) {
                    max = mass[i][j];
                }
            }
        }
        System.out.println("Максимальное значение: " + max);

        int min = mass[0][0];
        for (int i = 0; i< n; i++) {
            for (int j = 0; j < m; j++) {
                if(mass[i][j]< min) {
                    min = mass[i][j];
                }
            }
        }
        System.out.println("Минимальное значение: " + min);
    }
}
