package Chapter10_Exercises;


import Independent.StackOfIntegers;
import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/5/2017.

 (Displaying the prime factors) Write a program that prompts the user to enter
 a positive integer and displays all its smallest factors in decreasing order. For
 example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
 2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
 retrieve and display them in reverse order.

 */
public class Exercise_05 {
    public static void main(String[] args) {
        int integer;
        StackOfIntegers stack = new StackOfIntegers();
        Scanner input = new Scanner(System.in);
        char another = 'y';
        String an;

        while(another == 'y' || another == 'Y') {
            System.out.print("Enter a positive integer: ");
            integer = input.nextInt();

            while (integer != 1) {
                if (integer % 2 == 0) {
                    integer /= 2;
                    stack.push(2);
                } else if (integer % 3 == 0) {
                    integer /= 3;
                    stack.push(3);
                } else if (integer % 5 == 0) {
                    integer /= 5;
                    stack.push(5);
                } else if (integer % 7 == 0) {
                    integer /= 7;
                    stack.push(7);
                }
            }

            while (stack.getSize() != 0)
                System.out.print(stack.pop() + ", ");
            System.out.print("\nWould you like to factor another? Enter (Y/y): ");
            an = input.next();
            another = an.charAt(0);
        }
    }
}
