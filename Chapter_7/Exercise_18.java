package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/12/2017.

 (Bubble sort) Write a sort method that uses the bubble-sort algorithm. The bubblesort
 algorithm makes several passes through the array. On each pass, successive
 neighboring pairs are compared. If a pair is not in order, its values are swapped;
 otherwise, the values remain unchanged. The technique is called a bubble sort or
 sinking sort because the smaller values gradually “bubble” their way to the top
 and the larger values “sink” to the bottom. Write a test program that reads in ten
 double numbers, invokes the method, and displays the sorted numbers.

 */
public class Exercise_18 {
    public static void main(String[] args) {
        int[] array = new int[10];

        // Prompt user to enter 10 double values
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten double values: ");
        for(int i = 0; i < array.length; i++)
            array[i] = input.nextInt();

        // Call bubbleSort to sort array
        bubbleSort(array);

        // print the sorted array
        for(int e: array)
            System.out.print(e + " ");
    }

    public static void bubbleSort(int[] arrayToSort) {
        // Sort the array here
        for (int i = arrayToSort.length; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                if (arrayToSort[j - 1] > arrayToSort[j]) {
                    swap(arrayToSort, j - 1, j);
                }
            }
        }
    }

    public static int[] swap(int[] arrayToSort, int i, int j){
        int temp = arrayToSort[j];
        arrayToSort[j] = arrayToSort[i];
        arrayToSort[i] = temp;

        return arrayToSort;
    }
}
