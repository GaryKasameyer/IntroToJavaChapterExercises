package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/27/2017.

 (Process string) Write a program that prompts the user to enter a string and displays
 the characters at odd positions. Here is a sample run:

 Enter a string: Beijing Chicago
 BiigCiao

 */
public class Exercise_48 {
    public static void main(String[] args) {
        String user;

        // Prompt user for string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        user = input.nextLine();

        // use loop to print charAt odd numbers
        for(int i = 0; i < user.length(); i += 2)
            System.out.print(user.charAt(i));
    }
}
