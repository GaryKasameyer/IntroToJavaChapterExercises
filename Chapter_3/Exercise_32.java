package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/9/2017.

 (Geometry: point position) Given a directed line from point p0(x0, y0) to p1(x1,
 y1), you can use the following condition to decide whether a point p2(x2, y2) is
 on the left of the line, on the right, or on the same line (see Figure 3.11):

                                            / >0 p2 is on the left side of the line
 (x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0) { =0 p2 is on the same line
                                           \ <0 p2 is on the right side of the line

 FIGURE 3.11 (a) p2 is on the left of the line. (b) p2 is on the right of the line. (c) p2 is on
 the same line.

 Write a program that prompts the user to enter the three points for p0, p1, and p2
 and displays whether p2 is on the left of the line from p0 to p1, on the right, or on
 the same line. Here are some sample runs:

 */
public class Exercise_32 {
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
        if(pointValue > 0) {
            System.out.print("(" + p2_X + ", " + p2_Y + ") is on the left side of the line from ("
                    + p0_X + ", " + p0_Y + ") to (" + p1_X + ", " + p1_Y + ")");
        }
        else if(pointValue < 0){
            System.out.print("(" + p2_X + ", " + p2_Y + ") is on the right side of the line from ("
                    + p0_X + ", " + p0_Y + ") to (" + p1_X + ", " + p1_Y + ")");
        }
        else{
            System.out.print("(" + p2_X + ", " + p2_Y + ") is on the line from ("
                    + p0_X + ", " + p0_Y + ") to (" + p1_X + ", " + p1_Y + ")");
        }
    }
}
