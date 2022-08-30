package STRIVER.D0_Misc;

// Q1: Print 1 to N numbers without the help of loops
// https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
// Q2: Print N to 1 without loops
// Q3: Cubic Sum of first N numbers
// https://practice.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1
// Q4: Factorial of N numbers
// https://practice.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%5B%5D=-1&page=1&query=problemTypefunctionaldifficulty%5B%5D-1page1
// Q5: Reverse an array for each test cases given
// https://practice.geeksforgeeks.org/problems/reverse-an-array/0
// Q6: Check if a string is palindrome or not
// https://leetcode.com/problems/valid-palindrome/
// Q7: Fibonacci Number
// https://leetcode.com/problems/fibonacci-number/

import java.util.ArrayList;
import java.util.Arrays;

public class RecursionBasics {
    public static void main(String[] args) {
        printNum(7);
        System.out.println();
        printNumRev(7);
        System.out.println();
        System.out.println(cubicSum(5));
        System.out.println(factorialNums(6));
        int[] A = {1, 2, 3, 4, 5};
        reverseArray(A, 0, A.length-1);
        System.out.println(Arrays.toString(A));
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(fib(3));
    }

    static void printNum(int n) {
        // Base Condition
        if (n == 1) {
            System.out.print(1 + " ");
            return;
        }

        // Hypothesis
        printNum(n-1);

        // Induction
        System.out.print(n + " ");
    }

    static void printNumRev(int n) {
        // Base Condition
        if (n == 1) {
            System.out.print(1);
            return;
        }
        // Induction
        System.out.print(n + " ");
        // Hypothesis
        printNumRev(n-1);
    }

    static long cubicSum(long n) {
        long sum = 0;

        // Base Condition
        if (n == 1) {
            return sum+1;
        }

        // Hypothesis & Induction
        sum = cubicSum(n-1) + n*n*n;

        return sum;
    }

    static ArrayList<Long> factorialNums(long N) {
        ArrayList<Long> factNums = new ArrayList<>();
        for (int i=1; i<=N; i++) {
            long fact = factorial(i);
            if (fact <= N)
                factNums.add(fact);
            else
                break;
        }

        return factNums;
    }

    static long factorial(long n) {
        long fact = 1;
        // Base Cond
        if (n == 1)
            return fact;

        // Hyp and Induction
        fact = factorial(n-1) * n;

        return fact;
    }

    static void reverseArray(int[] A, int start, int end) {
        int temp;
        if (start >= end)
            return;

        temp = A[start];
        A[start] = A[end];
        A[end] = temp;
        reverseArray(A, start+1, end-1);
    }

    static boolean isPalRec(String s, int start, int end) {
        if (start == end)
            return true;

        if (s.charAt(start) != s.charAt(end))
            return false;

        if (start < end+1)
            return isPalRec(s, start+1, end-1);

        return true;
    }

    static boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder S = new StringBuilder();
        s = s.toLowerCase();

        for (int i=0; i<n; i++) {
            char t = s.charAt(i);
            if ((t >= 97 && t <= 122) || (t >= 48 && t <= 57)) {
                S.append(t);
            }
        }

        s = S.toString();
        n = s.length();
        if (n == 0)
            return true;

        return isPalRec(s, 0, n-1);
    }

    static int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return (fib(n-1) + fib(n-2));
    }
}
