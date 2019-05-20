package Chapter2_Exercises;

/**
 * Created by Gary Kasameyer on 8/24/2017.

 (Print a table) Write a program that displays the following table. Cast floatingpoint
 numbers into integers.
 a b pow(a, b)
 1 2 1
 2 3 8
 3 4 81
 4 5 1024
 5 6 15625

 */
public class Exercise_18 {
    public static void main(String[] args) {
        int a = 1, b = 2, pow;

        // perform calculation and display result
        pow = (int)(Math.pow(a, b));
        System.out.println("a\tb\tpow(a, b)");
        System.out.println(a++ + "\t" + b++ + "\t" + pow++);
        // Second calc
        pow = (int)(Math.pow(a, b));
        System.out.println(a++ + "\t" + b++ + "\t" + pow++);
        // Third Calc
        pow = (int)(Math.pow(a, b));
        System.out.println(a++ + "\t" + b++ + "\t" + pow++);
        // Fourth Calc
        pow = (int)(Math.pow(a, b));
        System.out.println(a++ + "\t" + b++ + "\t" + pow++);
        // Fifth Calc
        pow = (int)(Math.pow(a, b));
        System.out.println(a++ + "\t" + b++ + "\t" + pow++);
    }
}
