package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/22/2017.

 (Financial application: calculate tips) Write a program that reads the subtotal
 and the gratuity rate, then computes the gratuity and total. For example, if the
 user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
 as gratuity and $11.5 as total. Here is a sample run:

 */
public class Exercise_05 {
    public static void main(String[] args) {
        double subtotal, gratuityRate, gratuity, total;

        // Create Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for variable input
        System.out.print("Enter the subtotal and gratuity rate: ");
        subtotal = input.nextDouble();
        gratuityRate = input.nextDouble();

        // Calculate the final result
        gratuity = gratuityRate / subtotal;
        total = subtotal + gratuity;

        // Display the final result
        System.out.print("The gratuity is $" + gratuity + " and total is $" + total);
    }
}
