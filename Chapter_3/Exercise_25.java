package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/2/2017.

 ax + by = e
 cx + dy = f

 ed - bf
 x = --------
 ad - bc

 af - ec
 y = --------
 ad - bc


 (Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and (x2,
 y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a–b.

 The intersecting point of the two lines can be found by solving the following
 linear equation:

 (y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
 (y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3

 This linear equation can be solved using Cramer’s rule (see Programming Exercise
 3.3). If the equation has no solutions, the two lines are parallel (Figure 3.8c).

 Write a program that prompts the user to enter four points and displays the intersecting
 point. Here are sample runs:

 Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 5 -1.0 4.0 2.0 -1.0 -2.0
 The intersecting point is at (2.88889, 1.1111)

 Enter x1, y1, x2, y2, x3, y3, x4, y4: 2 2 7 6.0 4.0 2.0 -1.0 -2.0
 The two lines are parallel

 */
public class Exercise_25 {
    public static void main(String[] args) {
        double x, y, x1, x2, x3, x4, y1, y2, y3, y4, a, b, c, d, e, f;

        // Prompt user for variable input
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

        // Perform the calculation
        a = y1 - y2;
        b = -(x1 - x2);
        c = y3 - y4;
        d = -(x3 - x4);
        e = a * x1 + b * y1;
        f = c * x3 + d * y3;

        x = (e * d - b * f) / (a * d - b * c);
        y = (a * f - e * c) / (a * d - b * c);

        // Display the final result
        System.out.print("The intersection point is (" + x + ", " + y + ")");
    }
}
