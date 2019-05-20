package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/17/2017.

 (Decimal to hex) Write a program that prompts the user to enter an integer between
 0 and 15 and displays its corresponding hex number. Here are some sample runs:

 */
public class Exercise_11 {
    public static void main(String[] args) {
        int hex;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        hex = input.nextInt();

        // Perform the calculation
        if(hex > 15 || hex < 0)
            System.out.print("Invalid input");
        else{
            switch(hex) {
                case 0:
                    System.out.print("The hex value is: 0");
                    break;
                case 1:
                    System.out.print("The hex value is: 1");
                    break;
                case 2:
                    System.out.print("The hex value is: 2");
                    break;
                case 3:
                    System.out.print("The hex value is: 3");
                    break;
                case 4:
                    System.out.print("The hex value is: 4");
                    break;
                case 5:
                    System.out.print("The hex value is: 5");
                    break;
                case 6:
                    System.out.print("The hex value is: 6");
                    break;
                case 7:
                    System.out.print("The hex value is: 7");
                    break;
                case 8:
                    System.out.print("The hex value is: 8");
                    break;
                case 9:
                    System.out.print("The hex value is: 9");
                    break;
                case 10:
                    System.out.print("The hex value is: A");
                    break;
                case 11:
                    System.out.print("The hex value is: B");
                    break;
                case 12:
                    System.out.print("The hex value is: C");
                    break;
                case 13:
                    System.out.print("The hex value is: D");
                    break;
                case 14:
                    System.out.print("The hex value is: E");
                    break;
                case 15:
                    System.out.print("The hex value is: F");
                    break;
            }
        }
    }
}
