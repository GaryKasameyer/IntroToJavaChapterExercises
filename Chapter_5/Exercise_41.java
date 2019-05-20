package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/21/2017.

 (Occurrence of max numbers) Write a program that reads integers, finds the largest
 of them, and counts its occurrences. Assume that the input ends with number
 0. Suppose that you entered 3 5 2 5 5 5 0; the program finds that the largest
 is 5 and the occurrence count for 5 is 4.

 (Hint: Maintain two variables, max and count. max stores the current max number,
 and count stores its occurrences. Initially, assign the first number to max
 and 1 to count. Compare each subsequent number with max. If the number is
 greater than max, assign it to max and reset count to 1. If the number is equal to
 max, increment count by 1.)

 Enter numbers: 3 5 2 5 5 5 0
 The largest number is 5
 The occurrence count of the largest number is 4
 */
public class Exercise_41 {
    public static void main(String[] args) {
        int max = -100, count = 0, value;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a list of integers: ");
        value = input.nextInt();

        while (value != 0){
            value = input.nextInt();

            if(value > max)
                max = value;
            if(value == max)
                count++;
        }

        // Print the final result
        System.out.printf("The largest number is %1d\nThe occurrence count of the largest number is %1d", max, count);
    }
}
