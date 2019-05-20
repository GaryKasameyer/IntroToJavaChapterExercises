package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/27/2017.

 (Longest common prefix) Write a program that prompts the user to enter two
 strings and displays the largest common prefix of the two strings. Here are some
 sample runs:

 Enter the first string: Welcome to C++
 Enter the second string: Welcome to programming
 The common prefix is Welcome to

 Enter the first string: Atlanta
 Enter the second string: Macon
 Atlanta and Macon have no common prefix

 */
public class Exercise_51 {
    public static void main(String[] args) {
        String stringOne, stringTwo;
        int y = -1;

        // Prompt user to enter two strings
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        stringOne = input.nextLine();

        System.out.print("Enter the second string: ");
        stringTwo = input.nextLine();

        // use substrings and and check if stringOne.substring(i, j).equals(stringTwo.substring(i, j));
        for(int j = 1; j < stringOne.length(); j++){
            if(j < stringOne.length() && j < stringTwo.length() && stringOne.substring(0, j).equals(stringTwo.substring(0, j)))
                y = j;
        }

        // Print out any prefix
        if(y == -1)
            System.out.print(stringOne + " and " + stringTwo + " have no common prefix");
        else
            System.out.print("The common prefix is " + stringOne.substring(0, y));
    }
}








