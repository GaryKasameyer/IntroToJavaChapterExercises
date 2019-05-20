package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/22/2017.

 (Find the number of years) Write a program that prompts the user to enter the
 minutes (e.g., 1 billion), and displays the number of years and days for the minutes.
 For simplicity, assume a year has 365 days. Here is a sample run:

 */
public class Exercise_07 {
    public static void main(String[] args) {
        double minutes, years, days;
        final double DAYS_PER_YEAR = 365;

        // Create Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for variable input
        System.out.print("Enter the number of minutes: ");
        minutes = input.nextDouble();

        // Preform the calculation
        years = minutes / 1440 / DAYS_PER_YEAR;
        days = (minutes / 1440) % 365;

        // Display the final result
        System.out.print((int)minutes + " minutes is approximately " + (int)years + " years and " + (int)days + " days");
    }
}
