package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/29/2017.

 (Financial application: loan amortization schedule) The monthly payment for a
 given loan pays the principal and the interest. The monthly interest is computed
 by multiplying the monthly interest rate and the balance (the remaining principal).
 The principal paid for the month is therefore the monthly payment minus
 the monthly interest. Write a program that lets the user enter the loan amount,
 number of years, and interest rate and displays the amortization schedule for the
 loan. Here is a sample run:

 Loan Amount: 10000
 Number of Years: 1
 Annual Interest Rate: 7

 Monthly Payment: 865.26
 Total Payment: 10383.21

 Payment# Interest Principal Balance
 1        58.33    806.93    9193.07
 2        53.62    811.64    8381.43
 ...      ...       ...       ...
 11       10.0     855.26    860.27
 12       5.01     860.25    0.01

 Note
 The balance after the last payment may not be zero. If so, the last payment should be
 the normal monthly payment plus the final balance.

 Hint: Write a loop to display the table. Since the monthly payment is the
 same for each month, it should be computed before the loop. The balance
 is initially the loan amount. For each iteration in the loop, compute the
 interest and principal, and update the balance. The loop may look like this:

 for (i = 1; i <= numberOfYears * 12; i++) {
 interest = monthlyInterestRate * balance;
 principal = monthlyPayment - interest;
 balance = balance - principal;
 System.out.println(i + "\t\t" + interest
 + "\t\t" + principal + "\t\t" + balance);
 }

 */
public class Exercise_22 {
    public static void main(String[] args) {
        double loanAmount, numberOfYears, annualInterestRates, monthlyPayment,
                totalPayment, principal = 0, interest, balance, monthlyInterestRate;

        // Prompt user to enter loan variables
        Scanner input = new Scanner(System.in);
        System.out.print("Enter loam amount: ");
        loanAmount = input.nextDouble();

        System.out.print("Number of years: ");
        numberOfYears = input.nextDouble();

        System.out.print("Annual Interest Rate: ");
        annualInterestRates = input.nextDouble();

        // set balance and monthlyInterestRate values,
        // then determine monthly and total Payments
        balance = loanAmount;
        monthlyInterestRate = annualInterestRates / 1200;
        monthlyPayment = loanAmount * (monthlyInterestRate / (1 - Math.pow((1 + monthlyInterestRate), -(numberOfYears * 12))));
        totalPayment = monthlyPayment * (numberOfYears * 12);

        // Print out monthly and total payment
        System.out.printf("\nMonthly Payment: %1.2f\nTotal Payment: %1.2f\n", monthlyPayment, totalPayment);

        // Print header
        System.out.printf("\nPayment#\tInterest\tPrincipal\tBalance\n");

        // Use loop to calculate and display values
        for (int i = 1; i <= numberOfYears * 12; i++) {
            interest = monthlyInterestRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            /*System.out.println(i + "\t\t" + interest
                    + "\t\t" + principal + "\t\t" + balance);*/
            System.out.printf("%1d\t\t\t%1.2f\t\t%1.2f\t\t%1.2f\n", i, interest, principal, balance);
        }

    }
}
