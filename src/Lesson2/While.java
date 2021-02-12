package Lesson2;

public class While {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("n=" + n);
            n--;
        }
        while (n>0) ;
        System.out.println("==============");

        while (n<10) {
            if(n==5) {
                n++;
                continue;
            }
            System.out.println("n=" + n);
            n++;
        }
    }
}
