package Independent;

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
public class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
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

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    public boolean isSolvable(){
        if(((a * d)-(b * c)) != 0)
            return true;
        else
            return false;
    }

    public double getX(){
        return (((e * d)-(b * f))/((a * d)-(b * c)));
    }

    public double getY(){
        return (((a * f)-(e * c))/((a * d)-(b * c)));
    }

    public static LinearEquation getIntersectingPoints(double x1, double y1, double x2, double y2,
                                                       double x3, double y3, double x4, double y4){
        double a = y1 - y2;
        double b = (-x1 + x2);
        double c = (y3 - y4);
        double d = (-x3 + x4);
        double e = -y1 * (x1 - x2) + (y1 - y2) * x1;
        double f =  -y3 * (x3 - x4) + (y3 - y4) * x3;
        return new LinearEquation(a,b,c,d,e,f);
    }
}
