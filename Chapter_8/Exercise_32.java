package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 3/20/2018.

 (Geometry: area of a triangle) Write a method that returns the area of a triangle
 using the following header:

 public static double getTriangleArea(double[][] points)

 The points are stored in a 3-by-2 two-dimensional array points with points[0]
 [0] and points[0][1] for (x1, y1). The triangle area can be computed using the
 formula in Programming Exercise 2.19. The method returns 0 if the three points
 are on the same line. Write a program that prompts the user to enter three points of
 a triangle and displays the triangle's area. Here is a sample run of the program:

 Enter x1, y1, x2, y2, x3, y3: 2.5 2 5 -1.0 4.0 2.0
 The area of the triangle is 2.25

 Enter x1, y1, x2, y2, x3, y3: 2 2 4.5 4.5 6 6
 The three points are on the same line

 s = (side1 + side2 + side3)/2;

 area = sqrt((s - side1)(s - side2)(s - side3));

 */
public class Exercise_32 {
    public static void main(String[] args) {
        double[][] points = new double[3][2];

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three points for a triangle: ");
        for(int row = 0; row < points.length; row++){
            for(int col = 0; col < points[row].length; col++){
                points[row][col] = input.nextDouble();
            }
        }

        double area = getTriangleArea(points);
        System.out.print(area == 0 ? "The three points are on the same line" : "The area of the triangle is " + area);

    }

    /**  */
    public static double getTriangleArea(double[][] points){
        if(onTheSameLine(points))
            return 0;
        else {
            double side1, side2, side3, s;


            // Calculate the sides, s, and area
            // x1 points[0][0], y1 points[0][1], x2 points[1][0], y2 points[1][1], x3 points[2][0], y3 points[2][1]
            side1 = Math.sqrt(Math.pow((points[1][0] - points[0][0]), 2) + Math.pow((points[1][1] - points[0][1]), 2));
            side2 = Math.sqrt(Math.pow((points[2][0] - points[1][0]), 2) + Math.pow((points[2][1] - points[1][1]), 2));
            side3 = Math.sqrt(Math.pow((points[2][0] - points[0][0]), 2) + Math.pow((points[2][1] - points[0][1]), 2));

            s = (side1 + side2 + side3) / 2;

            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
    }

    /** Return true if point (x2, y2) is on the line segment from (x0, y0) to (x1, y1) */
    public static boolean onTheSameLine(double[][] points){
        // p0_X points[0][0], p0_Y points[0][1], p1_X points[1][0], p1_Y points[1][1], p2_X points[2][0], p2_Y points[2][1]
        return ((points[1][0] - points[0][0]) * (points[2][1] - points[0][1]) - (points[2][0] - points[0][0]) * (points[1][1] - points[0][1]) == 0
                && !((points[2][0] >= points[0][0] && points[2][0] <= points[1][0]) || (points[2][0] <= points[0][0] && points[2][0] >= points[1][0])));
    }
}
