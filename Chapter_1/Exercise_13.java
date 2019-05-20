package Chapter1_Exercises;

/**
 * Created by Gary Kasameyer on 8/20/2017.

 (Algebra: solve 2 * 2 linear equations) You can use Cramer’s rule to solve the following
 2 * 2 system of linear equation:

 ax + by = e
 cx + dy = f

     ed - bf
 x = --------
     ad - bc

     af - ec
 y = --------
     ad - bc
 Write a program that solves the following equation and displays the value for x and y:
        3.4x + 50.2y = 44.5
        2.1x + .55y = 5.9

 */
public class Exercise_13 {
    public static void main(String[] args) {

        // Use the Cramer's equation given and solve for each variable
        System.out.println("X = " + (((44.5 * .55) - (50.2 * 5.9)) / ((3.4 * .55) - (50.2 * 2.1))));
        System.out.println("Y = " + (((3.4 * 5.9) - (44.5 * 2.1)) / ((3.4 * .55) - (50.2 * 2.1))));
        // I check the results of these outputs and they are correct
    }
}
