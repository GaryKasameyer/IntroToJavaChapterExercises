package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/27/2017.

 (Count uppercase letters) Write a program that prompts the user to enter a string
 and displays the number of the uppercase letters in the string.

 Enter a string: Welcome to Java
 The number of uppercase letters is 2

 */
public class Exercise_50 {
    public static void main(String[] args) {
        String upperCaseString;
        int upperCaseLetters = 0;

        // Prompt user for string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        upperCaseString = input.nextLine();

        // use loop to check charAt() for upper case letter values
        for(int i = 0; i < upperCaseString.length(); i++){
            if((int)upperCaseString.charAt(i) > 64 && (int)upperCaseString.charAt(i) < 91)
                upperCaseLetters++;
        }

        // Print out number of upperCase letters
        System.out.print("The number of uppercase letters is " + upperCaseLetters);
    }
}
