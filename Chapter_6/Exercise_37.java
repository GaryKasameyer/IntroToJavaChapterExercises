package Chapter6_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/7/2017.

 (Format an integer) Write a method with the following header to format the integer
 with the specified width.

 public static String format(int number, int width)

 The method returns a string for the number with one or more prefix 0s. The size
 of the string is the width. For example, format(34, 4) returns 0034 and format(
 34, 5) returns 00034. If the number is longer than the width, the method
 returns the string representation for the number. For example, format(34, 1)
 returns 34.

 Write a test program that prompts the user to enter a number and its width and
 displays a string returned by invoking format(number, width).

 */
public class Exercise_37 {
    public static void main(String[] args) {
        int number, width;

        // Prompt user to enter number and width
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.print("Enter its width: ");
        width = input.nextInt();

        System.out.print(format(number, width));
    }

    public static String format(int number, int width){
        String length = String.valueOf(number), prefix = "";
        for(int i = 1; i <= width - length.length(); i++){
            prefix += "0";
        }
        return prefix += String.valueOf(number);
    }
}
