package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/20/2017.

 (Financial application: monetary units) Rewrite Listing 2.10, ComputeChange.
 java, to fix the possible loss of accuracy when converting a float value to an int
 value. Read the input as a string such as "11.56". Your program should extract
 the dollar amount before the decimal point and the cents after the decimal amount
 using the indexOf and substring methods.

 */
public class Exercise_26 {
    public static void main(String[] args) {
        int numberOfOneDollars, numberOfCents, numberOfQuarters = 0, numberOfDimes = 0, numberOfNickels = 0, numberOfPennies = 0;

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print("Enter an amount, for example $11.56: $");
        String amount = input.next();

        // Find the number of one dollars
        int decimal = amount.indexOf(".");

        numberOfOneDollars = Integer.parseInt(amount.substring(0,decimal));
        numberOfCents = Integer.parseInt(amount.substring(decimal+1, amount.length()));

        if(numberOfCents > 25){
            numberOfQuarters = numberOfCents / 25;
            numberOfCents %= 25;
        }if(numberOfCents > 10){
            numberOfDimes = numberOfCents / 10;
            numberOfCents %= 10;
        }if(numberOfCents > 5){
            numberOfNickels = 1;
            numberOfCents %= 5;
        }if(numberOfCents < 5){
            numberOfPennies = numberOfCents;
        }

        // Display results
        System.out.println("Your amount " + amount + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters ");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
