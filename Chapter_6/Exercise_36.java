package Chapter6_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/7/2017.

 (Geometry: area of a regular polygon) A regular polygon is an n-sided polygon
 in which all sides are of the same length and all angles have the same degree (i.e.,
 the polygon is both equilateral and equiangular). The formula for computing the
 area of a regular polygon is

 Area =
 n * s2
 4 * tan¢p
 n
 ≤

 Write a method that returns the area of a regular polygon using the following header:

 public static double area(int n, double side)

 Write a main method that prompts the user to enter the number of sides and the
 side of a regular polygon and displays its area. Here is a sample run:

 Enter the number of sides: 5
 Enter the side: 6.5
 The area of the polygon is 72.69017017488385

 */
public class Exercise_36 {
    public static void main(String[] args) {
        double side;
        int numberOfSides;

        // Prompt user for side value
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        numberOfSides = input.nextInt();

        System.out.print("Enter the side: ");
        side = input.nextDouble();


        // Call the area method and print it out
        System.out.printf("The area of the pentagon is %1.14f", area(side, numberOfSides));
    }

    /** Use area(double) to return value of pentagon area */
    public static double area(double side, int n){
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
