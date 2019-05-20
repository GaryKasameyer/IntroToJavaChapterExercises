package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/20/2017.

 (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in
 a double value from the console, then converts it to Fahrenheit and displays the
 result. The formula for the conversion is as follows:

 fahrenheit = (9 / 5) * celsius + 32

 Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.

 Here is a sample run:

 */
public class Exercise_01 {
    public static void main(String[] args) {
        int celsius;
        double fahrenheit;
        // Create the scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for variable input
        System.out.print("Enter a degree in Celsius: ");
        celsius = input.nextInt();

        // Perform calculation
        fahrenheit = (9.0 / 5) * celsius + 32;
        // Display final result
        System.out.println(celsius + " Celsius is " + fahrenheit + " in Fahrenheit");
    }
}
