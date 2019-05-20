package Chapter9_Exercises;

import Independent.LinearEquation;

import javax.sound.sampled.Line;
import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 5/9/2017.

 (Geometry: intersecting point) Suppose two line segments intersect. The two endpoints
 for the first line segment are (x1, y1) and (x2, y2) and for the second line
 segment are (x3, y3) and (x4, y4). Write a program that prompts the user to enter
 these four endpoints and displays the intersecting point. As discussed in Programming
 Exercise 3.25, the intersecting point can be found by solving a linear equation.
 Use the LinearEquation class in Programming Exercise 9.11 to solve this
 equation. See Programming Exercise 3.25 for sample runs.

 */
public class Exercise_12 {
    public static void main(String[] args) {
        double x1;
        double x2;
        double x3;
        double x4;
        double y1;
        double y2;
        double y3;
        double y4;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        x1 = input.nextDouble();
        y1 = input.nextDouble();
        x2 = input.nextDouble();
        y2 = input.nextDouble();
        x3 = input.nextDouble();
        y3 = input.nextDouble();
        x4 = input.nextDouble();
        y4 = input.nextDouble();

        LinearEquation line = LinearEquation.getIntersectingPoints(x1,y1,x2,y2,x3,y3,x4,y4);

        if(line.isSolvable())
            System.out.print("The intersecting point is " + line.getX() + ", " + line.getY());
        else
            System.out.print("The lines are parallel");
    }
}
