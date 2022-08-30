package STRIVER.D1_Arrays.A1_Easy;

// Rotate an Array by 1 place or k places
// https://leetcode.com/problems/rotate-array/

import java.util.Arrays;

public class A5_RotateArray {
    public static void main(String[] args) {
        int n=3;
        int[] arr = {1,2,3,4,5};
        rotateOne(arr);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{1,2,3,4,5};
        rotateK_BF(arr, n);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{1,2,3,4,5};
        rotateK_TA(arr, n);
        System.out.println(Arrays.toString(arr));

        arr = new int[]{1,2,3,4,5,6,7};
        rotateK_RA(arr, n);
        System.out.println(Arrays.toString(arr));
    }

    static void rotateOne(int[] nums) {
        // Left Rotate
        int n = nums.length;
        int temp = nums[0];
        for (int i=0; i<n-1; i++) {
            nums[i] = nums[i+1];
        }
        nums[nums.length-1] = temp;
    }

    static void rotateK_BF(int[] nums, int k) {
        // Right Rotate
        // Brute Force
        // Poor Time Complexity - O(N*K)
        // Optimized Space - O(1) [No new arrays created]
        int n = nums.length;
        while (k > 0) {
            int temp = nums[nums.length-1];
            for (int i=n-1; i>0; i--) {
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
            k--;
        }
    }

    static void rotateK_TA(int[] nums, int k) {
        // Left Rotate
        // Better approach
        // Optimized Time - O(N) [3 separate for loops]
        // Temp array - O(K) [k elements in temp array]
        int n = nums.length;

        if (n==0)
            return;

        k = k % n;
        if (k > n)
            return;

        int[] temp = new int[k];

        for (int i=0; i<k; i++)
            temp[i] = nums[i];

        for (int i=0; i<n-k; i++)
            nums[i] = nums[i+k];

        for (int i=n-k; i<n; i++)
            nums[i] = temp[i-n+k];
    }

    static void reverse(int[] nums, int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    static void rotateK_RA(int[] nums, int k) {
        // Reversal Algorithm: BEST APPROACH
        // RIGHT: [Reverse the first n-k elements] --> [Reverse the last k elements] --> [Reverse the whole array]
        // LEFT:  [Reverse the first k elements] --> [Reverse the last n-k elements] --> [Reverse the whole array]
        // Optimized Time - O(N) [Traversing the array partially or wholly 3 times separately]
        // Optimized Space - O(1) [No extra array is created]
        int n = nums.length;
        if (n <= 1)
            return;
        k = k % n;
        if (k > n)
            return;
        // Reverse the first n-k elements
        reverse(nums, 0, n-k-1);

        // Reverse the last k elements
        reverse(nums, n-k, n-1);

        // Reverse the whole array
        reverse(nums, 0, n-1);
    }
}
