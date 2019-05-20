package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/15/2017.

 (Geometry: great circle distance) The great circle distance is the distance between
 two points on the surface of a sphere. Let (x1, y1) and (x2, y2) be the geographical
 latitude and longitude of two points. The great circle distance between the two
 points can be computed using the following formula:

 d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))

 Write a program that prompts the user to enter the latitude and longitude of two
 points on the earth in degrees and displays its great circle distance. The average
 earth radius is 6,371.01 km. Note that you need to convert the degrees into radians
 using the Math.toRadians method since the Java trigonometric methods use
 radians. The latitude and longitude degrees in the formula are for north and west.
 Use negative to indicate south and east degrees. Here is a sample run:

 */
public class Exercise_02 {
    public static void main(String[] args) {
        double p1_X, p1_Y, p2_X, p2_Y, distance;
        final double RADIUS = 6371.01;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        p1_X = Math.toRadians(input.nextDouble());
        p1_Y = Math.toRadians(input.nextDouble());

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        p2_X = Math.toRadians(input.nextDouble());
        p2_Y = Math.toRadians(input.nextDouble());

        // Perform the calculation
        distance = RADIUS * Math.acos(Math.sin(p1_X) * Math.sin(p2_X) + Math.cos(p1_X) * Math.cos(p2_X) * Math.cos(p1_Y - p2_Y));

        // Display the final result
        System.out.print("The distance between the two points  is " + distance + " km");

    }
}
