package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/11/2017.

 (Find the index of the smallest element) Write a method that returns the index of
 the smallest element in an array of integers. If the number of such elements is
 greater than 1, return the smallest index. Use the following header:

 public static int indexOfSmallestElement(double[] array)

 Write a test program that prompts the user to enter ten numbers, invokes this
 method to return the index of the smallest element, and displays the index.

 */
public class Exercise_10 {
    public static void main(String[] args) {
        double[] array = new double[10];

        // Prompt user to enter 10 double values
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten double values: ");
        for(int i = 0; i < array.length; i++)
            array[i] = input.nextDouble();

        // use int smallestIndex to make things easier to read
        int smallestIndex = indexOfSmallestElement(array);

        // Call the indexOfSmallestElement(double[]) method and print the index
        System.out.printf("The index of smallest index is %1d and the value of the smallest index is %1.1f", smallestIndex, array[smallestIndex]);
    }

    /** */
    public static int indexOfSmallestElement(double[] array){
        int smallestIndex = 0;
        double smallestElement = array[0];

        // Use loop to find index of smallest element
        for(int i = 1; i < array.length; i++) {
            if (array[i] < smallestElement) {
                smallestElement = array[i];
                smallestIndex = i;
            }
        }

        return smallestIndex;
    }
}
