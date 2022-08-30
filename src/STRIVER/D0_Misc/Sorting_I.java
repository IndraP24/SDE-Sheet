package STRIVER.D0_Misc;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorting_I {
    public static void main(String[] args) {
        int[] arr = {13,46,24,52,20,9};
        System.out.println("Before Using Bubble Sort: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("After Using Bubble Sort: " + Arrays.toString(arr));

        arr = new int[] {13,46,24,52,20,9};
        System.out.println("Before Using Selection Sort: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("After Using Selection Sort: " + Arrays.toString(arr));

        arr = new int[] {13,46,24,52,20,9};
        System.out.println("Before Using Insertion Sort: " + Arrays.toString(arr));
        insertionSort(arr, arr.length);
        System.out.println("After Using Insertion Sort: " + Arrays.toString(arr));

        arr = new int[] {13,46,24,52,20,9};
        System.out.println("Before Using Merge Sort: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length-1);
        System.out.println("After Using Merge Sort: " + Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped ;
        for (int i = 0; i < n-1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }

            if (!swapped)
                break;
        }
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min=i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            // Swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    static void insert(int[] arr, int i) {
        int j = i - 1;
        int current = arr[i];

        while(j >= 0 && arr[j] > current) {
            // Swap
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = current;
    }
    static void insertionSort(int[] arr, int n) {
        int i = 1;
        while (i < n) {
            insert(arr, i);
            i++;
        }
    }


    static void merge(int[] arr, int l, int m, int r) {
        int i = l, j = m+1, f = l;
        ArrayList<Integer> temp = new ArrayList<>();

        while ( i <= m && j <= r) {
            if (arr[i] < arr[j]) {
                temp.add(f, arr[i]);
                i++;
            }
            else {
                temp.add(f, arr[j]);
                j++;
            }
            f++;
        }

        if (i > m) {
            while (j <= r) {
                temp.add(f, arr[j]);
                f++;
                j++;
            }
        }
        else {
            while (i <= m) {
                temp.add(f, arr[i]);
                f++;
                i++;
            }
        }

        for (f = l; f <= r; f++) {
            arr[f] = temp.get(f);
        }
    }

    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l)/2;
            mergeSort(arr, l, mid); // left half
            mergeSort(arr, mid+1, r); // right half
            merge(arr, l, mid, r); // merging sorted halved arrays
        }
    }
}
