package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/19/2017.

 (Process a string) Write a program that prompts the user to enter a string and displays
 its length and its first character.

 */
public class Exercise_20 {
    public static void main(String[] args) {
        String user;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        user = input.nextLine();

        //Display the length and first character
        System.out.print("The length is " + (user.length()+1) + " the first character is " + user.charAt(0));
    }
}
