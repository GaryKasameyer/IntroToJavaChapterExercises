package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/30/2017.

 (Palindrome number) Write a program that prompts the user to enter a three-digit
 integer and determines whether it is a palindrome number. A number is palindrome
 if it reads the same from right to left and from left to right. Here is a sample
 run of this program:

 */
public class Exercise_12 {
    public static void main(String[] args) {
        int palindrom, first, second, third;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Three-digit integer: ");
        palindrom = input.nextInt();

        // Perform Calculation
        first = palindrom / 100;
        //second = palindrom % 100 / 10;
        third = palindrom % 10;

        // Determine if isPalindrom == true
        if(first == third)
            System.out.println(palindrom + " is a Palindrom");
        else
            System.out.println(palindrom + " is not a Palindrom");
    }
}
