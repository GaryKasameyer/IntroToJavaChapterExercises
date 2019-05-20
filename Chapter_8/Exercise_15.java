package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/12/2017.

 (Geometry: same line?) Programming Exercise 6.39 gives a method for testing
 whether three points are on the same line.
 Write the following method to test whether all the points in the array points are
 on the same line.

 public static boolean sameLine(double[][] points)

 Write a program that prompts the user to enter five points and displays whether
 they are on the same line. Here are sample runs:

 Enter five points: 3.4 2 6.5 9.5 2.3 2.3 5.5 5 -5 4
 The five points are not on the same line

 Enter five points: 1 1 2 2 3 3 4 4 5 5
 The five points are on the same line

 */
public class Exercise_15 {
    public static void main(String[] args) {
        double[][] points = new double[5][2];

        // Prompt user to enter points
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five points: ");
        for(int row = 0; row < points.length; row++){
            for(int col = 0; col < points[row].length; col++){
                points[row][col] = input.nextDouble();
            }
        }

        System.out.print(sameLine(points) ? "The five points are on the same line" : "The five points are not on the same line");

    }

    /** Use sameLine to loop through points and see if they are all on the sameLine
     * with the equation (p1_X - p0_X) * (p2_Y - p0_Y) - (p2_X - p0_X) * (p1_Y - p0_Y) == 0 */
    public static boolean sameLine(double[][] points){
        int X = 0, Y = 1;

        for(int row = 0; row < 3; row++){
            if((points[row + 1][X] - points[row][X]) * (points[row + 2][Y] - points[row][Y]) - (points[row + 2][X] - points[row][X]) * (points[row + 1][Y] - points[row][Y]) != 0)
                return false;
        }
        return true;
    }
}
