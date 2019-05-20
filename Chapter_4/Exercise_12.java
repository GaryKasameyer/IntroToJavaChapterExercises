package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/18/2017.

 (Hex to binary) Write a program that prompts the user to enter a hex digit and
 displays its corresponding binary number. Here is a sample run:

 */
public class Exercise_12 {
    public static void main(String[] args) {
        int digit;
        String binary = "";

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        digit = input.nextInt();

        // perform the calculation
        if(digit < 0 || digit > 15)
            System.out.print("Invalid input");
        if(digit >= 8) {
            binary += "1";
            digit -= 8;
        } else
            binary += "0";
        if(digit >= 4){
            binary += "1";
            digit -= 4;
        }else
            binary += "0";
        if(digit >= 2){
            binary += "1";
            digit -= 2;
        }else
            binary += "0";
        if(digit >= 1){
            binary += "1";
            digit -= 1;
        }else
            binary += "0";

        System.out.print("The binary value is " + binary);
    }
}
