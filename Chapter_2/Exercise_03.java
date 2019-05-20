package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/22/2017.

 (Convert feet into meters) Write a program that reads a number in feet, converts it
 to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:

 */
public class Exercise_03 {
    public static void main(String[] args) {
        double feet, meters;
        final double metersPerFoot = 0.305;

        // Create Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for variable input
        System.out.print("Enter a value for feet: ");
        feet = input.nextDouble();

        // Perform calculation
        meters = feet * metersPerFoot;

        // Display the final result
        System.out.print(feet + " feet is " + meters + " meters");
    }
}
