package Chapter9_Exercises;

import Independent.LinearEquation;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 5/9/2017.

 (Algebra: 2 * 2 linear equations) Design a class named LinearEquation for a
 2 * 2 system of linear equations:
 ax + by = e
 cx + dy = f
 x =
 ed - bf
 ad - bc
 y =
 af - ec
 ad - bc
 The class contains:

 ■ Private data fields a, b, c, d, e, and f.
 ■ A constructor with the arguments for a, b, c, d, e, and f.
 ■ Six getter methods for a, b, c, d, e, and f.
 ■ A method named isSolvable() that returns true if ad - bc is not 0.
 ■ Methods getX() and getY() that return the solution for the equation.

 Draw the UML diagram for the class and then implement the class. Write a test
 program that prompts the user to enter a, b, c, d, e, and f and displays the result.
 If ad - bc is 0, report that “The equation has no solution.” See Programming
 Exercise 3.3 for sample runs.

 CORRECT SOLUTION:
 Enter a,b,c,d,e,f: 9.0 4.0 3.0 -5.0 -6.0 -21.0
 x is -2.0 y is 3.0

 UML:
        LinearEquation
 -a: double
 -b: double
 -c: double
 -d: double
 -e: double
 -f: double
 --------------------------------
 +LinearEquation(a: double, b: double, c: double, d: double, e: double, f: double)
 +getA(): double
 +getB(): double
 +getC(): double
 +getD(): double
 +getE(): double
 +getF(): double
 +isSolvable(): boolean
 +getX(): double
 +getY(): double

 */
public class Exercise_11 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double d;
        double e;
        double f;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        f = input.nextDouble();

        LinearEquation le = new LinearEquation(a, b, c, d, e, f);

        if(!le.isSolvable())
            System.out.print("The equation has no solution");
        else{
            System.out.println("X: " + le.getX());
            System.out.println("Y: " + le.getY());
        }
    }
}
