package service;

import service.impl.Bus;
import service.impl.Car;

public class Appl {
    public static void main(String[] args) {
        Moveable moveable = new Bus();

        Moveable bike = new Moveable() {
            @Override
            public void moveRight() {
                System.out.println("Мопед поворачивает вправо.");
            }

            @Override
            public void moveLeft() {
                System.out.println("Мопед поворачивает влево.");
            }
        };

        TransportPark trPark = new TransportPark(moveable);
        trPark.printMethod();


    }
}
