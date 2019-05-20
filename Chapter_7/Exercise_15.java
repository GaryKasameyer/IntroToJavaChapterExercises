package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/12/2017.

 (Eliminate duplicates) Write a method that returns a new array by eliminating the
 duplicate values in the array using the following method header:

 public static int[] eliminateDuplicates(int[] list)

 Write a test program that reads in ten integers, invokes the method, and displays
 the result. Here is the sample run of the program:

 Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
 The distinct numbers are: 1 2 3 6 4 5

 */
public class Exercise_15 {
    public static void main(String[] args) {
        int[] array = new int[10];

        // Prompt user to enter 10 double values
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten double values: ");
        for(int i = 0; i < array.length; i++)
            array[i] = input.nextInt();

        // Call eliminateDuplicates, and print out the result
        array = eliminateDuplicates(array);
        System.out.print("The distinct numbers are: ");
        for(int e: array)
            System.out.print(e + " ");
    }


    /** Use getNonRepeatingArray(int[]) to return an array of nonRepeated elements in numbers[]
     * by copying numbers[] into nonRepeated[], then use nested loops to replace duplicates with -1
     * then create final array of all non-(-1) elements */
    public static int[] eliminateDuplicates(int[] list){
        int[] temp = new int[list.length];

        // Copy numbers[] to temp[]
        for(int i = 0; i < list.length; i++)
            temp[i] = list[i];

        // Use nested for loops to find and replace duplicates with -1
        for(int i = 0; i < temp.length; i++){
            for(int j = 0; j < temp.length; j++){
                if(temp[i] == temp[j] && j != i)
                    temp[j] = -1;
            }
        }

        // Create nonRepeated[] with temp[] and increaseArray()
        int[] nonRepeated = new int[0];

        for(int i = 0; i < temp.length; i++){
            if(temp[i] > 0)
                nonRepeated = increaseArray(nonRepeated, temp[i]);
        }

        // Order the nonRepeating elements
        // nonRepeated = selectionSort(nonRepeated);

        // Return nonRepeated array
        return nonRepeated;
    }

    /** Use increaseArray to make a new int[] and copy the old int[] to it, then return the new int[] */
    public static int[] increaseArray(int[] numbers, int temp){
        // Create a new array == numbers.length + 1
        int[] bigger = new int[numbers.length + 1];

        // Use loop to copy old array to new array
        for(int i = 0; i < numbers.length; i++)
            bigger[i] = numbers[i];

        // Then add the next element temp
        bigger[bigger.length - 1] = temp;

        // And return the new array with all elements
        return bigger;
    }

}
