package STRIVER.D1_Arrays.A1_Easy;

// Check if the array is sorted and rotated
// https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

public class A3_CheckSortRotate {
    public static void main(String[] args) {
        int[] A = {3, 4, 5, 1, 2};
        System.out.println(checkSortRotate(A));
    }

    public static boolean checkSortRotate(int[] nums)  {
        int n = nums.length, count=0;
        for (int i=0; i<n; i++) {
            if (nums[i] > nums[(i+1)%n])
                count++;
        }

        return (count<=1);
    }
}
