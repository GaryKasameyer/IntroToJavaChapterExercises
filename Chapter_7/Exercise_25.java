package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/18/2017.

 (Algebra: solve quadratic equations) Write a method for solving a quadratic
 equation using the following header:

 public static int solveQuadratic(double[] eqn, double[] roots)

 The coefficients of a quadratic equation ax2 + bx + c = 0 are passed to the
 array eqn and the real roots are stored in roots. The method returns the number
 of real roots. See Programming Exercise 3.1 on how to solve a quadratic
 equation.

 Write a program that prompts the user to enter values for a, b, and c and displays
 the number of real roots and all real roots.

 */
public class Exercise_25 {
    public static void main(String[] args) {
        double[] eqn = new double[3], roots = new double[3];

        // Prompt user for coefficients and populate eqn with them
        Scanner input = new Scanner(System.in);
        System.out.print("Enter values for a, b, and c: ");
        for(int i = 0; i < 3; i++){
            eqn[i] = input.nextDouble();
        }

        // Call solveQuadratic
        int discriminate = solveQuadratic(eqn, roots);

        // Use the return value to print out the roots
        if(discriminate == 0)
            System.out.print("There are no real roots.");
        else if(discriminate == 1)
            System.out.print("There is 1 root: " + (int)roots[0]);
        else
            System.out.printf("There are 2 roots: %1.6f and %1.6f", roots[0], roots[1]);
    }

    /** Solve the quadratic, returning the number of real roots, and populate roots, with the roots */
    public static int solveQuadratic(double[] eqn, double[] roots){
        double a = eqn[0], b = eqn[1], c = eqn[2];
        // Calculate the discriminate, this will determine the number of real roots
        int discriminate = (int)(Math.pow(b,2) - (4 * a * c));

        // Use discriminate to calculate the roots and populate the roots[] with them
        if(discriminate == 0) {
            roots[0] = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
            return 1;
        }else if(discriminate > 0) {
            roots[0] = (-b + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
            roots[1] = (-b - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / 2 * a;
            return 2;
        }else
            return 0;
    }
}
















