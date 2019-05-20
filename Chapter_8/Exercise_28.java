package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 3/17/2018.

 (Strictly identical arrays) The two-dimensional arrays m1 and m2 are strictly
 identical if their corresponding elements are equal. Write a method that returns
 true if m1 and m2 are strictly identical, using the following header:

 public static boolean equals(int[][] m1, int[][] m2)

 Write a test program that prompts the user to enter two 3 * 3 arrays of
 integers and displays whether the two are strictly identical. Here are the
 sample runs.

 Enter list1: 51 22 25 6 1 4 24 54 6
 Enter list2: 51 22 25 6 1 4 24 54 6
 The two arrays are strictly identical

 Enter list1: 51 25 22 6 1 4 24 54 6
 Enter list2: 51 22 25 6 1 4 24 54 6
 The two arrays are not strictly identical

 */
public class Exercise_28 {
    public static void main(String[] args) {
        int[][] first = new int[3][3], second = new int[3][3];

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        for(int row = 0; row < first.length; row++){
            for(int col = 0; col < first[row].length; col++){
                first[row][col] = input.nextInt();
            }
        }

        System.out.print("Enter list2: ");
        for(int row = 0; row < second.length; row++){
            for(int col = 0; col < second[row].length; col++){
                second[row][col] = input.nextInt();
            }
        }

        // print out if the arrays are identical
        System.out.print(equals(first, second) ? " The two arrays are strictly identical" : " The two arrays are not strictly identical");
    }

    /** Use equals to determine if both array are perfectly equal */
    public static boolean equals(int[][] m1, int[][] m2){
        // If any position in m1 != same position in m2 return false
        for(int row = 0; row < m1.length; row++){
            for(int col = 0; col < m1[row].length; col++){
                if(m1[row][col] != m2[row][col])
                    return false;
            }
        }
        // Otherwise return true
        return true;
    }
}
