package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/24/2017.

 (Geometry: area of a hexagon) Write a program that prompts the user to enter the
 side of a hexagon and displays its area. The formula for computing the area of a
 hexagon is
 Area =
 323
 2
 s2,

 where s is the length of a side. Here is a sample run:

 */
public class Exercise_16 {
    public static void main(String[] args) {
        double side, area;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        side = input.nextDouble();

        // Perform the calculation
        area = ((3 * Math.sqrt(3)) / 2) * Math.pow(side,2);

        // Display the final result
        System.out.print("The area of the hexagon is " + area);
    }
}
