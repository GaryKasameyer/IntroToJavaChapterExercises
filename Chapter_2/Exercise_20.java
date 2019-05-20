package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/25/2017.

 (Financial application: calculate interest) If you know the balance and the annual
 percentage interest rate, you can compute the interest on the next monthly payment
 using the following formula:

 interest = balance * (annualInterestRate/1200)

 Write a program that reads the balance and the annual percentage interest rate and
 displays the interest for the next month. Here is a sample run:

 */
public class Exercise_20 {
    public static void main(String[] args) {
        double interest, balance, annualInterestRate;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g. 3 for 3%):");
        balance = input.nextDouble();
        annualInterestRate = input.nextDouble();

        // Perform the calculation
        interest = balance * (annualInterestRate / 1200);

        // Display the final result
        System.out.print("The interest is " + interest);
    }
}
