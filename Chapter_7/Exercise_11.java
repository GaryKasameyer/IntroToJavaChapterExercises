package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/11/2017.

 (Statistics: compute deviation) Programming Exercise 5.45 computes the standard
 deviation of numbers. This exercise uses a different but equivalent formula to
 compute the standard deviation of n numbers.

 mean =
 a
 n
 i = 1
 xi
 n =
 x1 + x2 + g + xn
 n
 deviation = H
 a
 n
 i = 1
 (xi - mean)2
 n - 1

 To compute the standard deviation with this formula, you have to store the individual
 numbers using an array, so that they can be used after the mean is obtained.
 Your program should contain the following methods:

 /** Compute the deviation of double values
 public static double deviation(double[] x){}

 /** Compute the mean of an array of double values
 public static double mean(double[] x){}

 Write a test program that prompts the user to enter ten numbers and displays the
 mean and standard deviation, as shown in the following sample run:

 Enter ten numbers: 1.9 2.5 3.7 2 1 6 3 4 5 2
 The mean is 3.11
 The standard deviation is 1.55738

 */
public class Exercise_11 {
    public static void main(String[] args) {
        double[] array = new double[10];
        double deviation, mean;

        // Prompt user to enter 10 double values
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten double values: ");
        for(int i = 0; i < array.length; i++)
            array[i] = input.nextDouble();

        // Call mean(double[])
        mean = mean(array);
        //  print out the mean
        System.out.printf("The mean is %1.2f\n", mean);

        // call deviation(double[])
        deviation = deviation(array);
        // Print out the deviation
        System.out.printf("The standard deviation is %1.5f", deviation);
    }

    /** Compute the deviation of double values */
    public static double deviation(double[] x){
        double deviation = 0, mean = mean(x);

        // Use for loop to subtract mean from each array element and square it
        for(int i = 0; i < x.length; i++)
            x[i] -= mean;

        // Use for loop to square each element
        for(int i = 0; i < x.length; i++)
            deviation += Math.pow(x[i], 2);

        // Calculate the value of standard deviation by taking sqrt(deviation / x.length - 1)
        return Math.sqrt(deviation / (x.length - 1));
    }

    /** Compute the mean of an array of double values */
    public static double mean(double[] x){
        double mean = 0;

        // Use for loop to calculate mean
        for(int i = 0; i < x.length; i++)
            mean += x[i];

        return mean / x.length;
    }
}
