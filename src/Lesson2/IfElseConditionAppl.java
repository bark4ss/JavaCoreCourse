package Lesson2;

public class IfElseConditionAppl {
    public static void main(String[] args) {
        int countOfdevelopers = 7;
        switch (countOfdevelopers) {
            case 1 :
                System.out.println(countOfdevelopers + " программист");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println(countOfdevelopers + " программиста");
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println(countOfdevelopers + " программистов");
                break;
            default:
                System.out.println("More then 10 developers");
        }
    }
}
