package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/22/2017.

 (Compute the volume of a cylinder) Write a program that reads in the radius
 and length of a cylinder and computes the area and volume using the following
 formulas:

 area = radius * radius * p

 volume = area * length

 Here is a sample run:

 */
public class Exercise_02 {
    public static void main(String[] args) {
        double radius, length, area, volume;
        final double PI = 3.14159;

        // Create Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for variable input
        System.out.print("Please enter the radius and length of a cylinder: ");
        radius = input.nextDouble();
        length = input.nextDouble();

        // Perform calculation
        area = radius * radius * PI;
        volume = area * length;

        // Display the final result
        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
