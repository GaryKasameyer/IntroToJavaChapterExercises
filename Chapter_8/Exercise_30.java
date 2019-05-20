package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 3/20/2018.

 (Algebra: solve linear equations) Write a method that solves the following
 2 * 2 system of linear equations:

 a00x + a01y = b0
 a10x + a11y = b1

     b0a11 - b1a01
 x = ---------------
     a00a11 - a01a10

     b1a00 - b0a10
 y = ---------------
     a00a11 - a01a10

 The method header is

 public static double[] linearEquation(double[][] a, double[] b)

 The method returns null if a00a11 - a01a10 is 0. Write a test program that
 prompts the user to enter a00, a01, a10, a11, b0, and b1, and displays the result. If
 a00a11 - a01a10 is 0, report that “The equation has no solution.” A sample run is
 similar to Programming Exercise 3.3.

 3.4 50.2 2.1 .55 44.5 5.9
 */
public class Exercise_30 {
    public static void main(String[] args) {
        double[][] a = new double[2][2];
        double[] b = new double[2], solution;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a00, a01, a10, and a11: ");
        for(int row = 0; row < 2; row++){
            for(int col = 0; col < 2; col++){
                a[row][col] = input.nextDouble();
            }
        }

        System.out.print("Enter b0 and b1: ");
        for(int row = 0; row < 2; row++){
            b[row] = input.nextDouble();
        }

        solution = linearEquation(a, b);

        if(solution == null)
            System.out.print("The equation has no solution.");
        else
            System.out.printf("X is %1.3f and Y is %1.3f", solution[0], solution[1]);

    }

    /** Use linearEquation to calculate the X and Y values and return them as a double[2[ */
    public static double[] linearEquation(double[][] a, double[] b){
        double[] solution = new double[2];

        // Check if a00 * a01 - a10 * a11 == 0 return null
        if((a[0][0] * a[0][1]) - (a[1][0] * a[1][1]) == 0)
            return null;

        // Calculate X and Y with a[][] and b[] a a00 b a01 c a10 d a11 e b0 f b1 and populate solution[]
        solution[0] = ((b[0] * a[1][1]) - (a[0][1] * b[1])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
        solution[1] = ((a[0][0] * b[1]) - (b[0] * a[1][0])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));

        return solution;
    }
}
