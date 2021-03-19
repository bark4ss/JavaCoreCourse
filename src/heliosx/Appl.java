package heliosx;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class Appl {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3,2,1,2,7);
        System.out.println(getMinimumUniqueSum(arr));
    }
    public static int getMinimumUniqueSum(List<Integer> arr) {
        Set<Integer> arrUnique = new HashSet<>();
        arrUnique.add(arr.get(0));
        for(int i = 1; i<arr.size();i++) {
            int temp = arr.get(i);
            while(arrUnique.contains(temp)) {
                temp++;
            }
            arrUnique.add(temp);
        }

        return arrUnique.stream().reduce(0, Integer::sum);
    }
}
