package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/25/2017.

 (Financial application: calculate future investment value) Write a program that
 reads in investment amount, annual interest rate, and number of years, and displays
 the future investment value using the following formula:

 futureInvestmentValue =

 investmentAmount * (1 + monthlyInterestRate)numberOfYears*12

 For example, if you enter amount 1000, annual interest rate 3.25%, and number
 of years 1, the future investment value is 1032.98.
 Here is a sample run:

 */
public class Exercise_21 {
    public static void main(String[] args) {
        double futureInvestmentValue, investmentAmount, monthlyInterestRate, interestRate, numberOfYears;
        final double INTEREST_PER_MONTH = 1200;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter investment amount: ");
        investmentAmount = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();
        System.out.print("Enter the number of years: ");
        numberOfYears = input.nextDouble();

        // Perform the calculation
        monthlyInterestRate = interestRate / INTEREST_PER_MONTH;

        futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (numberOfYears * 12));

        // Display the final result
        System.out.print("Accumulated value is " + futureInvestmentValue);

    }
}
