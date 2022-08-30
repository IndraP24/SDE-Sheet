package STRIVER.D0_Misc;

import java.util.*;

// Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
// https://leetcode.com/problems/reverse-integer/

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n < 0) {
            System.out.println(-reverse(-n));
            return;
        }

        System.out.println(reverse(n));

    }

    public static int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            int r = n % 10;
            n /= 10;

            if (rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE/10 && r > 7)
                return 0;

            if (rev < Integer.MIN_VALUE/10 || rev == Integer.MIN_VALUE/10 && r < -8)
                return 0;

            rev = rev * 10 + r;
        }

        return rev;
    }
}
