package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 1/6/2018.

 (Pattern recognition: four consecutive equal numbers) Write the following
 method that tests whether a two-dimensional array has four consecutive numbers
 of the same value, either horizontally, vertically, or diagonally.

 public static boolean isConsecutiveFour(int[][] values)

 Write a test program that prompts the user to enter the number of rows and columns
 of a two-dimensional array and then the values in the array and displays
 true if the array contains four consecutive numbers with the same value. Otherwise,
 display false. Here are some examples of the true cases:

 0 1 0 3 1 6 1      0 1 0 3 1 6 1       0 1 0 3 1 6 1       0 1 0 3 1 6 1
 0 1 6 8 6 0 1      0 1 6 8 6 0 1       0 1 6 8 6 0 1       0 1 6 8 6 0 1
 5 6 2 1 8 2 9      5 5 2 1 8 2 9       5 6 2 1 6 2 9       9 6 2 1 8 2 9
 6 5 6 1 1 9 1      6 5 6 1 1 9 1       6 5 6 6 1 9 1       6 9 6 1 1 9 1
 1 3 6 1 4 0 7      1 5 6 1 4 0 7       1 3 6 1 4 0 7       1 3 9 1 4 0 7
 3 3 3 3 4 0 7      3 5 3 3 4 0 7       3 6 3 3 4 0 7       3 3 3 9 4 0 7

 [3,3,3,3]last row, [5,5,5,5]col 1,    [6,6,6,6]col 1,2,3,4 [9,9,9,9]col 0, 1, 2 3

 0 1 0 3 1 6 1
 0 1 6 8 6 0 1
 5 6 2 1 8 2 9
 6 5 6 1 1 9 1
 1 3 6 1 4 0 7
 3 3 3 3 4 0 7

 0 1 0 3 1 6 1
 0 1 6 8 6 0 1
 9 6 2 1 8 2 9
 6 9 6 1 1 9 1
 1 3 9 1 4 0 7
 3 3 3 9 4 0 7

 0 1 0 3 1 6 1
 0 1 6 8 6 0 1
 9 6 2 1 8 2 9
 6 9 6 1 1 9 1
 1 3 9 1 4 0 7
 3 3 3 9 4 0 7

 */
public class Exercise_19 {
    public static void main(String[] args) {
        int numberOfRows, numberOfColumns;

        // Prompt the user for size of array
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        numberOfRows = input.nextInt();

        System.out.print("Enter the number of columns: ");
        numberOfColumns = input.nextInt();

        // Create the array from the rows and cols
        int[][] connected = new int[numberOfRows][numberOfColumns];

        // Prompt user to enter enter the array
        System.out.print("Enter the values in the array: ");
        for(int row = 0; row < connected.length; row++){
            for(int col = 0; col < connected[row].length; col++){
                connected[row][col] = input.nextInt();
            }
        }

        System.out.print("is consecutive four: " + isConsecutiveFour(connected));

    }


    public static boolean isConsecutiveFour(int[][] values){
        if(checkDiagonals(values))
            return true;
        else if(checkRows(values))
            return true;
        else if(checkColumns(values))
            return true;
        else
            return false;
    }

    // Use checkDiagonals to check if the int[][] has four consecutive integers on any diagonal
    public static boolean checkDiagonals(int[][] connected){
        // Check for 4 equiv0cal diagonals descending from left to right
        for(int rows = 0; rows < connected.length; rows++){
            for(int cols = 0; cols < connected[rows].length; cols++){
                if(cols < connected[rows].length - 3 && rows < connected.length - 3){
                    if(connected[rows][cols] == connected[rows][cols] &&
                            connected[rows][cols] == connected[rows + 1][cols + 1] &&
                            connected[rows][cols] == connected[rows + 2][cols + 2] &&
                            connected[rows][cols] == connected[rows + 3][cols + 3])
                        return true;
                }
            }
        }

        // Check for 4 equivocal diagonals ascending from left to right
        for(int rows = connected.length; rows >= 0; rows--){
            for(int cols = connected[rows].length; cols >= 0; cols--){
                if(cols > 2 && rows > 2){
                    if(connected[rows][cols] == connected[rows][cols] &&
                            connected[rows][cols] == connected[rows - 1][cols - 1] &&
                            connected[rows][cols] == connected[rows - 2][cols - 2] &&
                            connected[rows][cols] == connected[rows - 3][cols - 3])
                        return true;
                }
            }
        }


        return false;
    }

    /** Use checkRows to check if the int[][] has four consecutive intergers on any row */
    public static boolean checkRows(int[][] connected){
        // Use for loop to go through all rows
        for(int rows = 0; rows < connected.length; rows++){
            // Use second for loop to check the columns of each row's
            for(int col = 0; col < connected[rows].length - 3; col++){
                // Check if four columns are equal, if they are return true
                if(connected[rows][col] == connected[rows][col + 1] &&
                        connected[rows][col] == connected[rows][col + 2] &&
                        connected[rows][col] == connected[rows][col + 3])
                    return true;
            }
        }

        // If it hasn't returned true then no rows have four equal columns so return false
        return false;
    }

    /** Use checkRows to check if the int[][] has four consecutive intergers on any column */
    public static boolean checkColumns(int[][] connected){
        // Use for loop to go through all rows
        for(int col = 0; col < connected.length; col++){
            // Use second for loop to check the columns of each row's
            for(int rows = 0; rows < connected[col].length - 3; rows++){
                // Check if four columns are equal, if they are return true
                if(connected[rows][col] == connected[rows + 1][col] &&
                        connected[rows][col] == connected[rows + 2][col] &&
                        connected[rows][col] == connected[rows + 3][col])
                    return true;
            }
        }

        // If it hasn't returned true then no rows have four equal columns so return false
        return false;
    }
}
