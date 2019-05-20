package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 3/7/2018.

 (Check Sudoku solution) Listing 8.4 checks whether a solution is valid by checking
 whether every number is valid in the board. Rewrite the program by checking
 whether every row, every column, and every small box has the numbers 1 to 9.

 9 6 3 1 7 4 2 5 8
 1 7 8 3 2 5 6 4 9
 2 5 4 6 8 9 7 3 1
 8 2 1 4 3 7 5 9 6
 4 9 6 8 5 2 3 1 7
 7 3 5 9 6 1 8 2 4
 5 8 9 7 1 3 4 6 2
 3 1 7 2 4 6 9 8 5
 6 4 2 5 9 8 1 7 3

 // bad top right box
 9 6 3 1 7 4 2 5 5
 1 7 8 3 2 5 6 4 9
 2 5 4 6 8 9 7 3 1
 8 2 1 4 3 7 5 9 6
 4 9 6 8 5 2 3 1 7
 7 3 5 9 6 1 8 2 4
 5 8 9 7 1 3 4 6 2
 3 1 7 2 4 6 9 8 5
 6 4 2 5 9 8 1 7 3

 // bad bottom right box
 9 6 3 1 7 4 2 5 8
 1 7 8 3 2 5 6 4 9
 2 5 4 6 8 9 7 3 1
 8 2 1 4 3 7 5 9 6
 4 9 6 8 5 2 3 1 7
 7 3 5 9 6 1 8 2 4
 5 8 9 7 1 3 4 6 2
 3 1 7 2 4 6 9 8 5
 6 4 2 5 9 8 1 7 7

 */
public class Exercise_24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] sudoku = new int[9][9];

        // Prompt user to enter sudoku array
        System.out.println("Enter a Sudoku puzzle solution:");
        for(int row = 0; row < sudoku.length; row++){
            for(int col = 0; col < sudoku[row].length; col++){
                sudoku[row][col] = input.nextInt();
            }
        }

        // Call Checks
        System.out.println("Check rows: " + checkRows(sudoku));
        System.out.println("Check cols: " + checkColumns(sudoku));
        System.out.println("Check box: " + checkBox(sudoku));


    }

    /** Use checkRows to see if eacn row has the numbers 1 - 9 */
    public static boolean checkRows(int[][] sudoku){
        // Use bool[] to mark all number locations
        boolean[] numbers = new boolean[9];

        // Use nested for loop to go through each row and mark the value of each entry in the bool[]
        for(int row = 0; row < sudoku.length; row++){
            for(int col = 0; col < sudoku[row].length; col++){
                numbers[sudoku[row][col] - 1] = true;
            }
        }

        // Check if any number[] == false
        for(int i = 0; i < numbers.length; i++){
            if(!numbers[i])
                return false;
        }

        // Otherwise return true
        return true;
    }

    /** Use checkColumns to see if eacn row has the numbers 1 - 9 */
    public static boolean checkColumns(int[][] sudoku){
        // Use bool[] to mark all number locations
        boolean[] numbers = new boolean[9];

        // Use nested for loop to go through each row and mark the value of each entry in the bool[]
        for(int col = 0; col < sudoku.length; col++){
            for(int row = 0; row < sudoku[col].length; row++){
                numbers[sudoku[row][col] - 1] = true;
            }
        }

        // Check if any number[] == false
        for(int i = 0; i < numbers.length; i++){
            if(!numbers[i])
                return false;
        }

        // Otherwise return true
        return true;
    }

    /** Use checkbox to see if each box has the numbers 1 - 9 */
    public static boolean checkBox(int[][] sudoku) {
        // Use nested for loops to move each value in each box in sudoku to a new temp[][] using true for each 0-9
        int i = 0, j = 0;
        for (int eachSquare = 0; eachSquare < 9; eachSquare++) {
            boolean[] tempBox = new boolean[10];
            for (int row = i; row < i + 3; row++) {
                for (int col = j; col < j + 3; col++) {
                    tempBox[sudoku[row][col]] = true;
                }
            }

            // Check if any 0-9 in tempBox = false, if true, return false
            if(!checkEachBox(tempBox))
                return false;

            // Update control variables
            j += 3;

            if(j == 9) {
                j = 0;
                i += 3;
            }
        }

        // Otherwise return true
        return true;
    }

    /** Use checkEachBox to check each temp box and return boolean */
    public static boolean checkEachBox(boolean[] tempBox){
        // Check if any tempBox's are false, if true, return false
        for(int row = 1; row < tempBox.length; row++){
            if(!tempBox[row])
                return false;
        }

        // Otherwise return true
        return true;
    }

}
