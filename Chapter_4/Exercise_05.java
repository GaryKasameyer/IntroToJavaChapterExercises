package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/16/2017.

 (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon in
 which all sides are of the same length and all angles have the same degree (i.e., the
 polygon is both equilateral and equiangular). The formula for computing the area
 of a regular polygon is

 Area =
 n * s2
 4 * tan¢p
 n
 ≤

 Here, s is the length of a side. Write a program that prompts the user to enter the
 number of sides and their length of a regular polygon and displays its area. Here is
 a sample run:

 */
public class Exercise_05 {
    public static void main(String[] args) {
        double numberOfSides, side, area;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        numberOfSides = input.nextDouble();

        System.out.print("Enter the length of side: ");
        side = input.nextDouble();

        // Perform the calculation
        area = (numberOfSides * side * side) / (4 * Math.tan(Math.PI / numberOfSides));

        // Display the final result
        System.out.print("The area of the polygon is " + area);
    }
}
