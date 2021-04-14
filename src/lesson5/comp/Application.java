package lesson5.comp;

import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число для включения компьютера: ");
        int num = scanner.nextInt();
        Random random = new Random();
        int randomNum = random.nextInt(5);
        Computer comp = new Computer("cpu", "ppu", "mmu" , 3);
        comp.turnOn(num,randomNum);
    }
}
