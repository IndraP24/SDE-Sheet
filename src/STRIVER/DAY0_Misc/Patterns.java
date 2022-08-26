package STRIVER.DAY0_Misc;

// Solving pattern problems:
// https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/

public class Patterns {
    public static void main(String[] args) {

        // Pattern #1
        System.out.println("Pattern #1:");
        String pat = "*****";
        for (int i=0; i<5; i++) {
            System.out.println(pat);
        }

        // Pattern #2
        System.out.println("Pattern #2:");
        pat = "*";
        for (int i=0; i<5; i++) {
            System.out.println(pat);
            pat = pat + "*";
        }

        // Pattern #3
        System.out.println("Pattern #3:");
        int num = 0;
        for (int i=1; i<=5; i++) {
            num = num*10 + i;
            System.out.println(num);
        }

        // Pattern #4
        System.out.println("Pattern #4:");
        for (int i=1; i<=5; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // Pattern #5
        System.out.println("Pattern #5:");
        for (int i=5; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Pattern #6
        System.out.println("Pattern #6:");
        for (int i=5; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // Pattern #7
        System.out.println("Pattern #7:");
        int count = 1;
        for (int i=5; i>=1; i--) {
            for (int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=count; k++) {
                System.out.print("*");
            }
            System.out.println();
            count += 2;
        }

        // Pattern #8
        System.out.println("Pattern #8:");
        count = 9;
        for (int i=1; i<=5; i++) {
            for (int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for (int k=1; k<=count; k++) {
                System.out.print("*");
            }
            System.out.println();
            count -= 2;
        }

        // Pattern 9
        System.out.println("Pattern #9:");
        System.out.println("Combining Pattern #7 & #8");

        // Pattern 10
        System.out.println("Pattern #10:");
        pat = "*";
        for (int i=1; i<=5; i++) {
            System.out.println(pat);
            pat = pat + "*";
        }
        for (int i=4; i>=1; i--) {
            System.out.println(pat.substring(0, i));
        }

        // Pattern 11
        System.out.println("Pattern #11:");
        pat = "10101";
        for (int i=pat.length()-1; i>=0; i--) {
            System.out.println(pat.substring(i));
        }
    }
}
