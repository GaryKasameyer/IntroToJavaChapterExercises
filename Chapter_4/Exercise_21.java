package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/19/2017.

 (Check SSN) Write a program that prompts the user to enter a Social Security
 number in the format DDD-DD-DDDD, where D is a digit. Your program should
 check whether the input is valid. Here are sample runs:

 Enter a SSN: 232-23-5435
 232-23-5435 is a valid social security number

 Enter a SSN: 23-23-5435
 23-23-5435 is an invalid social security number

 */
public class Exercise_21 {
    public static void main(String[] args) {
        String user = "";
        int num1, num2, num3, num4, num5, num6, num7, num8, num9;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        user = input.nextLine();
        // check for invalid input
        if(user.length() != 11){
            System.out.print(user + " is an invalid social security number");
            System.exit(1);

        } else{
            num1 = Integer.parseInt(user.substring(0, 1));
            num2 = Integer.parseInt(user.substring(1, 2));
            num3 = Integer.parseInt(user.substring(2, 3));
            num4 = Integer.parseInt(user.substring(4, 5));
            num5 = Integer.parseInt(user.substring(5, 6));
            num6 = Integer.parseInt(user.substring(7, 8));
            num7 = Integer.parseInt(user.substring(8, 9));
            num8 = Integer.parseInt(user.substring(9, 10));
            num9 = Integer.parseInt(user.substring(10, 11));
            System.out.print("" + num1 + num2 + num3 + "-" + num4 + num5 + "-" + num6 + num7 + num8 + num9 + " is a valid social security number");
        }

    }
}
