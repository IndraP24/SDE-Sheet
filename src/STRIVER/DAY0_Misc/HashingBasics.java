package STRIVER.DAY0_Misc;

// Q1: Counting frequencies of array elements
// https://practice.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/0
// Q2: Find the highest/lowest frequency element
// https://leetcode.com/problems/frequency-of-the-most-frequent-element/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashingBasics {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 2, 4, 1};
        frequencyCount(arr, 7, 4);
        System.out.println(Arrays.toString(arr));
    }

    static void frequencyCount(int[] arr, int N, int P) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<N; i++) {
            if (!map.containsKey(arr[i]))
                map.put(arr[i], 0);
            map.put(arr[i], map.get(arr[i]) + 1);
        }

        System.out.println(map);
    }

    static void maxFreq(int[] arr, int k) {
        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length - 1; i++) {
            map.put(i, max - arr[i]);
        }
    }
}
