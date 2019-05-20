package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/9/2017.

 (Geometry: area of a pentagon) Write a program that prompts the user to enter
 the length from the center of a pentagon to a vertex and computes the area of the
 pentagon, as shown in the following figure.
 r
 The formula for computing the area of a pentagon is Area =
 5 * s2
 4 * tan¢p
 5
 ≤
 , where
 s is the length of a side. The side can be computed using the formula s = 2r sin
 p
 5
 ,
 where r is the length from the center of a pentagon to a vertex. Round up two digits
 after the decimal point. Here is a sample run:

 */
public class Exercise_01 {
    public static void main(String[] args) {
        double r, s, area;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length from the center to the vertex: ");
        r = input.nextDouble();

        // Perform the calculations
        s = 2 * r * (Math.sin(Math.PI / 5));

        area =  (5 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 5));

        // Display the final result
        System.out.printf("The area of the pentagon is %2.2f", area);

    }
}
