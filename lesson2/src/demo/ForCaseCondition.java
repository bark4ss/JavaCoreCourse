package demo;

public class ForCaseCondition {
    public static void main(String[] args) {
        for (int a=5, b=7 ;a<=10 || b>0 ;b-=2 ) {
            //System.out.println(a + " " + b);
            if (a==9) {
                //System.out.println("return from loop");
                break;
            }
            a++;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
