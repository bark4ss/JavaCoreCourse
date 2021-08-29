package testappl;

import java.util.Arrays;

public class ArraysToStringDemo {
    public static void main(String[] args) {
        int[] array = {1, 4, 6, 3, 8};
        System.out.println(Arrays.toString(array));
        int[][] array2d = {{1,4},{6,3,8}};
        System.out.println(array2d[0]);
        System.out.println(Arrays.toString(array2d));
        System.out.println(Arrays.deepToString(array2d));
    }
}
