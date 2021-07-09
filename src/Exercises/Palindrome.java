package Exercises;

public class Palindrome {

    /*
    * Given an integer x, return true if x is palindrome integer.
    * An integer is a palindrome when it reads the same backward as forward.
    * For example, 121 is palindrome while 123 is not.
    *
    * */

    public static boolean isPalindrome(int x) {
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            int last = x % 10; // get the last digit
            revertedNumber = revertedNumber * 10 + last; // turn it to decimals plus the last digit
            x /= 10;// move backward
        }

        return x == revertedNumber || x == revertedNumber/10;
    }

}
