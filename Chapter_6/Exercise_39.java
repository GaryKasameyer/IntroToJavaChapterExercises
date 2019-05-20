package Chapter6_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/8/2017.

 (Geometry: point position) Programming Exercise 3.32 shows how to test whether
 a point is on the left side of a directed line, on the right, or on the same line. Write
 the methods with the following headers:

 Return true if point (x2, y2) is on the left side of the
 directed line from (x0, y0) to (x1, y1)
 public static boolean leftOfTheLine(double x0, double y0, double x1, double y1, double x2, double y2){}

 Return true if point (x2, y2) is on the same
 line from (x0, y0) to (x1, y1)
 public static boolean onTheSameLine(double x0, double y0, double x1, double y1, double x2, double y2){}

 Return true if point (x2, y2) is on the
 line segment from (x0, y0) to (x1, y1)
 public static boolean onTheLineSegment(double x0, double y0, double x1, double y1, double x2, double y2){}

 Write a program that prompts the user to enter the three points for p0, p1, and p2
 and displays whether p2 is on the left of the line from p0 to p1, right, the same
 line, or on the line segment. Here are some sample runs:

 Enter three points for p0, p1, and p2: 1 1 2 2 1.5 1.5
 (1.5, 1.5) is on the line segment from (1.0, 1.0) to (2.0, 2.0)

 Enter three points for p0, p1, and p2: 1 1 2 2 3 3
 (3.0, 3.0) is on the same line from (1.0, 1.0) to (2.0, 2.0)

 Enter three points for p0, p1, and p2: 1 1 2 2 1 1.5
 (1.0, 1.5) is on the left side of the line
 from (1.0, 1.0) to (2.0, 2.0)

 Enter three points for p0, p1, and p2: 1 1 2 2 1 -1
 (1.0, -1.0) is on the right side of the line
 from (1.0, 1.0) to (2.0, 2.0)

 */
public class Exercise_39 {
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

        // Call methods until one returns true, then print the location of the point in relation to the line
        if(leftOfTheLine(p0_X, p0_Y, p1_X, p1_Y, p2_X, p2_Y)) {
            System.out.print("(" + p2_X + ", " + p2_Y + ") is on the left side of the line from ("
                    + p0_X + ", " + p0_Y + ") to (" + p1_X + ", " + p1_Y + ")");
        }
        else if(rightOfTheLine(p0_X, p0_Y, p1_X, p1_Y, p2_X, p2_Y)){
            System.out.print("(" + p2_X + ", " + p2_Y + ") is on the right side of the line from ("
                    + p0_X + ", " + p0_Y + ") to (" + p1_X + ", " + p1_Y + ")");
        }
        else if(onTheSameLine(p0_X, p0_Y, p1_X, p1_Y, p2_X, p2_Y)){
            System.out.print("(" + p2_X + ", " + p2_Y + ") is on the same line from ("
                    + p0_X + ", " + p0_Y + ") to (" + p1_X + ", " + p1_Y + ")");
        }
        else if(onTheLineSegment(p0_X, p0_Y, p1_X, p1_Y, p2_X, p2_Y)) {
            System.out.print("(" + p2_X + ", " + p2_Y + ") is on the line segment from ("
                    + p0_X + ", " + p0_Y + ") to (" + p1_X + ", " + p1_Y + ")");
        }
    }

    /** Return true if point (x2, y2) is on the left side of the directed line from (x0, y0) to (x1, y1) */
    public static boolean leftOfTheLine(double p0_X, double p0_Y, double p1_X, double p1_Y, double p2_X, double p2_Y){
        return ((p1_X - p0_X) * (p2_Y - p0_Y) - (p2_X - p0_X) * (p1_Y - p0_Y) > 0);
    }

    /** Return true if point (x2, y2) is on the right side of the directed line from (x0, y0) to (x1, y1) */
    public static boolean rightOfTheLine(double p0_X, double p0_Y, double p1_X, double p1_Y, double p2_X, double p2_Y){
        return ((p1_X - p0_X) * (p2_Y - p0_Y) - (p2_X - p0_X) * (p1_Y - p0_Y) < 0);
    }

    /** Return true if point (x2, y2) is on the same line from (x0, y0) to (x1, y1) */
    public static boolean onTheLineSegment(double p0_X, double p0_Y, double p1_X, double p1_Y, double p2_X, double p2_Y){
        return ((p1_X - p0_X) * (p2_Y - p0_Y) - (p2_X - p0_X) * (p1_Y - p0_Y) == 0 && ((p2_X >= p0_X && p2_X <= p1_X) || (p2_X <= p0_X && p2_X >= p1_X)));
    }

    /**Return true if point (x2, y2) is on the line segment from (x0, y0) to (x1, y1) */
    public static boolean onTheSameLine(double p0_X, double p0_Y, double p1_X, double p1_Y, double p2_X, double p2_Y){
        return ((p1_X - p0_X) * (p2_Y - p0_Y) - (p2_X - p0_X) * (p1_Y - p0_Y) == 0 && !((p2_X >= p0_X && p2_X <= p1_X) || (p2_X <= p0_X && p2_X >= p1_X)));
    }
}



































