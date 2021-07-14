package Exercises;

public class FactorialTrailingZeroes {
    /*
    * Given an integer n, return the number of trailing zeroes in n!.
    * */

    public static int trailingZeroes(int n) {

        int ans =0;
        while (n > 0){
            n/=5;// if a divide by 5 i'll get the number of 0s
            ans += n;
        }
        return ans;
    }
}
