package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/23/2017.

 (Physics: acceleration) Average acceleration is defined as the change of velocity
 divided by the time taken to make the change, as shown in the following formula:
 a =
 v1 - v0
 t
 Write a program that prompts the user to enter the starting velocity v0 in meters/
 second, the ending velocity v1 in meters/second, and the time span t in seconds,
 and displays the average acceleration. Here is a sample run:

 */
public class Exercise_09 {
    public static void main(String[] args) {
        double v0, v1, t, a;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1, and t: ");
        v0 = input.nextDouble();
        v1 = input.nextDouble();
        t = input.nextDouble();

        // Perform Calculation
        a = (v1 - v0) / t;

        // Display result
        System.out.print("The average acceleration is " + a);
    }
}
