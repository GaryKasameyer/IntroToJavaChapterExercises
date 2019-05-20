package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/25/2017.

 (Geometry: area of a triangle) Write a program that prompts the user to enter
 three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
 The formula for computing the area of a triangle is

 s = (side1 + side2 + side3)/2;

 area = 2s(s - side1)(s - side2)(s - side3)

 Here is a sample run:

 */
public class Exercise_19 {
    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3, side1, side2, side3, s, area;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();

        // Calculate the sides, s, and area
        side1 = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));
        side2 = Math.sqrt(Math.pow((x3 - x2),2) + Math.pow((y3 - y2),2));
        side3 = Math.sqrt(Math.pow((x3 - x1),2) + Math.pow((y3 - y1),2));

        s = (side1 + side2 + side3) / 2;

        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

        // Display the final result
        System.out.print("The area of the triangle is " + area);

    }
}
