package service;

public interface Moveable {

    int RIGHT = 1;
    int LEFT = 2;
    int UP = 3;
    int DOWN = 4;

    void moveRight();

    void moveLeft();

    default void moveUp() {
        doSomething();
        doSomething2();
    }

    private void doSomething() {
        System.out.println("Транспорт двигается вперед.");
    }

    private void doSomething2() {
        System.out.println("Транспорт двигается еще быстрее вперед.");
    }

    static void stMethod () {
        System.out.println("Ничего не двигается.");
    }
}
