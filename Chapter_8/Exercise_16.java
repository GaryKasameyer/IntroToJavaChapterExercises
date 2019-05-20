package Chapter8_Exercises;

/**
 * Created by Gary Kasameyer on 1/1/2018.

 (Sort two-dimensional array) Write a method to sort a two-dimensional array
 using the following header:

 public static void sort(int m[][])

 The method performs a primary sort on rows and a secondary sort on columns.
 For example, the following array

 {{4, 2},{1, 7},{4, 5},{1, 2},{1, 1},{4, 1}}

 will be sorted to

 {{1, 1},{1, 2},{1, 7},{4, 1},{4, 2},{4, 5}}.

 */
public class Exercise_16 {
    public static void main(String[] args) {
        int[][] m = {{4, 2},
                     {1, 7},
                     {4, 5},
                     {1, 2},
                     {1, 1},
                     {4, 1}};

        // Sort m
        sort(m);

        // Print out the int[][]
        for(int row = 0; row < m.length; row++){
            for(int col = 0; col < m[row].length; col++){
                System.out.print(m[row][col] + " ");
            }
            System.out.println();
        }

    }

    /** Use sort to check if both columns of each row are < the next,
     * moving each row that is greater than the next up with swap
     * This is a basic bubble sort */
    public static void sort(int[][] m){

        // check each row, if a row's first column is > the next row's first column
        // else if this row's columns are > the next swap them, else move on
        for(int length = m.length; length > 0; length--){
            for (int row = 0; row < m.length - 1; row++) {
                if (m[row][0] >= m[row + 1][0] && m[row][1] >= m[row + 1][1] || m[row][0] > m[row + 1][0]) {
                    swapColumns(m, row, row + 1);
                }
            }
        }
    }


    /** Use swapColumns to swap columns of two given rows */
    public static void swapColumns(int m[][], int rowOne, int rowTwo){
        int tempOne = m[rowOne][0], tempTwo = m[rowOne][1];

        m[rowOne][0] = m[rowTwo][0];
        m[rowOne][1] = m[rowTwo][1];
        m[rowTwo][0] = tempOne;
        m[rowTwo][1] = tempTwo;
    }
}




























