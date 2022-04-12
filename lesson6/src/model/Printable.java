package model;

public interface Printable {

    int LEFT = 1;

    void print();

    default void doSomething(){
        todo();
    }

    private void todo(){
        System.out.println("TODO");
    }
}
