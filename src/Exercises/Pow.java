package Exercises;

public class Pow {

    /*
    * Implement pow(x, n), which calculates x raised to the power n (i.e., xn).
    */

    public static double myPow(double x, int n) {
        double ans = 1.0;
        long num = n; // in case in overflow
        if(n < 0){
            num = -1 * num;
            x = 1/x;
        }
        while ( num > 0 ){
            if( num % 2 == 0){
                x = x * x;
                num = num / 2;
            }else{
                ans = ans * x;
                num = num - 1;
            }
        }
        if(num < 0 ){
            return  (double) (1.0) / (double) ans; // this part makes to run faster
        }
        return ans;
    }

}
