package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 3/17/2018.

 (Column sorting) Implement the following method to sort the columns in a twodimensional
 array. A new array is returned and the original array is intact.

 public static double[][] sortColumns(double[][] m)

 Write a test program that prompts the user to enter a 3 * 3 matrix of double
 values and displays a new column-sorted matrix. Here is a sample run:

 Enter a 3-by-3 matrix row by row:
 0.15 0.875 0.375
 0.55 0.005 0.225
 0.30 0.12 0.4

 The column-sorted array is
 0.15 0.0050 0.225
 0.3 0.12 0.375
 0.55 0.875 0.4

 */

public class Exercise_27 {
    public static void main(String[] args) {
        double[][] m = new double[3][3];

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for(int row = 0; row < m.length; row++){
            for(int col = 0; col < m[row].length; col++){
                m[row][col] = input.nextDouble();
            }
        }

        // Create new [][] to hold the sorted column
        double[][] sorted = sortColumns(m);

        // Print out the row sorted array
        for(int row = 0; row < sorted.length; row++){
            for(int col = 0; col < sorted[row].length; col++){
                System.out.print(sorted[row][col] + " ");
            }
            System.out.println();
        }
    }

    /** Use sortColumns to sort columns of the array */
    public static double[][] sortColumns(double[][] m){
        // Check each item against the next, if second item < first item, swap them
        for(int col = 0; col < m.length; col++){
            for(int row = 1; row < m[col].length; row++){
                if(m[row][col] < m[row - 1][col])
                    swap(m, col, row, row - 1);
            }
        }

        return m;
    }

    /** Use swap to switch positions of two elements */
    public static void swap(double[][] list, int col, int i, int j){
        // Swap list[i] with list[j]
        double temp = list[i][col];
        list[i][col] = list[j][col];
        list[j][col] = temp;
    }
}
