package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/11/2017.

 (Find the smallest element) Write a method that finds the smallest element in an
 array of double values using the following header:

 public static double min(double[] array)

 Write a test program that prompts the user to enter ten numbers, invokes this
 method to return the minimum value, and displays the minimum value. Here is a
 sample run of the program:

 Enter ten numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2
 The minimum number is: 1.5

 */
public class Exercise_09 {
    public static void main(String[] args) {
        double[] array = new double[10];

        // Prompt user to enter 10 double values
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten double values: ");
        for(int i = 0; i < array.length; i++)
            array[i] = input.nextDouble();

        // Call min(double[]) and print the smallest value
        System.out.printf("The minimum number is: %1.1f", min(array));
    }

    /** Use min(double[]) to find return smallest element in double[] */
    public static double min(double[] array){
        double min = array[0];

        // Use for loop to find smallest value in array
        for(int i = 1; i < array.length; i++)
            if(array[i] < min)
                min = array[i];

        return min;
    }

}
