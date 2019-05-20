package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/23/2017.

 (Science: calculating energy) Write a program that calculates the energy needed
 to heat water from an initial temperature to a final temperature. Your program
 should prompt the user to enter the amount of water in kilograms and the initial
 and final temperatures of the water. The formula to compute the energy is

 Q = M * (finalTemperature – initialTemperature) * 4184

 where M is the weight of water in kilograms, temperatures are in degrees Celsius,
 and energy Q is measured in joules. Here is a sample run:

 Enter the amount of water in kilograms: 55.5
 Enter the initial temperature: 3.5
 Enter the final temperature: 10.5
 The energy needed is 1625484.0

 */
public class Exercise_10 {
    public static void main(String[] args) {
        double energy, water, intTemp, finalTemp;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in Kilograms: ");
        water = input.nextDouble();

        System.out.print("Enter the initial temperature: ");
        intTemp = input.nextDouble();

        System.out.print("Enter the final temperature: ");
        finalTemp = input.nextDouble();

        // Perform the calculation
        energy = water * (finalTemp - intTemp) * 4184;

        // Display the result
        System.out.print("The energy needed is " + energy);
    }
}
