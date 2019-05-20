package Chapter6_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/29/2017.

 (Financial application: compute the future investment value) Write a method that
 computes future investment value at a given interest rate for a specified number
 of years. The future investment is determined using the formula in Programming
 Exercise 2.21.

 Use the following method header:
 public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)

 For example, futureInvestmentValue(10000, 0.05/12, 5) returns
 12833.59.

 Write a test program that prompts the user to enter the investment amount (e.g.,
 1000) and the interest rate (e.g., 9%) and prints a table that displays future value
 for the years from 1 to 30, as shown below:

 The amount invested: 1000
 Annual interest rate: 9
 Years Future Value
 1 1093.80
 2 1196.41
 ...
 29 13467.25
 30 14730.57

 futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)numberOfYears*12
 */
public class Exercise_07 {
    public static void main(String[] args) {
        double investmentAmount, interestRate;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount invested: ");
        investmentAmount = input.nextDouble();

        System.out.print("Enter annual interst rate: ");
        interestRate = input.nextDouble() / 1200;

        // Print out header
        System.out.printf("Years\tFuture Value\n");

        // Use loop to go through years
        // Call the futureInvestmentValue to get the future value
        // Print out the year and value
        for(int i = 1; i <= 30; i++){
            System.out.printf("%1d\t\t%1.2f\n", i, futureInvestmentValue(investmentAmount, interestRate, i));
        }
    }

    // Use this method to return the value of a yearly future value
    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
        return investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));
    }

}
