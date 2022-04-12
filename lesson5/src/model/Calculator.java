package model;

public class Calculator {

    private int a = 5;

    public static int multiply (int a, int b) {
        System.out.println("Static");
        return a*b;
    }

    public static int multiply (long a, long b) {
        return (int) (a*b);
    }

    public int multiply (double a, double b) {
        System.out.println("Initial");
        return (int) (a*b)*this.a;
    }

    public int divide (int a, int b) {
        return a/b;
    }

    public int compute(byte a) {
        return a;
    }

    public int compute(double a) {
        return (int) a;
    }

    public int compute(Object a) {
        return (Integer) a;
    }

    public int compute(long a) {
        return (int) a;
    }

    public int compute(int a, int b) {
        System.out.println("Two params");
        return a*b;
    }

    public int compute(Number a, Number b, Number c) {
        System.out.println("Three Number params");
        return a.intValue()*b.intValue()*c.intValue();
    }

    public int compute(double a, double b, double c) {
        System.out.println("Three double params");
        return (int) (a*b*c);
    }

    public int compute(byte a, double b, double c) {
        System.out.println("Three long params");
        return (int) (a*b*c);
    }

    public int compute(Integer a, Integer b, Integer c) {
        System.out.println("Three Integer params");
        return (int) (a*b*c);
    }

    public int compute(Long a, Integer b, Integer c) {
        System.out.println("Three Integer params");
        return (int) (a*b*c);
    }

    public int compute(int... arg) {
        System.out.println("N params");
        int result = 1;
        for (int a: arg){
            result*=a;
        }
        return result;
    }
}
