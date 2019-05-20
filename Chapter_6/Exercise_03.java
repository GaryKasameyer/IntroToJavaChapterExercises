package Chapter6_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/29/2017.

 (Palindrome integer) Write the methods with the following headers

 // Return the reversal of an integer, i.e., reverse(456) returns 654
 public static int reverse(int number)

 // Return true if number is a palindrome
 public static boolean isPalindrome(int number)

 Use the reverse method to implement isPalindrome. A number is a palindrome
 if its reversal is the same as itself. Write a test program that prompts the
 user to enter an integer and reports whether the integer is a palindrome.

 */
public class Exercise_03 {
    public static void main(String[] args) {
        int number;

        // Prompt user to enter potential palindrome
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = input.nextInt();

        // Print out whether the number is a palindrome or not
        System.out.print(number + " is a palindrome is " + isPalindrome(number));
    }

    /** Return the reversal of an integer, i.e., reverse(456) returns 654 */
    public static int reverse(int number){
        int reverse = 0;

        while(number != 0){
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }

        return reverse;
    }

    /** Return true if number is a palindrome */
    public static boolean isPalindrome(int number){
        return (number == reverse(number));
    }
}


















