package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/9/2017.

 (Count occurrence of numbers) Write a program that reads the integers between 1
 and 100 and counts the occurrences of each. Assume the input ends with 0. Here
 is a sample run of the program:

 Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0
 2 occurs 2 times
 3 occurs 1 time
 4 occurs 1 time
 5 occurs 2 times
 6 occurs 1 time
 23 occurs 1 time
 43 occurs 1 time

 Note that if a number occurs more than one time, the plural word “times” is used
 in the output.

 */
public class Exercise_03 {
    public static void main(String[] args) {
        int[] numbers = new int[0], nonRepeated;
        int temp;

        // Prompt user to enter integers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");

        // Get each nextInt() while != 0, then add to array
        // by increasing the size of the array each time
        while((temp = input.nextInt()) != 0)
            numbers = increaseArray(numbers, temp);

        // Call getNonRepeatingArray to filter the number[] to the unique input
        nonRepeated = getNonRepeatingArray(numbers);

        // Use countArray to count the occurrences of each nonRepeated element in the numbers[]
        countArray(numbers, nonRepeated);
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

    /** Use getPlurality to determine whether to use time or times */
    public static String getPlurality(int count){
        // return if count is > 1 times else return time
        return count > 1 ? "times" : "time";
    }

    /** Use countArray to count the occurrences of each non-repeated element and print them */
    public static void countArray(int[] numbers, int[] nonRepeated){
        // Create a counter
        int count = 0;

        // Loop through each nonRepeated element, and then for each nonRepeated element
        // Loop through the entire numbers[] and for each element repeated count++
        for(int i = 0; i < nonRepeated.length; i++){
            for(int j = 0; j < numbers.length; j++){
                if(nonRepeated[i] == numbers[j])
                    count++;
            }

            // After comparison of each individual nonRepeated element against the entire numbers[]
            // print the count and reset counter
            System.out.printf("%1d occurs %1d %1s\n", nonRepeated[i], count, getPlurality(count));
            count = 0;
        }
    }

}
