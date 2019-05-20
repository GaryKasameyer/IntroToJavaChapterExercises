package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 5/10/17.

 (Sum the major diagonal in a matrix) Write a method that sums all the numbers
 in the major diagonal in an n * n matrix of double values using the following
 header:

 public static double sumMajorDiagonal(double[][] m)

 Write a test program that reads a 4-by-4 matrix and displays the sum of all its
 elements on the major diagonal. Here is a sample run:

 Enter a 4-by-4 matrix row by row:
 1 2 3 4.0
 5 6.5 7 8
 9 10 11 12
 13 14 15 16
 Sum of the elements in the major diagonal is 34.5

 */
public class Exercise_02 {
    public static void main(String[] args) {
        double[][] smd = new double[4][4];

        // Prompt user to enter a matrix
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row:");

        for(int row = 0; row < smd.length; row++){
            for(int col = 0; col < smd[row].length; col++){
                smd[row][col] = input.nextDouble();
            }
        }

        // Call sumMajorDiagonal and print the result
        System.out.print("Sum of elements in the major diagonal is " + sumMajorDiagonal(smd));

    }

    /** Use sumMajorDiagonal to get the value of the diagonal 0,0 + 1,1 + 2,2 ... and return the result */
    public static double sumMajorDiagonal(double[][] m){
        double sum = 0;

        for(int row = 0, col = 0; row < m.length; row++, col++){
                sum += m[row][col];
        }

        return sum;
    }
}
