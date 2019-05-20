package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/20/2017.

 (Count positive and negative numbers and compute the average of numbers) Write
 a program that reads an unspecified number of integers, determines how many
 positive and negative values have been read, and computes the total and average of
 the input values (not counting zeros). Your program ends with the input 0. Display
 the average as a floating-point number. Here is a sample run:

 Enter an integer, the input ends if it is 0: 1 2 -1 3 0
 The number of positives is 3
 The number of negatives is 1
 The total is 5.0
 The average is 1.25

 Enter an integer, the input ends if it is 0: 0
 No numbers are entered except 0

 */
public class Exercise_01 {
    public static void main(String[] args) {
        double numberOfPositive = 0, numberOfNegative = 0, number = -1, total = 0, average = 0;
        // Average is determined by total / (numberOfPositive + numberOfNegative);

        // Prompt user for integer inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0: ");
        // Use while loop to take each nextInt()
        while(number != 0){
            // Grab int input
            number = input.nextInt();

            // Determine if number is positive or negative and raise value by 1
            if(number > 0)
                numberOfPositive++;
            else if(number < 0)
                numberOfNegative++;

            // track total
            total += number;
        }

        // Print out the results
        System.out.println("The number of positives is " + numberOfPositive);
        System.out.println("The number of negatives is " + numberOfNegative);
        System.out.println("The total is " + total);
        System.out.print("The average is " + (total / (numberOfPositive + numberOfNegative)));
    }
}
