package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/27/2017.

 (Reverse a string) Write a program that prompts the user to enter a string and
 displays the string in reverse order.

 Enter a string: ABCD
 The reversed string is DCBA

 */
public class Exercise_46 {
    public static void main(String[] args) {
        String forward = "";

        // Prompt user to enter string to reverse
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        forward = input.next();

        // use loop to display string backwards
        for(int i = forward.length() - 1; i >= 0; i--)
            System.out.print(forward.charAt(i));
    }
}
