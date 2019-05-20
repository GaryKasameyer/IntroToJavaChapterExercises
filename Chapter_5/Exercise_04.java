package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 9/21/2017.

 (Conversion from miles to kilometers) Write a program that displays the following
 table (note that 1 mile is 1.609 kilometers):

 Miles Kilometers
 1 1.609
 2 3.218
   ...
 9 14.481
 10 16.090

 */
public class Exercise_04 {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.609;

        // Print out Miles Kilometers header
        System.out.println("Miles\tKilometers");

        // Use a for loop to generate miles-kilometers for 10 miles
        for(int i = 1; i < 11; i++){
            System.out.println(i + "\t\t" + (i * KILOMETERS_PER_MILE));
        }
    }
}
