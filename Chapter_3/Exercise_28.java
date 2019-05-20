package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/2/2017.

 (Geometry: two rectangles) Write a program that prompts the user to enter the
 center x-, y-coordinates, width, and height of two rectangles and determines
 whether the second rectangle is inside the first or overlaps with the first, as shown
 in Figure 3.9. Test your program to cover all cases.

 */
public class Exercise_28 {
    public static void main(String[] args) {
        double r1_x, r1_y, r1_width, r1_height, r2_x, r2_y, r2_width, r2_height;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter r1's center x-, y- coordinates, width, and height: ");
        r1_x = input.nextDouble();
        r1_y = input.nextDouble();
        r1_width = input.nextDouble();
        r1_height = input.nextDouble();

        System.out.print("Enter r2's center x-, y- coordinates, width, and height: ");
        r2_x = input.nextDouble();
        r2_y = input.nextDouble();
        r2_width = input.nextDouble();
        r2_height = input.nextDouble();
    }
}
