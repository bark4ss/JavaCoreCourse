package threaddemo;

import java.time.Instant;
import java.time.LocalDateTime;

public class TreadExample {
    public static void main(String[] args) {
        long count=0;
        int max = Integer.MAX_VALUE;
        Instant start = Instant.now();
        for(int i = 0;i<max;++i){
            count+=i;
        }
        Instant end = Instant.now();
        System.out.println(end.toEpochMilli()- start.toEpochMilli());
        System.out.println(count);
    }
}
