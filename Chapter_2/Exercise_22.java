package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/25/2017.

 (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange
 .java, to fix the possible loss of accuracy when converting a double value to an
 int value. Enter the input as an integer whose last two digits represent the cents.
 For example, the input 1156 represents 11 dollars and 56 cents.

 */
public class Exercise_22 {
    public static void main(String[] args) {

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount in integer, for example 1156: ");
        int amount = input.nextInt();
        double remainingAmount = amount;

        // Find the number of one dollars
        double numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        double numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        double numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        double numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        double numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + (int)numberOfOneDollars + " dollars");
        System.out.println(" " + (int)numberOfQuarters + " quarters ");
        System.out.println(" " + (int)numberOfDimes + " dimes");
        System.out.println(" " + (int)numberOfNickels + " nickels");
        System.out.println(" " + (int)numberOfPennies + " pennies");
    }
}
