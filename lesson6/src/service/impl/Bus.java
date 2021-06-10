package service.impl;

import service.Moveable;
import service.Transport;

public class Bus extends Transport implements Moveable {
    @Override
    public void moveRight() {
        System.out.println("Автобус поворачивает вправо.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Автобус поворачивает влево.");
    }
}
