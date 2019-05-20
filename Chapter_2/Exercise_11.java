package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/23/2017.

 (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 to enter the number of years and displays the population after the number of years.
 Use the hint in Programming Exercise 1.11 for this program. The population
 should be cast into an integer. Here is a sample run of the program:

 */
public class Exercise_11 {
    public static void main(String[] args) {
        double years, births = 7, immigrants = 45, deaths = 13, currentPopulation = 312032486;
        final double SECONDS_PER_YEAR = 365 * 24 * 60 * 60;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        years = input.nextDouble();

        // Perform the calculation and display the result
        currentPopulation += ((((SECONDS_PER_YEAR / births) + (SECONDS_PER_YEAR / immigrants)) - (SECONDS_PER_YEAR / deaths)) * years);

        // Display the final result
        System.out.print("The population in " + (int)years + " years is " + (int)currentPopulation);
    }
}
