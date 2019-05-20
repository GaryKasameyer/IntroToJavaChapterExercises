package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/19/2017.

 (Business: check ISBN-10) Rewrite the Programming Exercise 3.9 by entering the
 ISBN number as a string.

 */
public class Exercise_19 {
    public static void main(String[] args) {
        String isbn;
        int num1, num2, num3, num4, num5, num6, num7, num8, num9, chechSum;

        //Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        isbn = input.next();

        // Calculate the numbers
        num1 = Integer.parseInt(isbn.substring(0, 1));
        num2 = Integer.parseInt(isbn.substring(1, 2));
        num3 = Integer.parseInt(isbn.substring(2, 3));
        num4 = Integer.parseInt(isbn.substring(3, 4));
        num5 = Integer.parseInt(isbn.substring(4, 5));
        num6 = Integer.parseInt(isbn.substring(5, 6));
        num7 = Integer.parseInt(isbn.substring(6, 7));
        num8 = Integer.parseInt(isbn.substring(7, 8));
        num9 = Integer.parseInt(isbn.substring(8, 9));

        // Compute the checkSum
        chechSum = (num1 * 1 + num2 * 2 + num3 * 3 + num4 * 4 + num5 * 5 + num6 * 6 + num7 * 7 + num8 * 8 + num9 * 9) % 11;

        // Display the final result
        if(chechSum == 10)
            System.out.print("The ISBN-10 number is " + num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + "X");
        else
            System.out.print("The ISBN-10 number is " + num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + chechSum);
    }
}
