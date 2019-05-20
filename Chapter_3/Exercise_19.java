package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/1/2017.

 (Compute the perimeter of a triangle) Write a program that reads three edges for
 a triangle and computes the perimeter if the input is valid. Otherwise, display that
 the input is invalid. The input is valid if the sum of every pair of two edges is
 greater than the remaining edge.

 perimeter = a + b + c;

 */
public class Exercise_19 {
    public static void main(String[] args) {
        int a, b, c;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sides a, b, c: ");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        // determine if two sides are greater than the third
        if(a + b > c && a + c > b && b + c > a)
            System.out.print("The perimeter of the triangle is " + (a + b + c));
        else
            System.out.print("The input is invalid");
    }
}
