package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 5/12/17.

 (Algebra: add two matrices) Write a method to add two matrices. The header of
 the method is as follows:

 public static double[][] addMatrix(double[][] a, double[][] b){}

 In order to be added, the two matrices must have the same dimensions and the
 same or compatible types of elements. Let c be the resulting matrix. Each ele-
 ment c(ij) is a(ij) + b(ij) . For example, for two 3 x 3 matrices a and b , c is

  / a11 a12 a13 \     / b11 b12 b13 \     / a11 + b11  a12 + b12  a13 + b13 \
 |  a21 a22 a23  | + |  b21 b22 b23  | = |  a21 + b21  a22 + b22  a23 + b23  |
  \ a31 a32 a33 /     \ b31 b32 b33 /     \ a31 + b31  a32 + b32  a33 + b33 /

 Write a test program that prompts the user to enter two 3 * 3 matrices and
 displays their sum. Here is a sample run:

 Enter matrix1: 1 2 3 4 5 6 7 8 9
 Enter matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2
 The matrices are added as follows
 1.0 2.0 3.0   0.0 2.0 4.0   1.0 4.0 7.0
 4.0 5.0 6.0 + 1.0 4.5 2.2 = 5.0 9.5 8.2
 7.0 8.0 9.0   1.1 4.3 5.2   8.1 12.3 14.2

 */
public class Exercise_05 {
    public static void main(String[] args) {
        double[][] a = getMatrix();
        double[][] b = getMatrix();
        double[][] c = addMatrix(a, b);

        printMatrix(c);
    }

    /** Use getMatrix to create a matrix from user input */
    public static double[][] getMatrix(){
        // Create Scanner and double[][] to be populated
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the matrix: ");
        double[][] temp = new double[3][3];

        // Use nested for loops to create
        for(int i = 0; i < temp.length; i++){
            for(int j = 0; j < temp[i].length; j++){
                temp[i][j] = input.nextDouble();
            }
        }

        // return the initialized array
        return temp;
    }

    /** Use addMatrix to add maxtrixs a and b and return them as matrix c */
    public static double[][] addMatrix(double[][] a, double[][] b){
        // Create the array to populate with the added arrays elements
        double[][] c = new double[3][3];

        // Add the arrays together and populate the c with the result
        for(int row = 0; row < a.length; row++){
            for(int col = 0; col < a[row].length; col++){
                c[row][col] = a[row][col] + b[row][col];
            }
        }

        // Return the added matrix
        return c;
    }

    /** Use printMatrix to print a matrix */
    public static void printMatrix(double[][] c){
        for(int row = 0; row < c.length; row++){
            for(int col = 0; col < c[row].length; col++){
                System.out.print(c[row][col] + " ");
            }
            System.out.println();
        }
    }
}
