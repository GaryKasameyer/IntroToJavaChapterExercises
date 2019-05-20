package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/11/2017.

 (Explore matrix) Write a program that prompts the user to enter the length of a
 square matrix, randomly fills in 0s and 1s into the matrix, prints the matrix, and
 finds the rows, columns, and diagonals with all 0s or 1s. Here is a sample run of
 the program:

 */
public class Exercise_14 {
    public static void main(String[] args) {
        // Create variables for array
        Scanner input = new Scanner(System.in);
        int[][] intArray;
        int size, rowFalse = 0, colFalse = 0;
        boolean mDiagonal = true, subDiagonal = true,
                row, col;

        // Prompt user for prompt and create array
        System.out.print("Enter the size of the square matrix: ");
        size = input.nextInt();
        intArray = new int[size][size];

        // Populate array with random 1's and 0's
        for(int i = 0; i < intArray.length; i++){
            for(int j = 0; j < intArray[i].length; j++){
                intArray[i][j] = (int)(Math.random() * (2));
            }
        }

        // Print the array
        for(int i = 0; i < intArray.length; i++){
            for(int j = 0; j < intArray[i].length; j++){
                System.out.print(intArray[i][j]);
                if(j == size - 1)
                    System.out.println();
            }
        }

        // Check rows for all same numbers
        for(int i = 0; i < intArray.length; i++){
            row = true;
            for(int j = 0; j < intArray.length; j++){
                if(intArray[i][j] != intArray[i][0])
                    row = false;
            }
            if(row)
                System.out.println("All " + intArray[i][0] + "'s on row " + i);
            else
                rowFalse += 1;
        }
        if(rowFalse == 4)
            System.out.println("No same number on any row");

        // Check cols for all same numbers
        for(int i = 0; i < intArray.length; i++){
            col = true;
            for(int j = 0; j < intArray[i].length; j++){
                if(intArray[0][i] != intArray[j][i])
                    col = false;
            }
            if(col)
                System.out.println("All " + intArray[0][i] + "'s on column " + i);
            else
                colFalse += 1;
        }
        if(colFalse == 4)
            System.out.println("No same number on any column");

        // Check Major Diagonal for all 1's or 0's
        for(int i = 0; i < intArray.length; i++){
                if(intArray[i][i] != intArray[0][0])
                    mDiagonal = false;
        }
        if(mDiagonal)
            System.out.println("All " + intArray[0][0] + "'s on the major diagonal");
        else
            System.out.println("No same number on the major diagonal");

        // Check Sub Diagonal for all 1's or 0's
        for(int i = 0,j = intArray.length-1; i < intArray.length; i++, j--){
                if(intArray[i][j] != intArray[0][intArray.length-1])
                    subDiagonal = false;
        }
        if(subDiagonal)
            System.out.println("All " + intArray[0][intArray.length-1] + "'s on the sub diagonal");
        else
            System.out.println("No same number on the sub diagonal");
    }
}
