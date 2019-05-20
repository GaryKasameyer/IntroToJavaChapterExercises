package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/10/2017.

 (Analyze scores) Write a program that reads an unspecified number of scores and
 determines how many scores are above or equal to the average and how many
 scores are below the average. Enter a negative number to signify the end of the
 input. Assume that the maximum number of scores is 100.

 */
public class Exercise_04 {
    public static void main(String[] args) {
        int[] numbers = new int[0];
        int temp, average, aboveAverage, belowAverage;

        // Prompt user to enter integers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integers between 1 and 100: ");

        // Get each nextInt() while != 0, then add to array
        // by increasing the size of the array each time
        while((temp = input.nextInt()) >= 0)
            numbers = increaseArray(numbers, temp);

        // Get the average
        average = getAverage(numbers);

        // Get the number of scores >= average, then subtract that from total to find those below average
        aboveAverage = getAboveAverage(numbers, average);
        belowAverage = numbers.length - aboveAverage;

        // Print out the result
        System.out.printf("The number of scores >= average is %1d\nThe number of socres < average is %1d", aboveAverage, belowAverage);
    }

    /** Use increaseArray to make a new int[] and copy the old int[] to it, then return the new int[] */
    public static int[] increaseArray(int[] numbers, int temp){
        // Check if numbers == 100
        if(numbers.length == 100)
            return numbers;

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

    /** Use getAverage() to calculate the average */
    public static int getAverage(int[] numbers){
        int total = 0;

        // Use for loop to add all int's to total, then divide by numbers.length
        for(int i = 0; i < numbers.length; i++)
            total += numbers[i];

        return total / numbers.length;
    }

    /** Use getAboveAverage to find total number of scores above average */
    public static int getAboveAverage(int[] numbers, int average){
        int count = 0;

        for(int i = 0; i < numbers.length; i++)
            if(numbers[i] >= average) count++;

        return count;
    }
}
