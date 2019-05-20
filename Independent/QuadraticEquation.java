package Independent;

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
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return ((Math.pow(getB(), 2))-(4 * getA() * getC()));
    }

    public double getRoot(){
        if(getDiscriminant() >= 0)
            return (((getB() * -1) + Math.sqrt(getDiscriminant())) / (2*getA()));
        else
            return 0;
    }

    public double getRoot2(){
        if(getDiscriminant() >= 0)
            return ((getB() * -1) - Math.sqrt(getDiscriminant()))/(2 * getA());
        else
            return 0;
    }
}
