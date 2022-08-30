package STRIVER.D1_Arrays.A1_Easy;

// Largest Element in array
// https://practice.geeksforgeeks.org/problems/largest-element-in-array4009/0

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
