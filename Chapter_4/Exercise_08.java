package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/17/2017.

 (Find the character of an ASCII code) Write a program that receives an ASCII code
 (an integer between 0 and 127) and displays its character. Here is a sample run:

 */
public class Exercise_08 {
    public static void main(String[] args) {
        int code;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an ASCII code: ");
        code = input.nextInt();

        // Display the result
        System.out.print("The character for ASCII code " + code + " is " + (char)code);
    }
}
