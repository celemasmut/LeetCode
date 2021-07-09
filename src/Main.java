import Exercises.FizzBuzz;
import Exercises.Palindrome;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

       /* List<String> fizzbuzz = new ArrayList<>();
        fizzbuzz = FizzBuzz.fizzBuzz(15);
        fizzbuzz.forEach(ob -> System.out.println(ob));
      */
        boolean palindrome = Palindrome.isPalindrome(4774);
        System.out.println(palindrome);

    }
}
