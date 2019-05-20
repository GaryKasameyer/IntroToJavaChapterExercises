package Chapter6_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/28/2017.

 (Sum the digits in an integer) Write a method that computes the sum of the digits
 in an integer. Use the following method header:

 public static int sumDigits(long n)

 For example, sumDigits(234) returns 9 (2 + 3 + 4). (Hint: Use the % operator
 to extract digits, and the / operator to remove the extracted digit. For instance,
 to extract 4 from 234, use 234 % 10 (= 4). To remove 4 from 234, use 234 / 10
 (= 23). Use a loop to repeatedly extract and remove the digit until all the digits
 are extracted. Write a test program that prompts the user to enter an integer and
 displays the sum of all its digits.

 */
public class Exercise_02 {
    public static void main(String[] args) {
        int n;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        n = input.nextInt();

        // call the sumDigits method and print it out
        System.out.print("The sum of " + n + " is " + sumDigits(n));

    }

    public static int sumDigits(long n){
        int sum = 0;
        for(int i = 1; i < n; i *= 10){
            sum += n / i % 10;
        }
        return sum;
    }
}
