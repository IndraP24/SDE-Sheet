package STRIVER.DAY0_Misc;

// Given an integer x, return true if x is palindrome integer.
//An integer is a palindrome when it reads the same backward as forward.
//For example, 121 is a palindrome while 123 or -121 is not.
// https://leetcode.com/problems/palindrome-number/

public class Palindrome {
    public static void main(String[] args) {
        int x = 1210;
        System.out.println(isPalindrome(x));
    }

    static boolean isPalindrome(int n) {

        if (n < 0)
            return false;

        int m = n, rev = 0;

        while (n != 0) {
            int r = n % 10;
            rev = rev * 10 + r;
            n /= 10;
        }

        return (m == rev);
    }
}
