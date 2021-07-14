package Exercises;

public class ReverseString {

    /*
     * Write a function that reverses a string. The input string is given as an array of characters s
     * */

    public static void reverseString(char[] s) {
        int left = 0; // to point to the place 0 of the array
        int right = s.length -1 ; // to point to the end of the array
        char aux;
        while ( left < right){
            aux = s[left];
            s[left] = s[right];
            s[right] = aux;
            left++;
            right--;
        }
        System.out.println(s);

    }


}
