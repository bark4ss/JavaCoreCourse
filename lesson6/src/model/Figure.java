package model;

public abstract class Figure {
    private int a;
    private int b;

    public Figure() {}

    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract int countSquare();

    public void displayInfo() {
        System.out.println(this.a + " "  + this.b);
    }
}
