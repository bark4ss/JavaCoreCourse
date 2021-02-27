package Lesson5.comp;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private String cpu;
    private String ram;
    private String harddisk;
    private int resource;

    public Computer() {

    }

    public Computer(String cpu, String ram, String harddisk, int resource) {
        this.cpu = cpu;
        this.ram = ram;
        this.harddisk = harddisk;
        this.resource = resource;
    }

    public int getResource() {
        return resource;
    }

    public void displayInfo() {
        System.out.println("Процессор: " + cpu + "; Оперативная память: " + ram + "; Жесткий диск: " + harddisk);
    }

    public void turnOn() {
        Random rand = new Random();
        int a = rand.nextInt(2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Для включения введите 0 или 1 ");
        int b = scanner.nextInt();

        if (resource == 0) {
            System.out.println("Комп сгорел");
        } else {
            if (a == b) {
                System.out.println("Включаю");
            } else {
                System.out.println("Выключаю");
                turnOff();
            }
        }

    }

    public void turnOff() {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Для выключения введите 0 или 1 ");
        int b = scanner.nextInt();

        int a = rand.nextInt(2);
        if (a == b) {
            System.out.println("Выключаю");
        } else {
            resource--;
        }
    }
}