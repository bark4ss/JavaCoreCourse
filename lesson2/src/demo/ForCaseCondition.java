package demo;

public class ForCaseCondition {
    public static void main(String[] args) {
        int counter = 0;
        for (int a = 0; a <= 10; a++) {
            if (a % 2 == 0) {
                continue;

            }
            System.out.println(a);

        }


    }
}
