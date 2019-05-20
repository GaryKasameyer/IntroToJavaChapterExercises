package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 3/17/2018.

 (Identical arrays) The two-dimensional arrays m1 and m2 are identical if they
 have the same contents. Write a method that returns true if m1 and m2 are identical,
 using the following header:

 public static boolean equals(int[][] m1, int[][] m2)

 Write a test program that prompts the user to enter two 3 * 3 arrays of integers
 and displays whether the two are identical. Here are the sample runs.

 Enter list1: 51 25 22 6 1 4 24 54 6
 Enter list2: 51 22 25 6 1 4 24 54 6
 The two arrays are identical

 Enter list1: 51 5 22 6 1 4 24 54 6
 Enter list2: 51 22 25 6 1 4 24 54 6
 The two arrays are not identical

 */
public class Exercise_29 {
    public static void main(String[] args) {
        int[][] m1 = new int[3][3], m2 = new int[3][3];

        // Prompt user to enter values
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        for(int row = 0; row < m1.length; row++){
            for(int col = 0; col < m1[row].length; col++){
                m1[row][col] = input.nextInt();
            }
        }

        System.out.print("Enter list2: ");
        for(int row = 0; row < m2.length; row++){
            for(int col = 0; col < m2[row].length; col++){
                m2[row][col] = input.nextInt();
            }
        }

        // Print out if the lists are identical
        System.out.println(equals(m1, m2) ? "The two arrays are identical" : "The two arrays are not identical");


    }

    public static boolean equals(int[][] m1, int[][] m2){
        boolean[][] isIdentical = new boolean[3][3];
        int i = 0, j = 0;

        // Use while loop to control checking of each item in m1 and m2
        int count = 0;
        while (count <= 8){
            // Create temp for each values in m1
            int temp = m1[i][j];

            // Use nested for loops to test temp against every time in m2
            for(int row = 0; row < 3; row++){
                for(int col = 0; col < 3; col++){
                    // If temp == any value in m2, leave that position in m2 false, and break the looping
                    if(temp == m2[row][col]){
                        isIdentical[i][j] = true;
                        break;
                    }
                }
            }

            // Check and adjust i and j to control which values in m1 are checked
            if(j == 2){
                j = 0;
                i++;
            } else
                j++;

            // Increase counter to prevent endless loop
            count++;
        }

        // Check if isIdentical contains a false
        for(int row = 0; row < isIdentical.length; row++){
            for(int col = 0; col < isIdentical[row].length; col++){
                if(!isIdentical[row][col])
                    return false;
            }
        }

        // Otherwise return true
        return true;
    }
}
