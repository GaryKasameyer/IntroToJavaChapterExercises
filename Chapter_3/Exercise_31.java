package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/9/2017.

 (Financials: currency exchange) Write a program that prompts the user to enter
 the exchange rate from currency in U.S. dollars to Chinese RMB. Prompt the user
 to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from
 Chinese RMB and U.S. dollars. Prompt the user to enter the amount in U.S. dollars
 or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
 Here are the sample runs:

 */
public class Exercise_31 {
    public static void main(String[] args) {
        double exchangeRate, amountToConvert;
        int conversionIndicator;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        exchangeRate = input.nextDouble();

        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        conversionIndicator = input.nextInt();

        System.out.print("Enter the dollar amount: ");
        amountToConvert = input.nextDouble();

        switch(conversionIndicator){
            case 0:
                System.out.print("$" + amountToConvert + " is " + (amountToConvert * exchangeRate) + " yuan");
                break;
            case 1:
                System.out.print(amountToConvert + " yuan is $" + (amountToConvert / exchangeRate));
                break;
        }

    }
}
