package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/11/2017.

 (Computing gcd) Write a method that returns the gcd of an unspecified number
 of integers. The method header is specified as follows:

 public static int gcd(int... numbers)

 Write a test program that prompts the user to enter five numbers, invokes the
 method to find the gcd of these numbers, and displays the gcd.

 */
public class Exercise_14 {
    public static void main(String[] args) {
        int[] array = new int[5];

        // Prompt user to enter 10 double values
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five int values: ");
        for(int i = 0; i < array.length; i++)
            array[i] = input.nextInt();

        // Call gcd() and print it out
        System.out.print("The greatest common denominator is " + gcd(array));
    }

    public static int gcd(int... numbers){
        int gcd = numbers[0];

        // find largest value, use as initial gcd, then decrease
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > gcd) {
                gcd = numbers[i];
            }
        }

        // Use largest value as gcd, test against all number[i]
        // if % gcd != 0, decrease gcd
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % gcd != 0){
                gcd--;
                i = 0;
            }
        }

        return gcd;
    }

}

























