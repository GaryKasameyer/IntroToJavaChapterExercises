package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/25/2017.

 (Algebra: solve quadratic equations) The two roots of a quadratic equation
 ax2 + bx + c = 0 can be obtained using the following formula:
 r1 =
 -b + 2b2 - 4ac
 2a
 and r2 =
 -b - 2b2 - 4ac
 2a

 b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
 equation has two real roots. If it is zero, the equation has one root. If it is negative,
 the equation has no real roots.

 Write a program that prompts the user to enter values for a, b, and c and displays
 the result based on the discriminant. If the discriminant is positive, display two
 roots. If the discriminant is 0, display one root. Otherwise, display “The equation
 has no real roots”.

 Note that you can use Math.pow(x, 0.5) to compute 2x. Here are some
 sample runs.

 Enter a, b, c: 1.0 3 1
 The equation has two roots -0.381966 and -2.61803

 Enter a, b, c: 1 2.0 1
 The equation has one root -1

 Enter a, b, c: 1 2 3
 The equation has no real roots

 */
public class Exercise_01 {
    public static void main(String[] args) {
        double a, b, c, discriminant, rootOne, rootTwo;
        int discriminantValue;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        discriminant = (Math.pow(b,2) - (4 * a * c));

        if(discriminant > 0)
            discriminantValue = 1;
        else if(discriminant == 0)
            discriminantValue = 0;
        else
            discriminantValue = -1;

        switch(discriminantValue){
            case -1:
                System.out.println("The equation has no real roots");
                break;
            case 0:
                rootTwo = (-b + Math.sqrt(Math.pow(b,2) - (4 * a * c))) / 2 * a;
                System.out.print("The equation has one root " + rootTwo);
                break;
            case 1:
                rootOne = (-b + Math.sqrt(Math.pow(b,2) - (4 * a * c))) / 2 * a;
                rootTwo = (-b - Math.sqrt(Math.pow(b,2) - (4 * a * c))) / 2 * a;
                System.out.print("The equation has two roots " + rootOne + " and " + rootTwo);
                break;

        }
    }
}
