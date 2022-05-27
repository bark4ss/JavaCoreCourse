package demo;

public class RuntimeDemoApplication {
    public static void main(String[] args) {
        double a = 5;
        System.out.println();
    }

    private static int countLength(String line) {
        if(line == null) return -1;
        return line.length();
    }
}
