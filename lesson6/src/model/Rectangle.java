package model;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle (int a, int b) {
        this.sideA = a;
        this.sideB = b;
    }

    @Override
    public int countSquare() {
        return this.sideA*this.sideB;
    }

    public Rectangle (int a, int b, int sideA, int sideB) {
        super(a,b);
        this.sideA = sideA;
        this.sideB = sideB;
    }
}
