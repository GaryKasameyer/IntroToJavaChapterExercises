package Chapter8_Exercises;

/**
 * Created by Gary Kasameyer on 3/7/2018.

 (Even number of 1s) Write a program that generates a 6-by-6 two-dimensional
 matrix filled with 0s and 1s, displays the matrix, and checks if every row and
 every column have an even number of 1s.

 */
public class Exercise_22 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        boolean evenNotZero = false;
        while(!evenNotZero) {
            randomMatrix(matrix);
            if(!checkZero(matrix) && checkEven(matrix))
                evenNotZero = true;
        }

        // Print out the matrix to test
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }


        // Print out the value of checkEven
        System.out.print("The matrix has even columns and rows is " + checkEven(matrix));

    }

    /** Use randomMatrix to populate a matrix with random 0's and 1's */
    public static void randomMatrix(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                matrix[row][col] = (int)(Math.random() * 2);
            }
        }
    }

    /** Use checkZero to see if the entire int[][] is filled with 0's */
    public static boolean checkZero(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                if(matrix[row][col] != 0)
                    return false;
            }
        }
        return true;
    }

    /** Use checkEvenRows to check if each row has an even number of 1's */
    public static boolean checkEven(int[][] matrix){
        return (checkEvenRows(matrix) && checkEvenCols(matrix));
    }

    /** Use checkEvenRows to check if each row has an even number of 1's */
    public static boolean checkEvenRows(int[][] matrix){
        // Use ones to count each row
        int ones = 0;

        // Use nested for loop to check each row for ones
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[row].length; col++){
                // Check if cols in a row are == 1, if true ones++
                if(matrix[row][col] == 1)
                    ones++;
            }

            // If any row doesn't contain even number of 1's return false
            if(ones % 2 != 0)
                return false;

            // Reset counter for next row
            ones = 0;
        }

        // If all rows have even number of 1's, return true
        return true;
    }

    /** Use checkEvenRows to check if each row has an even number of 1's */
    public static boolean checkEvenCols(int[][] matrix){
        // Use ones to count each row
        int ones = 0;

        // Use nested for loop to check each row for ones
        for(int col = 0; col < matrix.length; col++){
            for(int row = 0; row < matrix[col].length; row++){
                // Check if cols in a row are == 1, if true ones++
                if(matrix[row][col] == 1)
                    ones++;
            }

            // If any row doesn't contain even number of 1's return false
            if(ones % 2 != 0)
                return false;

            // Reset counter for next row
            ones = 0;
        }

        // If all rows have even number of 1's, return true
        return true;
    }
}
