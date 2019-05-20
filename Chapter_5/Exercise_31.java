package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/15/2017.

 (Financial application: compute CD value) Suppose you put $10,000 into a CD
 with an annual percentage yield of 5.75%. After one month, the CD is worth

            10000 + 10000 * 5.75 / 1200 = 10047.92

 After two months, the CD is worth

            10047.91 + 10047.91 * 5.75 / 1200 = 10096.06

 After three months, the CD is worth

            10096.06 + 10096.06 * 5.75 / 1200 = 10144.44

 and so on.

 Write a program that prompts the user to enter an amount (e.g., 10000), the
 annual percentage yield (e.g., 5.75), and the number of months (e.g., 18) and
 displays a table as shown in the sample run.

 Enter the initial deposit amount: 10000
 Enter annual percentage yield: 5.75
 Enter maturity period (number of months): 18

 Month CD Value
 1     10047.92
 2     10096.06
     ...
 17    10846.57
 18    10898.54

 */
public class Exercise_31 {
    public static void main(String[] args) {
        double initialDepositAmount, annualPercentageYield, maturityPeriod, total = 0;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount: ");
        initialDepositAmount = input.nextDouble();

        System.out.print("Enter the annual percentage yield: ");
        annualPercentageYield = input.nextDouble();
        annualPercentageYield /= 1200;

        System.out.print("Enter maturity period (number of months): ");
        maturityPeriod = input.nextDouble();

        // Print heading
        System.out.printf("Month\tCD Value\n");

        // Use variables to calculate monthly CD values
        for(int i = 1; i <= maturityPeriod; i++){
            initialDepositAmount = initialDepositAmount + initialDepositAmount * annualPercentageYield;
            System.out.printf("%1d\t\t%1.2f\n", i, initialDepositAmount);
        }
    }
}
































