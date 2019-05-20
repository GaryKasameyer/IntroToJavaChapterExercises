package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 9/30/2017.

 (Sum a series) Write a program to sum the following series:
 1/3 + 3/5 + 5/7 + 7/9 + 9/11 + 11/13 + ... + 95/97 + 97/99

 */
public class Exercise_24 {
    public static void main(String[] args) {
        // Create sum in double to maintain decimals
        double sum = 0.0;

        // Create loop to calculate series
        for(double i = 1; i <= 97; i += 2){
            sum += i / (i + 2);
        }

        // Print out the final result
        System.out.print("Sum is " + sum);
    }
}
