package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 3/17/2018.

 (Markov matrix) An n * n matrix is called a positive Markov matrix if each
 element is positive and the sum of the elements in each column is 1. Write the
 following method to check whether a matrix is a Markov matrix.

 public static boolean isMarkovMatrix(double[][] m)

 Write a test program that prompts the user to enter a 3 * 3 matrix of double
 values and tests whether it is a Markov matrix. Here are sample runs:

 Enter a 3-by-3 matrix row by row:
 0.15 0.875 0.375
 0.55 0.005 0.225
 0.30 0.12 0.4
 It is a Markov matrix

 Enter a 3-by-3 matrix row by row:
 0.95 -0.875 0.375
 0.65 0.005 0.225
 0.30 0.22 -0.4
 It is not a Markov matrix

 */
public class Exercise_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] m = new double[3][3];

        // Prompt user for matrix input
        System.out.println("Enter a 3-by-3 matrix row by row:");
        for(int row = 0; row < m.length; row++){
            for(int col = 0; col < m[row].length; col++){
                m[row][col] = input.nextDouble();
            }
        }

        // Print out if isMarkovMatrix is true or false
        System.out.println((isMarkovMatrix(m) ? "It is a Markov matrix" : "It is not a Markov matrix"));

    }

    /** Use isMarkovMatrix to determine if each element is positive and each column totals to 1 */
    public static boolean isMarkovMatrix(double[][] m){
        // Check if any value is < 0, if true, return false, otherwise add to colTotal
        for(int col = 0; col < m.length; col++){
            double colTotal = 0;
            for(int row = 0; row < m[col].length; row++){
                if(m[row][col] < 0)
                    return false;

                colTotal += m[row][col];
            }

            // If colTotal != 1, return false
            if(colTotal != 1)
                return false;
        }

        // Otherwise return true
        return true;
    }
}
