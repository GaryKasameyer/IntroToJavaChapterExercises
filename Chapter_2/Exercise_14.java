package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/24/2017.

 (Health application: computing BMI) Body Mass Index (BMI) is a measure of
 health on weight. It can be calculated by taking your weight in kilograms and
 dividing by the square of your height in meters. Write a program that prompts the
 user to enter a weight in pounds and height in inches and displays the BMI. Note
 that one pound is 0.45359237 kilograms and one inch is 0.0254 meters. Here is
 a sample run:

 */
public class Exercise_14 {
    public static void main(String[] args) {
        double height, weight, bmi;
        final double POUND_TO_KILOGRAM = 0.45359237, INCH_TO_METER = 0.0254;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        weight = input.nextDouble();

        System.out.print("Enter height in inches: ");
        height = input.nextDouble();

        // Perform the calculation
        // convert weight in pounds to kilograms
        weight = weight * POUND_TO_KILOGRAM;

        // convert inches to meter
        height = height * INCH_TO_METER;

        // Calculate BMI
        bmi = weight / (Math.pow(height, 2));

        // Display the final result
        System.out.print("BMI is " + bmi);
    }
}
