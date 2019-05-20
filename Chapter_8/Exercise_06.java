package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 5/12/17.

 (Algebra: multiply two matrices) Write a method to multiply two matrices. The
 header of the method is:

 public static double[][]
    multiplyMatrix(double[][] a, double[][] b)

 To multiply matrix a by matrix b , the number of columns in a must be the same as
 the number of rows in b , and the two matrices must have elements of the same or
 compatible types. Let c be the result of the multiplication. Assume the column size
 of matrix a is n . Each element cij is ai1 * b1j + ai2 * b2j + ... + ain * bnj.
 For example, for two 3 x 3 matrices a and b, c is

  / a11 a12 a13 \     / b11 b12 b13 \     / a11 * b11  a12 * b12  a13 * b13 \
 |  a21 a22 a23  | * |  b21 b22 b23  | = |  a21 * b21  a22 * b22  a23 * b23  |
  \ a31 a32 a33 /     \ b31 b32 b33 /     \ a31 * b31  a32 * b32  a33 * b33 /


 where cij = ai1 * b1j + ai2 * b2j + ai3 * b3j

 Write a test program that prompts the user to enter two 3 * 3 matrices and dis-
 plays their product. Here is a sample run:

 Enter matrix1: 1 2 3 4 5 6 7 8 9
 Enter matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2
 The multiplication of the matrices is
 1 2 3   0 2.0 4.0     5.3 23.9 24
 4 5 6 * 1 4.5 2.2   = 11.6 56.3 58.2
 7 8 9   1.1 4.3 5.2   17.9 88.7 92.4

 (1 * 0) + (2 * 1) + (3 * 1.1) = 5.3
 (1 * 2.0) + (2 * 4.5) + (3 * 4.3) = 23.9
 (1 * 4.0) + (2 * 2.2) + (3 * 5.2) = 24

 */
public class Exercise_06 {
    public static void main(String[] args) {
        double[][] a = getMatrix(), b = getMatrix(), c = multiplyMatrix(a, b);
        printMatrix(c);
    }

    /** Use getMatrix to create a matrix from user input */
    public static double[][] getMatrix(){
        // Create Scanner and double[][] to be populated
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a matrix: ");
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

    /** Use multiplyMatrix to return a double[][] with the multiplied elements of double[][] a and b */
    public static double[][] multiplyMatrix(double[][] a, double[][] b){
        // Create the matrix to hold the result
        double[][] c = new double[3][3];

        // Use nested for loop to loop through both arrays, multiply the elements and populate c with the result
        for(int i = 0; i < c.length; i++){
            for(int j = 0; j < c.length; j++){
                c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
            }
        }

        return c;
    }

    /** Use printMatrix to print a matrix */
    public static void printMatrix(double[][] c){
        // Use nested for loops to print out the array
        for(int row = 0; row < c.length; row++){
            for(int col = 0; col < c[row].length; col++){
                System.out.printf("%1.1f ", c[row][col]);
            }
            System.out.println();
        }
    }
}
