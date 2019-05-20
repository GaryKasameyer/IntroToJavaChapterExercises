package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/2/2017.

 (Geometry: points in triangle?) Suppose a right triangle is placed in a plane as
 shown below. The right-angle point is placed at (0, 0), and the other two points
 are placed at (200, 0), and (0, 100). Write a program that prompts the user to enter
 a point with x- and y-coordinates and determines whether the point is inside the
 triangle. Here are the sample runs:

 */
public class Exercise_27 {
    public static void main(String[] args) {
        double x, y, x1 = 0, y1 = 0, x2 = 0, y2 = 100, x3 = 200, y3 = 0;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a points x and y coordinates: ");
        x = input.nextDouble();
        y = input.nextDouble();


        /* Calculate area of triangle ABC */
        double A = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

   /* Calculate area of triangle PBC */
        double A1 = Math.abs(x * (y2 - y3) + x2 * (y3 - y) + x3 * (y - y2));

   /* Calculate area of triangle APC */
        double A2 = Math.abs(x1 * (y - y3) + x * (y3 - y1) + x3 * (y1 - y));

   /* Calculate area of triangle ABP */
        double A3 = Math.abs(x1 * (y2 - y) + x2 * (y - y1) + x * (y1 - y2));

   /* Check if sum of A1, A2 and A3 is same as A */
        if(A == A1 + A2 + A3)
            System.out.println("The point is in the triangle");
        else
            System.out.println("The point is not in the triangle");
    }
}
