package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/1/2017.

 (Science: wind-chill temperature) Programming Exercise 2.17 gives a formula
 to compute the wind-chill temperature. The formula is valid for temperatures in
 the range between −58ºF and 41ºF and wind speed greater than or equal to 2.
 Write a program that prompts the user to enter a temperature and a wind speed.
 The program displays the wind-chill temperature if the input is valid; otherwise,
 it displays a message indicating whether the temperature and/or wind speed is
 invalid.

 */
public class Exercise_20 {
    public static void main(String[] args) {
        double ta, v, twc;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit between -58ºF and 41ºF: ");
        ta = input.nextDouble();

        System.out.print("Enter the wind speed (>=2) in miles per hour: ");
        v = input.nextDouble();

        // Perform the calculation
        if (ta > -58 && ta < 41) {
            if(v >= 2) {
                twc = 35.74 + (0.6215 * ta) - (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta * Math.pow(v, 0.16));
                System.out.print("The wind chill index is " + twc);
            }

            else
                System.out.print("Wind speed is invalid");
        }
        else
            System.out.print("temperature is invalid");
    }
}
