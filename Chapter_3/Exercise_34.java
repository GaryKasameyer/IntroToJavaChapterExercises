package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/9/2017.

 (Geometry: point on line segment) Programming Exercise 3.32 shows how to test
 whether a point is on an unbounded line. Revise Programming Exercise 3.32 to
 test whether a point is on a line segment. Write a program that prompts the user
 to enter the three points for p0, p1, and p2 and displays whether p2 is on the line
 segment from p0 to p1. Here are some sample runs:

 */
public class Exercise_34 {
    public static void main(String[] args) {
        double p0_X, p0_Y, p1_X, p1_Y, p2_X, p2_Y, pointValue;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for p0, p1, and p2: ");
        p0_X = input.nextDouble();
        p0_Y = input.nextDouble();
        p1_X = input.nextDouble();
        p1_Y = input.nextDouble();
        p2_X = input.nextDouble();
        p2_Y = input.nextDouble();

        // preform calc to determine point value
        pointValue = (p1_X - p0_X) * (p2_Y - p0_Y) - (p2_X - p0_X) * (p1_Y - p0_Y);

        // use point value to determine position of point
        if(pointValue == 0 && (p2_X >= p0_X && p2_X <= p1_X) || (p2_X <= p0_X && p2_X >= p1_X)) {
            System.out.print("(" + p2_X + ", " + p2_Y + ") is on the line segment from ("
                    + p0_X + ", " + p0_Y + ") to (" + p1_X + ", " + p1_Y + ")");
        }
        else{
            System.out.print("(" + p2_X + ", " + p2_Y + ") is not on the line from ("
                    + p0_X + ", " + p0_Y + ") to (" + p1_X + ", " + p1_Y + ")");
        }
    }
}
