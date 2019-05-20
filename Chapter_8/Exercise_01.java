package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 5/10/17.

 (Sum elements column by column) Write a method that returns the sum of all the
 elements in a specified column in a matrix using the following header:

 public static double sumColumn(double[][] m, int columnIndex)

 Write a test program that reads a 3-by-4 matrix and displays the sum of each
 column. Here is a sample run:

 Enter a 3-by-4 matrix row by row:
 1.5 2 3 4
 5.5 6 7 8
 9.5 1 3 1
 Sum of the elements at column 0 is 16.5
 Sum of the elements at column 1 is 9.0
 Sum of the elements at column 2 is 13.0
 Sum of the elements at column 3 is 13.0

 */
public class Exercise_01 {
    public static void main(String[] args) {
        double[][] a = new double[3][4];

        // Prompt user to enter matrix
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row: ");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }

        // Call and print matrix with sumColumn and col
        for (int col = 0; col <= a.length; col++) {
            System.out.println("The sum of column " + col + " is " + sumColumn(a, col));
        }
    }

    // Sum a single column and return the result
    public static double sumColumn(double[][] m, int columnIndex){
        double sum = 0;

        for(int row = 0; row < m.length; row++){
            sum += m[row][columnIndex];
        }
        return sum;
    }
}
