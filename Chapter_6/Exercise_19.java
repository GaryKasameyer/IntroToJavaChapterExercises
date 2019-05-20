package Chapter6_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/31/2017.

 (The MyTriangle class) Create a class named MyTriangle that contains the
 following two methods:

 // Return true if the sum of any two sides is greater than the third side.
 public static boolean isValid(double side1, double side2, double side3)

 // Return the area of the triangle.
 public static double area(double side1, double side2, double side3)

 Write a test program that reads three sides for a triangle and computes the area if
 the input is valid. Otherwise, it displays that the input is invalid. The formula for
 computing the area of a triangle is given in Programming Exercise 2.19.

 s = (side1 + side2 + side3)/2;

 area = 2s(s - side1)(s - side2)(s - side3)

 */
public class Exercise_19 {
    public static void main(String[] args) {
        double side1, side2, side3;

        // Prompt user for sides
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        side1 = input.nextDouble();

        System.out.print("Enter side 2: ");
        side2 = input.nextDouble();

        System.out.print("Enter side 3: ");
        side3 = input.nextDouble();

        // Check if sides are valid
        // if sides are valid return area of triangle
        if(isValid(side1, side2, side3))
            System.out.print("area is " + area(side1, side2, side3));
        else
            System.out.print("Input is invalid");
    }

    // Return true if the sum of any two sides is greater than the third side.
    public static boolean isValid(double side1, double side2, double side3){
        return (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1);
    }

    // Return the area of the triangle.
    public static double area(double side1, double side2, double side3){
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
