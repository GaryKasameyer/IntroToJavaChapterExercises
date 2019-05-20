package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/22/2017.

 (Sum the digits in an integer) Write a program that reads an integer between 0 and
 1000 and adds all the digits in the integer. For example, if an integer is 932, the
 sum of all its digits is 14.
 Hint: Use the % operator to extract digits, and use the / operator to remove the
 extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93.
 Here is a sample run:

 */
public class Exercise_06 {
    public static void main(String[] args) {
        int integer, sum, intOne, intTwo, intThree;

        // Create Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for variable input
        System.out.print("Enter an integer between 0 and 1000: ");
        integer = input.nextInt();

        // Perform the calculation
        intOne = integer % 10;
        intTwo = (integer / 10) % 10;
        intThree = (integer / 100) % 10;

        // Display the final result
        //System.out.print("intOne = " + intOne + " intTwo = " + intTwo + " intThree = " + intThree);
        System.out.print("The sum of the digits is " + (intOne + intTwo + intThree));
    }
}
