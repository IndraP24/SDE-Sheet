package STRIVER.DAY1_Arrays_I;

import java.util.HashSet;

public class A4_RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements using a HashSet is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr = new int[]{1,1,2,2,2,3,3};
        k = removeDuplicatesEA(arr);
        System.out.println("The array after removing duplicate elements inplace is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // Using HashSets to store unique elements
    static int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int k = set.size(), j = 0;

        for (int x : set)
            nums[j++] = x;

        return k;
    }


    // Updating the array in place by replacing the duplicated values with the next unique value
    static int removeDuplicatesEA(int[] nums) {
        int i = 0;

        for (int j=1; j<nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i+1;
    }
}
