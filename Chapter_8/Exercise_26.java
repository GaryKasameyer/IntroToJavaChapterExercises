package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 3/17/2018.

 (Row sorting) Implement the following method to sort the rows in a twodimensional
 array. A new array is returned and the original array is intact.

 public static double[][] sortRows(double[][] m)

 Write a test program that prompts the user to enter a 3 * 3 matrix of double
 values and displays a new row-sorted matrix. Here is a sample run:

 Enter a 3-by-3 matrix row by row:
 0.15 0.875 0.375
 0.55 0.005 0.225
 0.30 0.12 0.4

 The row-sorted array is
 0.15 0.375 0.875
 0.005 0.225 0.55
 0.12 0.30 0.4

 */
public class Exercise_26 {
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

        // Create [][] to hold sorted [][]
        double[][] sorted = sortRows(m);

        // Print out the row sorted array
        for(int row = 0; row < sorted.length; row++){
            for(int col = 0; col < sorted[row].length; col++){
                System.out.print(sorted[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] sortRows(double[][] m){
        // Check if second item < first item, if true, swap them
        for(int row = 0; row < m.length; row++){
            for(int col = 1; col < m[row].length; col++){
                if(m[row][col] < m[row][col - 1])
                    swap(m, row, col, col - 1);
            }
        }

        return m;
    }

    /** Use swap to switch positions of two elements */
    public static void swap(double[][] list, int row, int i, int j){
        // Swap list[i] with list[j]
        double temp = list[row][i];
        list[row][i] = list[row][j];
        list[row][j] = temp;
    }
}
