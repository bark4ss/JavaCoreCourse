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

    public void turnOn(int a, int b) {
        if(a == b) {
            System.out.println("Включили");
        } else {
            resource--;
            System.out.println("Resource: " + resource);
            if(resource == 0) {
                System.out.println("Комп сгорел");

            } else {
                Random random = new Random();
                int randomNum = random.nextInt(5);
                turnOn(a,randomNum);
            }

        }
    }

    public void turnOff() {
    }
}