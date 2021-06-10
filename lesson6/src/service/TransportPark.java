package service;

public class TransportPark {

    private Moveable moveable;

    public TransportPark(Moveable m) {
        moveable = m;
    }

    public void printMethod() {
        moveable.moveLeft();
        moveable.moveRight();
        moveable.moveUp();
        Moveable.stMethod();
    }
}
