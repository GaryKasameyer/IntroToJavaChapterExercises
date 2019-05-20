package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/22/2017.

 (Compute the greatest common divisor) Another solution for Listing 5.9 to find
 the greatest common divisor of two integers n1 and n2 is as follows: First find d
 to be the minimum of n1 and n2, then check whether d, d-1, d-2, . . . , 2, or 1 is
 a divisor for both n1 and n2 in this order. The first such common divisor is the
 greatest common divisor for n1 and n2. Write a program that prompts the user to
 enter two positive integers and displays the gcd.

 */
public class Exercise_14 {
    public static void main(String[] args) {
        int n1, n2, d;
        boolean gcdFound = false;

        // Prompt user for 2 integer inputs
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        n1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        n2 = input.nextInt();

        // Check for positive inputs
        if(n1 < 0 && n2 < 0){
            System.out.println("Integers must be positive.");
            System.exit(1);
        }

        // Find the smaller integer
        d = (n1 > n2) ? n1 : n2;

        // Use d to determine gcd of n1 and n2
        // by checking if n1 % d == 0 && n2 % d == 0
        // if false d--;
        while(gcdFound == false){
            if(n1 % d == 0 && n2 % d == 0)
                gcdFound = true;
            else
                d--;
        }

        // Print out the divisor
        System.out.print("Greatest common divisor is " + d);

    }
}
