package STRIVER.D1_Arrays.A1_Easy;

// Second-Largest Element in an Array without sorting
// https://practice.geeksforgeeks.org/problems/second-largest3735/1

public class A2_Max2Element {
    public static void main(String[] args) {
        int[] A = {1, 8, 101, 7, 56, 90};
        System.out.println(secondLargest(A, A.length));
        System.out.println(secondLargestEA(A, A.length));
    }

    static int secondLargest(int[] arr, int n) {
        int max = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        int max2 = 0;
        for (int i=0; i<n; i++) {
            if (arr[i] != max && arr[i] > max2)
                max2 = arr[i];
        }

        return max2;
    }

    static int secondLargestEA(int[] arr, int n) {
        int i, first, sec;
        first = sec = -1;

        if (n < 2)
            return sec;

        for (i=0; i<n; i++) {
            if (arr[i] > first) {
                sec = first;
                first = arr[i];
            } else if (arr[i] > sec && arr[i] != first) {
                sec = arr[i];
            }
        }
        return sec;
    }
}
