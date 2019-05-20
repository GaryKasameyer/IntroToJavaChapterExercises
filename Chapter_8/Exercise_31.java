package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 3/20/2018.

 (Geometry: intersecting point) Write a method that returns the intersecting point of
 two lines. The intersecting point of the two lines can be found by using the formula
 shown in Programming Exercise 3.25. Assume that (x1, y1) and (x2, y2) are the
 two points on line 1 and (x3, y3) and (x4, y4) are on line 2. The method header is

 public static double[] getIntersectingPoint(double[][] points)

 The points are stored in a 4-by-2 two-dimensional array points with
 (points[0][0], points[0][1]) for (x1, y1). The method returns the intersecting
 point or null if the two lines are parallel. Write a program that prompts
 the user to enter four points and displays the intersecting point. See Programming
 Exercise 3.25 for a sample run.

 Cramers Rule:
 (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3

 */
public class Exercise_31 {
    public static void main(String[] args) {
        double[][] points = new double[4][2];
        double[] solution;

        // Prompt user to enter values
        Scanner input = new Scanner(System.in);
        System.out.print("enter x1, y1, x2, y2, x3, y3, x4, and y4: ");
        for(int row = 0; row < points.length; row++){
            for(int col = 0; col < points[row].length; col++){
                points[row][col] = input.nextDouble();
            }
        }

        // Use getIntersectingPoint to get X and Y
        solution = getIntersectingPoint(points);

        System.out.printf("X is %1.3f and Y is %1.3f", solution[0], solution[1]);
    }

    /** Use getIntersectingPoint to calculate the X and Y of the intersection point of these two lines */
    public static double[] getIntersectingPoint(double[][] points){

        double[] solution = new double[2];

        double x1 = points[0][0];
        double y1 = points[0][1];
        double x2 = points[1][0];
        double y2 = points[1][1];
        double x3 = points[2][0];
        double y3 = points[2][1];
        double x4 = points[3][0];
        double y4 = points[3][1];

        double a = y1 - y2;
        double b = -(x1 - x2);
        double c = y3 - y4;
        double d = -(x3 - x4);
        double e = a * x1 + b * y1;
        double f = c * x3 + d * y3;

        solution[0] = (e * d - b * f) / (a * d - b * c);
        solution[1] = (a * f - e * c) / (a * d - b * c);

        return solution;
    }
}
