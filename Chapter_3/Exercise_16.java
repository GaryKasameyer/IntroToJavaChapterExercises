package Chapter3_Exercises;

/**
 * Created by Gary Kasameyer on 8/30/2017.

 (Random point) Write a program that displays a random coordinate in a rectangle.
 The rectangle is centered at (0, 0) with width 100 and height 200.

 */
public class Exercise_16 {
    public static void main(String[] args) {
        int x = (int)(Math.random() * ((100) + 1)), y = (int)(Math.random() * ((200) + 1));

        System.out.println("(" + x + "," + y + ")");
    }
}
