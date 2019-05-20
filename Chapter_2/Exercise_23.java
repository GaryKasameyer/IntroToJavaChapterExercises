package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/25/2017.

 (Cost of driving) Write a program that prompts the user to enter the distance to
 drive, the fuel efficiency of the car in miles per gallon, and the price per gallon,
 and displays the cost of the trip. Here is a sample run:

 */
public class Exercise_23 {
    public static void main(String[] args) {
        double drivingDistance, milesPerGallon, pricePerGallon, totalCost;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the driving distance: ");
        drivingDistance = input.nextDouble();
        System.out.print("Enter the miles per gallon: ");
        milesPerGallon = input.nextDouble();
        System.out.print("Enter the price per gallon: ");
        pricePerGallon = input.nextDouble();

        // Perform the calculation
        totalCost = (drivingDistance / milesPerGallon) * pricePerGallon;

        // Display the final result
        System.out.print("The cost of driving is " + totalCost);
    }
}
