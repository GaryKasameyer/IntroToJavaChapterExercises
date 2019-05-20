package Chapter9_Exercises;

import Independent.QuadraticEquation;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 5/9/2017.

 (Algebra: quadratic equations) Design a class named QuadraticEquation for
 a quadratic equation ax2 + bx + x = 0. The class contains:

 ■ Private data fields a, b, and c that represent three coefficients.
 ■ A constructor for the arguments for a, b, and c.
 ■ Three getter methods for a, b, and c.
 ■ A method named getDiscriminant() that returns the discriminant, which is
 b2 - 4ac.
 ■ The methods named getRoot1() and getRoot2() for returning two roots of
 the equation
 r1 =
 -b + 2b2 - 4ac
 2a
 and r2 =
 -b - 2b2 - 4ac
 2a
 These methods are useful only if the discriminant is nonnegative. Let these methods
 return 0 if the discriminant is negative.

 Draw the UML diagram for the class and then implement the class. Write a test
 program that prompts the user to enter values for a, b, and c and displays the result
 based on the discriminant. If the discriminant is positive, display the two roots. If
 the discriminant is 0, display the one root. Otherwise, display “The equation has
 no roots.” See Programming Exercise 3.1 for sample runs.

 UML:
        QuadraticEquation
 -a: double
 -b: double
 -c: double
 ---------------------------------
 +QuadraticEquation(a: double, b: double, c: double){}
 +getA(): double
 +getB(): double
 +getC(): double
 +getDiscriminant(){}: double
 +getRoot(){}: double
 +getRoot2(){}: double

 */
public class Exercise_10 {
    public static void main(String[] args) {
        double a;
        double b;
        double c;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter A: ");
        a = input.nextDouble();

        System.out.print("Enter B: ");
        b = input.nextDouble();

        System.out.print("Enter C: ");
        c = input.nextDouble();

        QuadraticEquation q = new QuadraticEquation(a, b, c);

        if(q.getDiscriminant() > 0)
            System.out.println("Root 1: " + q.getRoot() + "\t" + "Root 2: " + q.getRoot2());
        else if(q.getDiscriminant() == 0)
            System.out.print("The equation has only 1 root: " + q.getRoot());
        else
            System.out.print("The equation has no roots");
    }
}
