package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/11/2017.

 (Average an array) Write two overloaded methods that return the average of an
 array with the following headers:

 public static int average(int[] array)

 public static double average(double[] array)

 Write a test program that prompts the user to enter ten double values, invokes this
 method, and displays the average value.

 */
public class Exercise_08 {
    public static void main(String[] args) {
        double[] array = new double[10];

        // Prompt user to enter 10 double values
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten double values: ");
        for(int i = 0; i < array.length; i++)
            array[i] = input.nextDouble();

        // Call and print the average method
        System.out.print(average(array));
    }

    /** int version of overloaded average(int[]) method */
    public static int average(int[] array){
        int total = 0;

        for(int i = 0; i < array.length; i++)
            total += array[i];

        return total / array.length;
    }

    /** double version of overloaded average(double[]) method */
    public static double average(double[] array){
        double total = 0.0;

        for(int i = 0; i < array.length; i++)
            total += array[i];

        return total / array.length;
    }
}
