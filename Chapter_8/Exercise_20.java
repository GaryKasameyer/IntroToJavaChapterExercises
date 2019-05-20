package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 2/25/2018.

 (Game: connect four) Connect four is a two-player board game in which the
 players alternately drop colored disks into a seven-column, six-row vertically
 suspended grid, as shown below.

 The objective of the game is to connect four same-colored disks in a row, a column,
 or a diagonal before your opponent can do likewise. The program prompts
 two players to drop a red or yellow disk alternately. In the preceding figure, the
 red disk is shown in a dark color and the yellow in a light color. Whenever a disk
 is dropped, the program redisplays the board on the console and determines the
 status of the game (win, draw, or continue). Here is a sample run:

 | | | | | | | |
 | | | | | | | |
 | | | | | | | |
 | | | | | | | |
 | | | | | | | |
 | | | | | | | |
 ———————————————

 Drop a red disk at column (0–6): 0
 | | | | | | | |
 | | | | | | | |
 | | | | | | | |
 | | | | | | | |
 | | | | | | | |
 |R| | | | | | |
 ———————————————

 Drop a yellow disk at column (0–6): 3
 | | | | | | | |
 | | | | | | | |
 | | | | | | | |
 | | | | | | | |
 | | | | | | | |
 |R| | |Y| | | |
 . . .
 . . .
 . . .

 Drop a yellow disk at column (0–6): 6
 | | | | | | | |
 | | | | | | | |
 | | | |R| | | |
 | | | |Y|R|Y| |
 | | |R|Y|Y|Y|Y|
 |R|Y|R|Y|R|R|R|
 ———————————————
 The yellow player won

 */
public class Exercise_20 {
    public static void main(String[] args) {
        final int R = -1, Y = 1;
        boolean winner = false;
        int columnPlayed;
        Scanner input = new Scanner(System.in);
        int[][] board = new int[6][7];

        while (!winner) {
            printBoard(board);

            System.out.print("Drop a red disk at column (0-6): ");
            columnPlayed = input.nextInt();
            addDisk(board, columnPlayed, R);
            printBoard(board);
            if(checkWin(board))
                winner(board, R);
            //printBoard(board);

            System.out.print("Drop a yellow disk at column (0-6): ");
            columnPlayed = input.nextInt();
            addDisk(board, columnPlayed, Y);
            if(checkWin(board))
                winner(board, Y);

        }

    }

    /** Use addDisk to place the play disk in the column on the board, use player to define value to put in board */
    public static void addDisk(int[][] board, int columnPlayed, int player){
        for(int row = board.length - 1; row >= 0; row--){
            if(board[row][columnPlayed] == 0) {
                board[row][columnPlayed] = player;
                break;
            }
        }
    }


    /** Use printBoard to print out the board */
    public static void printBoard(int[][] board) {
        /** test print board
        for (int row = 0; row < board.length; row++){
            System.out.print("|");
            for (int col = 0; col < board[row].length; col++) {
                System.out.printf("%1d|", board[row][col]);
            }
            System.out.println();
        }
        System.out.println();**/

        // test print board
        for (int row = 0; row < board.length; row++){
            System.out.print("|");
            for (int col = 0; col < board[row].length; col++) {
                if(board[row][col] == 0)
                    System.out.print(" |");
                else if(board[row][col] == -1)
                    System.out.print("R|");
                else if(board[row][col] == 1)
                    System.out.print("Y|");
            }
            System.out.println();
        }
        System.out.println();
    }

    /** Use checkWin to see if diagonals, rows, or columns have 4 consecutive, if true call winner */
    public static boolean checkWin(int[][] values){
        if (checkDiagonals(values))
            return true;
        else if (checkRows(values))
            return true;
        else if (checkColumns(values))
            return true;
        else
            return false;
    }

    /** Use winner to print the board and display the winner */
    public static void winner(int[][] board, int player) {
        printBoard(board);
        System.out.print(player == -1 ? "The Red player won" : "The Yellow player won");
        System.exit(0);
    }

    // Use checkDiagonals to check if the int[][] has four consecutive integers on any diagonal
    public static boolean checkDiagonals(int[][] connected) {
        // Check for 4 equiv0cal diagonals descending from left to right
        for (int rows = 0; rows < connected.length; rows++) {
            for (int cols = 0; cols < connected[rows].length; cols++) {
                if (cols < connected[rows].length - 3 && rows < connected.length - 3) {
                    if (connected[rows][cols] == connected[rows + 1][cols + 1] &&
                            connected[rows][cols] == connected[rows + 2][cols + 2] &&
                            connected[rows][cols] == connected[rows + 3][cols + 3] &&
                            connected[rows][cols] != 0)
                        return true;
                }
            }
        }

        // Check for 4 equivocal diagonals ascending from left to right
        for (int rows = connected.length - 1; rows >= 0; rows--) {
            for (int cols = connected[rows].length - 2; cols >= 0; cols--) {
                if (cols > 2 && rows > 2) {
                    if (connected[rows][cols] == connected[rows - 1][cols - 1] &&
                            connected[rows][cols] == connected[rows - 2][cols - 2] &&
                            connected[rows][cols] == connected[rows - 3][cols - 3]&&
                            connected[rows][cols] != 0)
                        return true;
                }
            }
        }


        return false;
    }

    /** Use checkRows to check if the int[][] has four consecutive intergers on any row */
    public static boolean checkRows(int[][] connected) {
        // Use for loop to go through all rows
        for (int rows = 0; rows < connected.length; rows++) {
            // Use second for loop to check the columns of each row's
            for (int col = 0; col < connected[rows].length - 3; col++) {
                // Check if four columns are equal, if they are return true
                if (connected[rows][col] == connected[rows][col + 1] &&
                        connected[rows][col] == connected[rows][col + 2] &&
                        connected[rows][col] == connected[rows][col + 3]&&
                        connected[rows][col] != 0)
                    return true;
            }
        }

        // If it hasn't returned true then no rows have four equal columns so return false
        return false;
    }

    /** Use checkRows to check if the int[][] has four consecutive intergers on any column */
    public static boolean checkColumns(int[][] connected) {
        // Use for loop to go through all rows
        for (int col = 0; col < connected.length; col++) {
            // Use second for loop to check the columns of each row's
            for (int rows = 0; rows < connected[col].length - 4; rows++) {
                // Check if four columns are equal, if they are return true
                if (connected[rows][col] == connected[rows + 1][col] &&
                        connected[rows][col] == connected[rows + 2][col] &&
                        connected[rows][col] == connected[rows + 3][col] &&
                        connected[rows][col] != 0)
                    return true;
            }
        }

        // If it hasn't returned true then no rows have four equal columns so return false
        return false;
    }
}
