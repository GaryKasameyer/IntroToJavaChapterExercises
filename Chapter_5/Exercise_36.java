package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/17/2017.

 (Business application: checking ISBN ) Use loops to simplify Programming
 Exercise 3.9.

 */
public class Exercise_36 {
    public static void main(String[] args) {
        int isbn, num1, num2, num3, num4, num5, num6, num7, num8, num9, chechSum = 0, divide = 100000000;

        //Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        isbn = input.nextInt();

        for(int i = 1; i <= 9; i++){
            if(i == 9) {
                chechSum += isbn % 10 * i;
                chechSum %= 11;
            } else
                chechSum += isbn / divide % 10 * i;

            divide /= 10;
        }

        if(chechSum == 10)
            System.out.print("The ISBN-10 number is " + isbn + "X");
        else
            System.out.print("The ISBN-10 number is " + isbn + chechSum);
    }
}
