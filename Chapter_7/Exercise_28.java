package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/19/2017.

 (Math: combinations) Write a program that prompts the user to enter 10 integers
 and displays all combinations of picking two numbers from the 10.

 10! / 2!(10! - 2!) == 10 * 9 / 2 == 90 / 2 == 45 different combinations

 */
public class Exercise_28 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int count = 1;

        // Prompt user to enter 10 integers and populate number[] with them
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = input.nextInt();
        }

        // Use nested for loops to display pairs of numbers
        for(int firstNumber = 0; firstNumber < numbers.length / 2; firstNumber++){
            for(int secondNumber = 0; secondNumber < numbers.length; secondNumber++){
                if(firstNumber == secondNumber)
                    continue;
                else
                    System.out.println(count++ + ": " + numbers[firstNumber] + numbers[secondNumber]);
            }
        }
    }
}
