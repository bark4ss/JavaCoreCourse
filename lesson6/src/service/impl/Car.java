package service.impl;

import service.Moveable;

public class Car implements Moveable {
    @Override
    public void moveRight() {
        System.out.println("Машина поворачивает вправо.");
    }

    @Override
    public void moveLeft() {
        System.out.println("Машина поворачивает влево.");
    }

    @Override
    public void moveUp() {
        System.out.println("Машина двигается вперед.");
    }
}
