package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/20/2017.

 (Financial application: payroll) Write a program that reads the following information
 and prints a payroll statement:

 Employee’s name (e.g., Smith)
 Number of hours worked in a week (e.g., 10)
 Hourly pay rate (e.g., 9.75)
 Federal tax withholding rate (e.g., 20%)
 State tax withholding rate (e.g., 9%)

 A sample run is shown below:

 Enter employee's name: Smith
 Enter number of hours worked in a week: 10
 Enter hourly pay rate: 9.75
 Enter federal tax withholding rate: 0.20
 Enter state tax withholding rate: 0.09

 Employee Name: Smith
 Hours Worked: 10.0
 Pay Rate: $9.75
 Gross Pay: $97.5
 Deductions:
    Federal Withholding (20.0%): $19.5
    State Withholding (9.0%): $8.77
    Total Deduction: $28.27
 Net Pay: $69.22

 */
public class Exercise_23 {
    public static void main(String[] args) {
        String name;
        double hoursWorked, hourlyPayRate, federalTaxWithholdingRate, stateTaxWithholdingRate,
                stateWithholding, ferderalWithholding, grossPay, netPay;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");
        name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        hourlyPayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        federalTaxWithholdingRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        stateTaxWithholdingRate = input.nextDouble();

        // Perform the pay calculation
        grossPay = hourlyPayRate * hoursWorked;
        ferderalWithholding = grossPay * federalTaxWithholdingRate;
        stateWithholding = grossPay * stateTaxWithholdingRate;
        netPay = grossPay - (ferderalWithholding + stateWithholding);

        // Print out the final results
        System.out.printf("\nEmployee Name: %1s\nHours Worked: %1.1f\nPay Rate: $%1.2f\nGross Pay: $%1.1f\nDeductions:\n\t" +
                "Federal Withholding (20.0%%): $%2.1f\n\tState Withholding (9.0%%): $%1.2f\n\tTotal Deduction: $%2.2f\nNet Pay: $%2.2f",
                name, hoursWorked, hourlyPayRate, grossPay, ferderalWithholding, stateWithholding,
                (ferderalWithholding + stateWithholding), netPay);
    }
}
