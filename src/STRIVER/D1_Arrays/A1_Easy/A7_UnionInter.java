package STRIVER.D1_Arrays.A1_Easy;

// Find the Union and intersection of two sorted arrays
//

import java.util.*;

public class A7_UnionInter {
    public static void main(String[] args) {
        int n = 10, m = 7;
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        System.out.println(findUnion_MAP(arr1, arr2, n, m));
        System.out.println(findUnion_SET(arr1, arr2, n, m));
        System.out.println(findUnion_TP(arr1, arr2, n, m));
    }

    static ArrayList<Integer> findUnion_MAP(int[] a, int[] b, int n, int m) {
        // Using a HashMap to store the Array value as keys and return it as an ArrayList
        // Time Complexity: O((m+n) log(m+n)) [Inserting a key in map takes log(N) time]
        // Space Complexity: O(m+n) [If space of ArrayList is considered]
        //                   O(1)   [If only HashMap is considered]
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<n; i++)
            map.put(a[i], map.getOrDefault(a[i], 0)+1);

        for (int i=0; i<m; i++)
            map.put(b[i], map.getOrDefault(b[i], 0)+1);

        return new ArrayList<>(map.keySet());
    }

    static ArrayList<Integer> findUnion_SET(int[] a, int[] b, int n, int m) {
        // Using a HashSet to store the values since it only stores unique values
        // Time & Space Complexity same as HashMaps but with fewer computations because frequency is not calculated
        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<n; i++)
            set.add(a[i]);

        for (int i=0; i<m; i++)
            set.add(b[i]);

        return new ArrayList<>(set);
    }

    // Only in case of SORTED ARRAYS
    static ArrayList<Integer> findUnion_TP(int[] a, int[] b, int n, int m) {
        // Assuming the array is sorted:
        // Time Complexity: O(m+n) [since two pointers are used at the same time]
        // Space Complexity: O(m+n) [if ArrayList is considered]
        int i = 0, j = 0;
        ArrayList<Integer> unionList = new ArrayList<>();

        // Compare and insert elements
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                if (unionList.size()==0 || unionList.get(unionList.size()-1) != a[i])
                    unionList.add(a[i]);
                i++;
            }
            else {
                if (unionList.size()==0 || unionList.get(unionList.size()-1) != b[j])
                    unionList.add(b[j]);
                j++;
            }
        }

        // If any element left in a[]
        while (i < n) {
            if (unionList.size()==0 || unionList.get(unionList.size()-1) != a[i])
                    unionList.add(a[i]);
                i++;
        }

        // If any element left in b[]
        while (j < m) {
            if (unionList.size()==0 || unionList.get(unionList.size()-1) != b[j])
                    unionList.add(b[j]);
                j++;
        }

        return unionList;
    }
}
