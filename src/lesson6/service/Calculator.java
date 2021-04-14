package lesson6.service;

public class Calculator {

    public int countSum(int value1, int value2) {
        return value1 + value2;
    }

    public int countSubtraction(int value1, int value2) {
        return value1 - value2;
    }

    public int countMultiply(int value1, int value2) {
        return value1 * value2;
    }

    public double countDivision(int value1, int value2) {
        return (double) value1 / value2;
    }

    public int countSquare(int value1) {
        return value1 * value1;
    }

    public double countSquareRoot(int value1) {
        return Math.sqrt(value1);
    }
}
