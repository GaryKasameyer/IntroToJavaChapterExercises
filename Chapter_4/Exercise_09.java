package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/17/2017.

 (Find the Unicode of a character) Write a program that receives a character and
 displays its Unicode. Here is a sample run:

 */
public class Exercise_09 {
    public static void main(String[] args) {
        String character;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        character = input.next();

        // Display the final result
        System.out.print("The Unicode for the character is " + (int)character.charAt(0));
    }
}
