package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 10/31/2017.

 (Sum series) Write a method to compute the following series:

        1   2            i
        -   -         ------
 m(i) = 2 + 3 + ... +  i + 1

 Write a test program that displays the following table:

 i       m(i)
 --------------
 1       0.5000
 2       1.1667
     ...
 19      16.4023
 20      17.3546

 */
public class Exercise_13 {
    public static void main(String[] args) {
        // Print header
        System.out.printf("i\tm(i)\n----------\n");

        // Use loop to print out table values
        for(double i = 1, total = 0; i <= 20; i++)
            System.out.printf("%1.0f\t%1.4f\n", i, total = m(i, total));
    }

    public static double m(double i, double total){
        return total += i / (i + 1);

    }
}
