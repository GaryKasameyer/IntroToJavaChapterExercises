package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/15/2017.

 (Financial application: compound value) Suppose you save $100 each month
 into a savings account with the annual interest rate 5%. So, the monthly interest
 rate is 0.05 / 12 = 0.00417. After the first month, the value in the account
 becomes

             100 * (1 + 0.00417) = 100.417

 After the second month, the value in the account becomes

            (100 + 100.417) * (1 + 0.00417) = 201.252

 After the third month, the value in the account becomes

            (100 + 201.252) * (1 + 0.00417) = 302.507

 and so on.

 Write a program that prompts the user to enter an amount (e.g., 100), the annual
 interest rate (e.g., 5), and the number of months (e.g., 6) and displays the amount
 in the savings account after the given month.

 */
public class Exercise_30 {
    public static void main(String[] args) {
        double amount, interestRate, numberOfMonths, total = 0;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the savings amount: ");
        amount = input.nextDouble();

        System.out.print("Enter the interest rate(e.g. 5): ");
        interestRate = input.nextDouble();
        interestRate /= 1200;

        System.out.print("Enter the number of months: ");
        numberOfMonths = input.nextDouble();

        // Calculate the savings by looping through
        // the number of months, during each loop
        // calculate the value of that month and display it
        for(int i = 0; i < numberOfMonths; i++){
            total = (amount + total) * (1 + interestRate);
            System.out.printf("Total of month %1d: %1.2f\n", (i+1), total);
        }
    }
}




















