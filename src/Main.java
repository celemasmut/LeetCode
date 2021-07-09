import Exercises.FizzBuzz;
import Exercises.Palindrome;

import java.util.ArrayList;
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
                    fizzbuzz.forEach(ob -> System.out.println(ob));
                    break;
                case 2:
                    boolean palindrome = Palindrome.isPalindrome(4774);
                    System.out.println(palindrome);
                    palindrome = Palindrome.isPalindrome(543);
                    System.out.println(palindrome);
                    break;
            }

        }while (op == true);
        

    }

    public static void Menu(){
        System.out.println(" '1' - FizzBuzz");
        System.out.println(" '2' - Palindrome");
        System.out.println(" '2' - Palindrome");

        System.out.println(" '2' - Palindrome");

        System.out.println(" '2' - Palindrome");
        System.out.println(" '2' - Palindrome");

        System.out.println(" '2' - Palindrome");

    }
}
