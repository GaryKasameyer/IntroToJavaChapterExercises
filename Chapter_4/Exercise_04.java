package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/15/2017.

 (Geometry: area of a hexagon) The area of a hexagon can be computed using the
 following formula (s is the length of a side):
 Area =
 6 * s2
 4 * tan¢p
 6
 ≤
 Write a program that prompts the user to enter the side of a hexagon and displays
 its area. Here is a sample run:

 */
public class Exercise_04 {
    public static void main(String[] args) {
        double side, area;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        side = input.nextDouble();

        // Perform the calculation
        area = (6 * side * side) / (4 * Math.tan(Math.PI / 6));

        // Display the final result
        System.out.printf("The area of the hexagon is %2.2f", area);
    }
}
