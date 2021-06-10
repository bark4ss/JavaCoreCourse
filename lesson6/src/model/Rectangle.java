package model;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle (int a, int b) {
        super(a, b);
    }

    public Rectangle (int a, int b, int sideA, int sideB) {
        super(a,b);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int countSquare() {
        return 0;
    }
}
