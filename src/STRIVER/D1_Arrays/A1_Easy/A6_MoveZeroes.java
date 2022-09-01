package STRIVER.D1_Arrays.A1_Easy;

// Given an integer array nums, move all 0's to the end of it
// while maintaining the relative order of the non-zero elements.
// https://leetcode.com/problems/move-zeroes/

import java.util.Arrays;

public class A6_MoveZeroes {
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 3, 12};
        moveZeroes_BF(A);
        System.out.println(Arrays.toString(A));

        A = new int[]{0, 1, 0, 3, 12};
        moveZeroes_OA(A);
        System.out.println(Arrays.toString(A));
    }

    static void moveZeroes_BF(int[] nums) {
        // Brute Force by creating a temp array and storing the non-zero nums
        // Optimal Time: O(N)
        // Temp Array: O(N) Space used due to new array
        int n = nums.length, k=0;
        int[] temp = new int[n];

        for (int num : nums) {
            if (num != 0) {
                temp[k] = num;
                k++;
            }
        }
        while (k < n) {
            temp[k] = 0;
            k++;
        }

        System.arraycopy(temp, 0, nums, 0, n);
    }

    static void moveZeroes_OA(int[] nums) {
        // Best Optimal Approach by shifting the 0's to the end if found
        // Optimal Time - O(N) [2 while loops running separately]
        // Optimal Space - O(N) [No extra array was created]
        int n = nums.length, k=0;
        while (k < n) {
            if (nums[k] == 0)
                break;
            else
                k+=1;
        }
        int i = k, j = k+1;
        while(i < n && j < n) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            j++;
        }
    }
}
