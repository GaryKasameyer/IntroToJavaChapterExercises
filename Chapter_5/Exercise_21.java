package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/23/2017.

 (Financial application: compare loans with various interest rates) Write a program
 that lets the user enter the loan amount and loan period in number of years
 and displays the monthly and total payments for each interest rate starting from
 5% to 8%, with an increment of 1/8. Here is a sample run:

 Loan Amount: 10000
 Number of Years: 5

 Interest Rate      Monthly Payment     Total Payment
 5.000%             188.71              11322.74
 5.125%             189.29              11357.13
 5.250%             189.86              11391.59
  ...                ...                  ...
 7.875%             202.17              12129.97
 8.000%             202.76              12165.84

 For the formula to compute monthly payment, see Listing 2.9, ComputeLoan.java.

 */
public class Exercise_21 {
    public static void main(String[] args) {
        double P, N, years, interestRate = 0.05, J, M = 0, totalPayment = 0, n;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Loan Amount: ");
        P = input.nextDouble();

        System.out.print("Number of years: ");
        years = input.nextDouble();
        N = years * 12;
        // Print heading
        System.out.print("Interest Rate\tMonthly Payment\tTotal Payment");

        // Use a for loop to calculate the monthly then total payments
        // interest rate increases by 1/8 from 5%, 5.125, to 8%
        // use it to calculate monthly and total payments
        // M = P * ( J / (1 - (1 + J) ^ -N))
        // M = payment amount monthly payment
        // P = principal, meaning the amount of money borrowed 10000
        // J = effective interest rate. 5%/12 then 5.125/12
        // N = total number of payments 5years * 12 = 60
        for(;interestRate <= .08125; interestRate += .00125){
            J = interestRate / 12;
            M = P * (J / (1 - Math.pow((1 + J), -N)));
            //System.out.print("\n" + interestRate + "\t" + M + "\t" + (M * N));
            System.out.printf("\n%1.3f\t%1.2f\t%1.2f", (interestRate * 100), M, (M * N));
        }
    }
























}
