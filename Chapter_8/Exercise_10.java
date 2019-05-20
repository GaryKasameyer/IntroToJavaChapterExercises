package Chapter8_Exercises;

/**
 * Created by Gary Kasameyer on 12/11/2017.

 (Largest row and column) Write a program that randomly fills in 0s and 1s into
 a 4-by-4 matrix, prints the matrix, and finds the first row and column with the
 most 1s. Here is a sample run of the program:

 0011
 0011
 1101
 1010
 The largest row index: 2
 The largest column index: 2

 */
public class Exercise_10 {
    public static void main(String[] args) {
        int[][] randomMatrix = createRandomMatrix();
        int largestRowIndex = 0, largestColumnIndex = 0, largestRowValue, largestColumnValue, currentRowValue, currentColumnValue;

        // Calculate the value of the largestRowValue and largestColumnValue with countRow and countColumn
        largestRowValue = countRow(randomMatrix, largestRowIndex);
        largestColumnValue = countColumn(randomMatrix, largestColumnIndex);

        // Use nested for loop to count all rows and columns and test if any are > largestRow or largestCol
        for(int row = 1; row < randomMatrix.length; row++){
            currentRowValue = countRow(randomMatrix, row);
            currentColumnValue = countColumn(randomMatrix, row);

            if(currentRowValue > largestRowValue){
                largestRowValue = currentRowValue;
                largestRowIndex = row;
            }if(currentColumnValue > largestColumnValue){
                largestColumnValue = currentColumnValue;
                largestColumnIndex = row;
            }
        }

        // Print out the randomMatrix, largestColumnIndex and largestRowIndex
        for(int row = 0; row < randomMatrix.length; row++){
            for(int col = 0; col < randomMatrix[row].length; col++){
                System.out.print(randomMatrix[row][col]);
            }
            System.out.println();
        }
        System.out.printf("The largest row index: %1d\nThe largest column index: %1d", largestRowIndex, largestColumnIndex);

    }

    /** Use createRandomMatrix to create a 4-by-4 matrix of random 1's and 0's */
    public static int[][] createRandomMatrix(){
        int[][] randomMatrix = new int[4][4];

        // Use nested for loop to populate randomMatrix with random 1's and 0's
        for(int row = 0; row < randomMatrix.length; row++){
            for(int col = 0; col < randomMatrix[row].length; col++){
                randomMatrix[row][col] = (int)(Math.random() * ((1) + 1));
            }
        }

        return randomMatrix;
    }

    /** Use countRow to return the int value of the row total */
    public static int countRow(int[][] randomMatrix, int row){
        int rowValue = 0;

        for(int x = row + 1; row < x; row++){
            for(int col = 0; col < randomMatrix[row].length; col++){
                if(randomMatrix[row][col] == 1)
                    rowValue++;
            }
        }

        return rowValue;
    }

    /** Use countColumn to return the int value of the column total */
    public static int countColumn(int[][] randomMatrix, int col){
        int colValue = 0;

        for(int x = col + 1; col < x; col++){
            for(int row = 0; row < randomMatrix[col].length; row++){
                if(randomMatrix[row][col] == 1)
                    colValue++;
            }
        }

        return colValue;
    }
}
































