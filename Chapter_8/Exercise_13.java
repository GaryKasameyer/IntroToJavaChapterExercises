package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/10/2017.

 (Locate the largest element) Write the following method that returns the location
 of the largest element in a two-dimensional array.

 public static int[] locateLargest(double[][] a)

 The return value is a one-dimensional array that contains two elements. These
 two elements indicate the row and column indices of the largest element in the
 two-dimensional array. Write a test program that prompts the user to enter a twodimensional
 array and displays the location of the largest element in the array.
 Here is a sample run:

 */
public class Exercise_13 {
    public static void main(String[] args) {
        // Create variables and scanner
        Scanner input = new Scanner(System.in);
        int rows, cols;
        double[][] array;

        // Prompt user to define the array size
        System.out.print("Enter the number of rows and columns of the array: ");
        rows = input.nextInt();
        cols = input.nextInt();

        //Create the array with the size definitions
        array = new double[rows][cols];

        // Prompt the user to populate array
        System.out.println("Enter the array: ");
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = input.nextDouble();
            }
        }

        // Locate the largest using the Method
        locateLargerst(array);

        // Print the location of the largest using the int[] (locateLargest(array)[0] && [1])
        System.out.print("The location of the largest element is at (" + locateLargerst(array)[0] + "," + locateLargerst(array)[1] + ")");

    }

    public static int[] locateLargerst(double[][] a){
        // Create the int array to return
        // location of the largest element
        // Create the double largest to
        // test each element contained
        // in the double array
        int[] intArray = {0,0};
        double largest = a[0][0];

        // Loop through the double array
        // test each element, if larger than largest
        // change largest to that element and
        // input location into intArray
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                if(a[i][j] > largest){
                    largest = a[i][j];
                    intArray[0] = i;
                    intArray[1] = j;
                }
            }
        }

        return intArray;
    }
}
