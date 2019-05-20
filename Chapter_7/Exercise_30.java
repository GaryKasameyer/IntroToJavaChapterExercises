package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/20/2017.

 (Pattern recognition: consecutive four equal numbers) Write the following
 method that tests whether the array has four consecutive numbers with the same
 value.

 public static boolean isConsecutiveFour(int[] values)

 Write a test program that prompts the user to enter a series of integers and displays
 if the series contains four consecutive numbers with the same value. Your
 program should first prompt the user to enter the input size—i.e., the number of
 values in the series. Here are sample runs:

 Enter the number of values: 8
 Enter the values: 3 4 5 5 5 5 4 5
 The list has consecutive fours

 Enter the number of values: 9
 Enter the values: 3 4 5 5 6 5 5 4 5
 The list has no consecutive fours

 */
public class Exercise_30 {
    public static void main(String[] args) {
        int numberOfValues;
        int[] values;

        // Prompt user to enter number of values
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        numberOfValues = input.nextInt();

        // Create int[] with that numberOfValues
        values = new int[numberOfValues];

        // populate values[] with inputs
        System.out.print("Enter the values: ");
        for(int value = 0; value < numberOfValues; value++){
            values[value] = input.nextInt();
        }

        // call isConsecutiveFour and print out the result
        System.out.print(isConsecutiveFour(values) ? "The list has consecutive fours" : "The list has no consecutive");

    }

    /** Use isConsecutiveFour to find if 4 elements in values[] are consecutively repeating */
    public static boolean isConsecutiveFour(int[] values){
        // Use for loop to check if each element and the next three are the same
        for(int one = 0; one < values.length - 3; one++){
            if( values[one + 1] == values[one] && values[one + 2] == values[one] && values[one + 3] == values[one])
                return true;
        }
        return false;
    }
}
