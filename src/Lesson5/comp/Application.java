package Lesson5.comp;

public class Application {

    public static void main(String[] args) {
        Computer computer = new Computer("RYZEN 3 ", "DDR4", "SSD", 3);
        computer.displayInfo();
        while (computer.getResource() > -1) {
            computer.turnOn();
            if(computer.getResource()==0) {
                computer.turnOn();
                break;
            }
        }
    }
}
