package model;

public class Triangle extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    @Override
    public int countSquare() {
        return this.sideA*this.sideB/2;
    }
}
