package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/16/2017.

 (Corner point coordinates) Suppose a pentagon is centered at (0, 0) with one point
 at the 0 o’clock position, as shown in Figure 4.7c. Write a program that prompts
 the user to enter the radius of the bounding circle of a pentagon and displays the
 coordinates of the five corner points on the pentagon. Here is a sample run:

 Coordinates are
 (r * sin72, r * cos72)
 (r * sin0, r * cos0)
 (r * sin288, r * cos288)
 (r * sin216, r * cos216)
 (r * sin144, r * cos144)

 */
public class Exercise_07 {
    public static void main(String[] args) {
        double radius,
        p1, p1_X, p1_Y,
        p2, p2_X, p2_Y,
        p3, p3_X, p3_Y,
        p4, p4_X, p4_Y,
        p5, p5_X, p5_Y;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        radius = input.nextDouble();

        //calculate theta
        p1 = Math.PI / 10;
        p2 = Math.PI / 2;
        p3 = Math.PI / 2 + 2 * Math.PI / 5;
        p4 = Math.PI / 2 + 4 * Math.PI / 5;
        p5 = Math.PI / 2 + 6 * Math.PI / 5;

        // Calculate the vertex coordinates
        p1_X = radius * Math.cos(p1);
        p1_Y = radius * Math.sin(p1);

        p2_X = radius * Math.cos(p2);
        p2_Y = radius * Math.sin(p2);

        p3_X = radius * Math.cos(p3);
        p3_Y = radius * Math.sin(p3);

        p4_X = radius * Math.cos(p4);
        p4_Y = radius * Math.sin(p4);

        p5_X = radius * Math.cos(p5);
        p5_Y = radius * Math.sin(p5);

        // Display the final result
        System.out.printf("The coordinates of five points on the pentagon are\n(%1.5f, %1.5f)\n(%1.5f, %1.5f)" +
                "\n(%1.5f, %1.5f)\n(%1.5f, %1.5f)\n(%1.5f, %1.5f)\n", p1_X, p1_Y, p2_X, p2_Y, p3_X, p3_Y, p4_X, p4_Y, p5_X, p5_Y);
    }
}
