package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/18/2017.

 (Decimal to binary) Write a program that prompts the user to enter a decimal
 integer and displays its corresponding binary value. Don’t use Java’s Integer
 .toBinaryString(int) in this program.

 */
public class Exercise_37 {
    public static void main(String[] args) {
        double decimal;
        String binary = "";

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal: ");
        decimal = input.nextDouble();

        // use loop to decrease by /2
        // if that number >= loop value, then a 1
        // to a string, else add a 0
        for(int i = 128; i > 0; i /= 2){
            if(decimal >= i) {
                binary += "1";
                decimal -= i;
            }else
                binary += "0";
        }

        // Display binary value
        System.out.print(binary);
    }
}
