package Chapter6_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/29/2017.

 (Display an integer reversed) Write a method with the following header to display
 an integer in reverse order:

 public static void reverse(int number)

 For example, reverse(3456) displays 6543. Write a test program that prompts
 the user to enter an integer and displays its reversal.

 */
public class Exercise_04 {
    public static void main(String[] args) {
        int number;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        number = input.nextInt();

        // use reverse method to print the reverse
        reverse(number);

    }

    public static void reverse(int number){
        int reverse = 0;

        while(number != 0){
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }

        System.out.print("The reverse is " + reverse);
    }
}
