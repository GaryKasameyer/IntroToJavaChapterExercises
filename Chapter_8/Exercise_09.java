package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 5/16/2017.

 (Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
 marking an available cell in a 3 * 3 grid with their respective tokens (either
 X or O). When one player has placed three tokens in a horizontal, vertical, or
 diagonal row on the grid, the game is over and that player has won. A draw (no
 winner) occurs when all the cells on the grid have been filled with tokens and
 neither player has achieved a win. Create a program for playing tic-tac-toe.

 The program prompts two players to enter an X token and O token alternately.
 Whenever a token is entered, the program redisplays the board on the
 console and determines the status of the game (win, draw, or continue). Here
 is a sample run:

 ——————-——————
 |      |       |      |
 ——————-——————
 |      |       |      |
 ——————-——————
 |      |       |      |
 ——————-——————
 Enter a row (0, 1, or 2) for player X: 1
 Enter a column (0, 1, or 2) for player X: 1

 ——————-——————
 | | | |
 ——————-——————
 | | X | |
 ——————-——————
 | | | |
 ——————-——————
 Enter a row (0, 1, or 2) for player O: 1
 Enter a column (0, 1, or 2) for player O: 2

 ——————-——————
 |      |       |      |
 ——————-——————
 |      |   X   |  O   |
 ——————-——————
 |      |       |      |
 ——————-——————

 */
public class Exercise_09 {
    static String winner = "";
    public static final int X = 1;
    public static final int O = 0;
    public static final int freeCell = -1;
    public static void main(String[] args) {
        final int xTurn = 0;
        final int oTurn = 1;
        int currentTurn = xTurn;
        int row = -1;
        int col = -1;
        Scanner input = new Scanner(System.in);

        int[][] board = new int[3][3];

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                board[i][j] = freeCell;
            }
        }

        printBoard(board);

        while(!checkWin(board)){
            System.out.print("Enter a row (0, 1, or 2) for player " + checkCell(currentTurn) + ": ");
            row = input.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player " + checkCell(currentTurn) + ": ");
            col = input.nextInt();

            while(board[row][col] != freeCell) {
                System.out.println("\nCell occupied, Try Again");
                System.out.print("Enter a row (0, 1, or 2) for player " + checkCell(currentTurn) + ": ");
                row = input.nextInt();
                System.out.print("Enter a column (0, 1, or 2) for player " + checkCell(currentTurn) + ": ");
                col = input.nextInt();
            }
            if(board[row][col] == freeCell)
                board[row][col] = currentTurn;

            if(currentTurn == xTurn){
                currentTurn = oTurn;
            }else
                currentTurn = xTurn;

            printBoard(board);
        }

        System.out.print(winner + " is the winner");

    }
    public static boolean checkDraw(int[][] board){
        boolean draw = true;

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j ++){
                if(board[i][j] == freeCell){
                    draw = false;
                }
            }
        }

        return draw;
    }

    public static boolean checkWin(int[][] board){
        boolean win = false;


        //Check 3 columns, 3 rows, and both diagonals for a Win.
        if(board[0][0] == X && board[0][1] == X && board[0][2] == X ||
                board[1][0] == X && board[1][1] == X && board[1][2] == X ||
                board[2][0] == X && board[2][1] == X && board[2][2] == X ||
                board[0][0] == X && board[1][0] == X && board[2][0] == X ||
                board[0][1] == X && board[1][1] == X && board[2][1] == X ||
                board[0][2] == X && board[1][2] == X && board[2][2] == X ||
                board[0][0] == X && board[1][1] == X && board[2][2] == X ||
                board[0][2] == X && board[1][1] == X && board[2][0] == X){
            win = true;
            winner = "X";
        }else if(board[0][0] == O && board[0][1] == O && board[0][2] == O ||
                board[1][0] == O && board[1][1] == O && board[1][2] == O ||
                board[2][0] == O && board[2][1] == O && board[2][2] == O ||
                board[0][0] == O && board[1][0] == O && board[2][0] == O ||
                board[0][1] == O && board[1][1] == O && board[2][1] == O ||
                board[0][2] == O && board[1][2] == O && board[2][2] == O ||
                board[0][0] == O && board[1][1] == O && board[2][2] == O ||
                board[0][2] == O && board[1][1] == O && board[2][0] == O){
            win = true;
            winner = "O";
        }else if(checkDraw(board)){
            System.out.println("Game is a Draw!");
            System.exit(0);
        }

        return win;
    }

    public static void printBoard(int[][] board){
        System.out.println("——————-————");
        System.out.println("|  " + checkCell(board[0][0]) + "  |  " + checkCell(board[0][1]) + "  |  " + checkCell(board[0][2]) + "  |");
        System.out.println("——————-————");
        System.out.println("|  " + checkCell(board[1][0]) + "  |  " + checkCell(board[1][1]) + "  |  " + checkCell(board[1][2]) + "  |");
        System.out.println("——————-————");
        System.out.println("|  " + checkCell(board[2][0]) + "  |  " + checkCell(board[2][1]) + "  |  " + checkCell(board[2][2]) + "  |");
        System.out.println("——————-————");
    }

    public static char checkCell(int x){
        if(x == -1){
            return ' ';
        }else if(x == 0){
            return 'O';
        }else
            return 'X';
    }
}
