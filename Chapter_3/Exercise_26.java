package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/2/2017.

 (Use the &&, || and ^ operators) Write a program that prompts the user to enter
 an integer and determines whether it is divisible by 5 and 6, whether it is divisible
 by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run
 of this program:

 */
public class Exercise_26 {
    public static void main(String[] args) {
        int number;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = input.nextInt();

        // Perform calculation
        System.out.println("Is " + number + " divisible by 5 and 6? " + (10 % 5 == 0 && 10 % 6 == 0));
        System.out.println("Is " + number + " divisible by 5 or 6? " + (10 % 5 == 0 || 10 % 6 == 0));
        System.out.println("Is " + number + " divisible by 5 or 6, but not both? " + (10 % 5 == 0 ^ 10 % 6 == 0));

    }
}
