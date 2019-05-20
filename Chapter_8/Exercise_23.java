package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 3/7/2018.

 (Game: find the flipped cell) Suppose you are given a 6-by-6 matrix filled with
 0s and 1s. All rows and all columns have an even number of 1s. Let the user flip
 one cell (i.e., flip from 1 to 0 or from 0 to 1) and write a program to find which
 cell was flipped. Your program should prompt the user to enter a 6-by-6 array
 with 0s and 1s and find the first row r and first column c where the even number
 of the 1s property is violated (i.e., the number of 1s is not even). The flipped cell
 is at (r, c). Here is a sample run:

 Enter a 6-by-6 matrix row by row:
 1 1 1 0 1 1
 1 1 1 1 0 0
 0 1 0 1 1 1
 1 1 1 1 1 1
 0 1 1 1 1 0
 1 0 0 0 0 1
 The flipped cell is at (0, 1)

 */
public class Exercise_23 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];

        // Prompt user to enter matrix
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row: ");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                matrix[row][col] = input.nextInt();
            }
        }

        System.out.printf("\nThe flipped cell is at (%1d, %1d)", checkEvenRows(matrix), checkEvenCols(matrix));

    }

    /** Use checkEvenRows to check if each row has an even number of 1's */
    public static int checkEvenRows(int[][] matrix){
        // Use ones to count each row
        int ones = 0;

        // Use nested for loop to check each row for ones
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                // Check if cols in a row are == 1, if true ones++
                if(matrix[row][col] == 1)
                    ones++;
            }

            // If any row doesn't contain even number of 1's return this col
            if(ones % 2 != 0)
                return row;

            // Reset counter for next row
            ones = 0;
        }

        // If all rows have even number of 1's, return -1
        return -1;
    }

    /** Use checkEvenRows to check if each row has an even number of 1's */
    public static int checkEvenCols(int[][] matrix){
        // Use ones to count each row
        int ones = 0;

        // Use nested for loop to check each row for ones
        for(int col = 0; col < matrix.length; col++){
            for(int row = 0; row < matrix[col].length; row++){
                // Check if cols in a row are == 1, if true ones++
                if(matrix[row][col] == 1)
                    ones++;
            }

            // If any row doesn't contain even number of 1's return this col
            if(ones % 2 != 0)
                return col;

            // Reset counter for next row
            ones = 0;
        }

        // If all rows have even number of 1's, return -1
        return -1;
    }
}
