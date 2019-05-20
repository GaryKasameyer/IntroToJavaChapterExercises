package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/22/2017.

 (Convert pounds into kilograms) Write a program that converts pounds into kilograms.
 The program prompts the user to enter a number in pounds, converts it
 to kilograms, and displays the result. One pound is 0.454 kilograms. Here is a
 sample run:

 */
public class Exercise_04 {
    public static void main(String[] args) {
        double pounds, kilograms;
        final double kilogramsPerPound = 0.454;

        // Create Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for variable input
        System.out.print("Enter a number in pounds: ");
        pounds = input.nextDouble();

        // Perform the calculation
        kilograms = pounds * kilogramsPerPound;

        // Display the final result
        System.out.print(pounds + " pounds is " + kilograms + " kilograms");
    }
}
