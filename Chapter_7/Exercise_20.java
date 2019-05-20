package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/12/2017.

 (Revise selection sort) In Section 7.11, you used selection sort to sort an array.
 The selection-sort method repeatedly finds the smallest number in the current
 array and swaps it with the first. Rewrite this program by finding the largest number
 and swapping it with the last. Write a test program that reads in ten double
 numbers, invokes the method, and displays the sorted numbers.

 */
public class Exercise_20 {
    public static void main(String[] args) {
        int[] array = new int[10];

        // Prompt user to enter 10 double values
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten double values: ");
        for(int i = 0; i < array.length; i++)
            array[i] = input.nextInt();

        // call selectionSort
        selectionSort(array);

        for(int e: array)
            System.out.print(e + " ");
    }

    /** Loop through array and put biggest elements first */
    public static void selectionSort(int[] arrayToSort) {
        // Sort the array here
        for (int i = 0; i < arrayToSort.length; i++) {
            int largest = i;
            for (int j = i + 1; j < arrayToSort.length; j++) {
                if (arrayToSort[j] > arrayToSort[largest]) {
                    largest = j;
                }
            }
            if (largest != i) {
                swap(arrayToSort, largest, i);
            }
        }
    }

    /** Swap to elements in the array */
    public static int[] swap(int[] arrayToSort, int i, int j){
        int temp = arrayToSort[j];
        arrayToSort[j] = arrayToSort[i];
        arrayToSort[i] = temp;

        return arrayToSort;
    }
}
