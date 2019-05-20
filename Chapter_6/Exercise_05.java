package Chapter6_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/29/2017.

 (Sort three numbers) Write a method with the following header to display three
 numbers in increasing order:

 public static void displaySortedNumbers(double num1, double num2, double num3)

 Write a test program that prompts the user to enter three numbers and invokes the
 method to display them in increasing order.

 */
public class Exercise_05 {
    public static void main(String[] args) {
        double num1, num2, num3;

        // Prompt user for 3 numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        num1 = input.nextDouble();

        System.out.print("Enter number 2: ");
        num2 = input.nextDouble();

        System.out.print("Enter number 3: ");
        num3 = input.nextDouble();

        // Call the displaySortedNumbers() method to sort and print the 3 numbers
        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3){
        double big = 0, bigger = 0, biggest = 0;

        if(num1 > num2 && num1 > num3){
            biggest = num1;

            if(num2 > num3){
                bigger = num2;
                big = num3;
            }else{
                bigger = num3;
                big = num2;
            }
        }else if(num2 > num1 && num2 > num3){
            biggest = num2;

            if(num1 > num3){
                bigger = num1;
                big = num3;
            }else{
                bigger = num3;
                big = num1;
            }
        }else{
            biggest = num3;
            if(num1 > num2){
                bigger = num1;
                big = num2;
            }else{
                bigger = num2;
                big = num1;
            }
        }

        System.out.print("Largest: " + biggest + " Middle: " + bigger + " Smallest: " + big);
    }

}
