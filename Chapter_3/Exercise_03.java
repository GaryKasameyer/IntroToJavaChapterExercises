package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/26/2017.

 (Algebra: solve 2 * 2 linear equations) A linear equation can be solved using
 Cramer’s rule given in Programming Exercise 1.13. Write a program that prompts
 the user to enter a, b, c, d, e, and f and displays the result. If ad - bc is 0, report
 that “The equation has no solution.”

 ax + by = e
 cx + dy = f

     ed - bf
 x = --------
    ad - bc

     af - ec
 y = --------
    ad - bc

 */
public class Exercise_03 {
    public static void main(String[] args) {
        double a, b, c, d, e, f, x, y;

        // Prompt the user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();

        // check ad - bc
        if((a * d) - (b * c) == 0) {
            System.out.print("The equation has no solution");
            System.exit(1);
        }
        else{
            x = ((e * d) - (b * f)) / ((a * d) - (b * c));
            y = ((a * f) - (e * c)) / ((a * d) - (b * c));
            System.out.print("x is " + x + " and y is " + y);
        }
    }
}
