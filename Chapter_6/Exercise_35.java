package Chapter6_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/7/2017.

 (Geometry: area of a pentagon) The area of a pentagon can be computed using the
 following formula:
         5 * s^2
 Area = ---------
        4 * tan(PI / 5)

 Write a method that returns the area of a pentagon using the following header:

 public static double area(double side)

 Write a main method that prompts the user to enter the side of a pentagon and
 displays its area. Here is a sample run:

 Enter the side: 5.5
 The area of the pentagon is 52.04444136781625

 */
public class Exercise_35 {
    public static void main(String[] args) {
        double side;

        // Prompt user for side value
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side: ");
        side = input.nextDouble();

        // Call the area method and print it out
        System.out.printf("The area of the pentagon is %1.14f", area(side));
    }

    /** Use area(double) to return value of pentagon area */
    public static double area(double side){
        return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }
}
