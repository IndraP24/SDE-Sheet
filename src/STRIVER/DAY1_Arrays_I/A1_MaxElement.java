package STRIVER.DAY1_Arrays_I;

import java.util.Arrays;

public class A1_MaxElement {
    public static void main(String[] args) {
        int[] A = {1, 8, 101, 7, 56, 90};
        System.out.println(largest(A, A.length));
    }

    static int largest(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[n-1];
    }
}
