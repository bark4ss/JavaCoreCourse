package demo;

public class IfElseConditionAppl {
    public static void main(String[] args) {
        int a = 4;
        switch (a) {
            case 3: {
                System.out.println("Three");
                System.out.println("T");
                break;
            }
            case 4,5:
                System.out.println("Five");break;
            case 7:
                break;
            default:
                System.out.println("Default");
        }
    }
}
