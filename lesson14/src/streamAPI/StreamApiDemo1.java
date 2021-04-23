package streamAPI;

import java.util.Arrays;

public class StreamApiDemo1 {
    public static void main(String[] args) {
        //https://metanit.com/java/tutorial/10.1.php
        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int count=0;
        for(int i:numbers){

            if(i > 0) count++;
        }
        System.out.println(count);

        long countWithStream = Arrays.stream(numbers).filter(w -> w > 0).count();
        System.out.println(countWithStream);
    }
}
