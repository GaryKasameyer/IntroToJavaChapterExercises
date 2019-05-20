package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/1/2017.

 (Geometry: point in a rectangle?) Write a program that prompts the user to enter
 a point (x, y) and checks whether the point is within the rectangle centered at
 (0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and
 (6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the
 rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its
 vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to
 cover all cases.) Here are two sample runs.

 */
public class Exercise_23 {
    public static void main(String[] args) {
        int x, y, width = 10, height = 5, horizontalDistance = 10 / 2;
        double verticalDistance = 5.0 / 2;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x and y: ");
        x = input.nextInt();
        y = input.nextInt();

        if(x <= horizontalDistance)
            if(y <= verticalDistance)
                System.out.print("Point (" + x + ", " + y + ") is in the rectangle");
            else
                System.out.print("Point (" + x + ", " + y + ") is not in the rectangle");
        else
            System.out.print("Point (" + x + ", " + y + ") is not in the rectangle");
    }
}
