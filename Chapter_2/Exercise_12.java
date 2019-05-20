package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/24/2017.

 (Physics: finding runway length) Given an airplane’s acceleration a and take-off
 speed v, you can compute the minimum runway length needed for an airplane to
 take off using the following formula:
 length =
 v2
 2a
 Write a program that prompts the user to enter v in meters/second (m/s) and the
 acceleration a in meters/second squared (m/s2), and displays the minimum runway
 length. Here is a sample run:

 */
public class Exercise_12 {
    public static void main(String[] args) {
        double v, a, length;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        v = input.nextDouble();
        a = input.nextDouble();

        // Perform calculation
        length = (Math.pow(v, 2) / (2 * a));

        // Display the final result
        System.out.print("The minimum runway length for this airplay is " + length);
    }
}
