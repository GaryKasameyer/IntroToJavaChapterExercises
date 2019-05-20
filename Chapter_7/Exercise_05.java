package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/10/2017.

 (Print distinct numbers) Write a program that reads in ten numbers and displays
 the number of distinct numbers and the distinct numbers separated by exactly one
 space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
 Read a number and store it to an array if it is new. If the number is already in the
 array, ignore it.) After the input, the array contains the distinct numbers. Here is
 the sample run of the program:

 Enter ten numbers: 1 2 3 2 1 6 3 4 5 2
 The number of distinct number is 6
 The distinct numbers are: 1 2 3 6 4 5

 */
public class Exercise_05 {
    public static void main(String[] args) {
        int[] numbers = new int[0], nonRepeated;
        int temp;

        // Prompt user to enter integers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        // Get each nextInt() while != 0, then add to array
        // by increasing the size of the array each time
        int count = 0;
        while(count++ != 10){
            temp = input.nextInt();
            numbers = increaseArray(numbers, temp);
        }

        // Call getNonRepeatingArray to filter the number[] to the unique input
        nonRepeated = getNonRepeatingArray(numbers);

        // Print the number of nonRepeated, then the list of nonRepeated numbers
        System.out.printf("The number of distinct numbers is %1d\nThe distinct numbers are: ", nonRepeated.length);
        for(int e: nonRepeated)
            System.out.print(e + " ");
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

    /** Use getNonRepeatingArray(int[]) to return an array of nonRepeated elements in numbers[]
     * by copying numbers[] into nonRepeated[], then use nested loops to replace duplicates with -1
     * then create final array of all non-(-1) elements */
    public static int[] getNonRepeatingArray(int[] numbers){
        int[] temp = new int[numbers.length];

        // Copy numbers[] to temp[]
        for(int i = 0; i < numbers.length; i++)
            temp[i] = numbers[i];

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
        nonRepeated = selectionSort(nonRepeated);

        // Return nonRepeated array
        return nonRepeated;
    }

    /** Use Selection sort to sort nonRepeated in ascending order */
    public static int[] selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        return list;
    }
}
