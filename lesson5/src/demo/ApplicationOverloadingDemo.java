package demo;

import model.Calculator;

public class ApplicationOverloadingDemo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Integer c = 4;
        int a = 5;
        int b = 6;
        System.out.println(Calculator.multiply(4,5));

    }
}
