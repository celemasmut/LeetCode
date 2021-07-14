import Exercises.*;

import java.util.List;
import java.util.Scanner;

public class Main {

   static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        boolean op = false;
        do{
            Menu();
            int opc = scan.nextInt();
            switch (opc){
                case 1:
                    List<String> fizzbuzz;
                    fizzbuzz = FizzBuzz.fizzBuzz(15);
                    fizzbuzz.forEach(System.out::println);
                    break;
                case 2:
                    boolean palindrome = Palindrome.isPalindrome(4774);
                    System.out.println(palindrome);
                    palindrome = Palindrome.isPalindrome(543);
                    System.out.println(palindrome);
                    break;

                case 3:
                    int factorialTrailZero = FactorialTrailingZeroes.trailingZeroes(13);
                    System.out.println( factorialTrailZero);
                    break;
                case 4:
                    double myPow = Pow.myPow(3,-4);
                    System.out.println(myPow);
                    myPow = Pow.myPow(4,6);
                    System.out.println(myPow);
                    break;
                case 5:
                    char[] myChar = {'h','o','n','o','m','a','t','o','p','e','y','a'};
                    ReverseString.reverseString(myChar);
                    break;
                case 6:
                    String ans = ReverseWordsInAString.reverseWords("Hola como te va?");
                    System.out.println(ans);
                    break;
                case 7:
                    String test = "paradoja";
                    ans = LongestPalindromicSubstring.longestPalindrome(test);
                    System.out.println(ans);
                    break;
                case 8:
                    test = "3[a]2[bc]";
                    ans= DecodeString.decodeString(test);
                    System.out.println(ans);
            }

        }while (op == true);


    }

    public static void Menu(){
        System.out.println(" '1' - FizzBuzz");
        System.out.println(" '2' - Palindrome");
        System.out.println(" '3' - Factorial Trailing Zeroes");
        System.out.println(" '4' - Pow");
        System.out.println(" '5' - ReverseString");
        System.out.println(" '6' - Reverse Words in a String");
        System.out.println(" '7' - Longest Palindromic Substring");
        System.out.println(" '8' - Decode String");
        System.out.println(" '4' - Pow");
        System.out.println(" '10' - Find All Duplicates in an Array");
        System.out.println(" '11' - Merge Sorted Array");
        System.out.println(" '4' - Pow");
    }
}
