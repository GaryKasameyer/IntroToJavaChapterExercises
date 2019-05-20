package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/24/2017.

 (Geometry: distance of two points) Write a program that prompts the user to enter
 two points (x1, y1) and (x2, y2) and displays their distance between them.
 The formula for computing the distance is 2(x2 - x1)2 + (y2 - y1)2. Note that
 you can use Math.pow(a, 0.5) to compute 2a. Here is a sample run:

 */
public class Exercise_15 {
    public static void main(String[] args) {
        double x1, x2, y1, y2, distance;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x1 and y1: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        x2 = input.nextDouble();
        y2 = input.nextDouble();

        // Perform the calculation
        distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

        // display the final result
        System.out.print("The distance between the points is " + distance);
    }
}
