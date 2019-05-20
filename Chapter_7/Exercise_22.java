package Chapter7_Exercises;

/**
 * Created by Gary Kasameyer on 11/15/2017.

 (Game: Eight Queens) The classic Eight Queens puzzle is to place eight queens
 on a chessboard such that no two queens can attack each other (i.e., no two queens
 are on the same row, same column, or same diagonal). There are many possible
 solutions. Write a program that displays one such solution. A sample output is
 shown below:

 |Q| | | | | | | |
 | | | | |Q| | | |
 | | | | | | | |Q|
 | | | | | |Q| | |
 | | |Q| | | | | |
 | | | | | | |Q| |
 | |Q| | | | | | |
 | | | |Q| | | | |

 /*if(chessBoard[i] == 1)
 System.out.println((i / 8) + " row, " + (i % 8) + " column");

 */

public class Exercise_22 {
    public static void main(String[] args) {
        int[] chessBoard = new int[64];

        // Place a Q on each row and column
        generateRowsAndColumns(chessBoard);

        // move and check all diagonals until no queens share a diagonal
        checkDiagonals(chessBoard);

        // Print out the chessboard
        for(int i = 0; i < chessBoard.length; i++) {
            System.out.print((chessBoard[i] == 0) ? "| " : "|Q");
            System.out.print(((i + 1) % 8 == 0) ? "|\n" : "");
        }
    }

    /** Use generateRow to place a queen on each row, then check that no two queens fall on the same row */
    public static void generateRowsAndColumns(int[] chessBoard){
        for(int i = 0; i < chessBoard.length; i += 9)
            chessBoard[i] = 1;
    }

    /** Use checkDiagonals to check each diagonal and make sure no two queens are on the same diagonal */
    public static void checkDiagonals(int[] chessBoard){
        boolean allDiagonalsClear = false, thisDiagonalClear;

        // Use while loop to continue checking all queens
        // if queen diagonals intersect
        // move the queen within that row
        // when all queens are checked and do not intersect end while loop with boolean
        while(!allDiagonalsClear){
            // Make queen final int so its easier to read
            final int QUEEN = 1;

            // Use this for loop to check all queens
            for(int queenCheck = 0; queenCheck < chessBoard.length; queenCheck++){

                // Use these int's to find and move Q's, it has each row, column and position, relative to for loop
                int row = (queenCheck / 8), column = (queenCheck % 8), position = (row * 8) + column;

                // Check if diagonal position (9 indexes from current position) is == Queen)
                if(chessBoard[position + 9] == QUEEN){
                    thisDiagonalClear = false;

                    // Check if movement 1 over is contained in this row and if the diagonal from that position is clear
                    while (!thisDiagonalClear){
                        if(chessBoard[position + 1] <= row * 8 && position + 1 < 64){
                            chessBoard[position] = 0;
                            chessBoard[position + 1] = QUEEN;

                            if(position + 10 <= 63 && chessBoard[position + 10] != QUEEN){
                                thisDiagonalClear = true;
                            }else if((position + 10) >= 64){
                                if(chessBoard[position - 9] != QUEEN){
                                    chessBoard[position] = 0;
                                    chessBoard[position - 1] = QUEEN;
                                }
                            }
                        }
                    }
                }
            }
            allDiagonalsClear = true;
        }
    }
}
