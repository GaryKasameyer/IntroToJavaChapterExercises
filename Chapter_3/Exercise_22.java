package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/1/2017.

 (Geometry: point in a circle?) Write a program that prompts the user to enter a
 point (x, y) and checks whether the point is within the circle centered at (0, 0)
 with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
 circle, as shown in Figure 3.7a.

 (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
 The formula for computing the distance is 2(x2 - x1)2 + (y2 - y1)2. Test your
 program to cover all cases.) Two sample runs are shown below.

 */
public class Exercise_22 {
    public static void main(String[] args) {
        int x1 = 0, x2, y1 = 0, y2, radius = 10;
        double distance;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("enter x and y: ");
        x2 = input.nextInt();
        y2 = input.nextInt();

        // Perform the calculation
        distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));

        if(distance <= radius)
            System.out.print("(" + x2 + ", " + y2 + ")" + " is in the circle");
        else
            System.out.print("(" + x2 + ", " + y2 + ")" + " is not in the circle");
    }
}
