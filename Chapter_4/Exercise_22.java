package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/20/2017.

 (Check substring) Write a program that prompts the user to enter two strings and
 reports whether the second string is a substring of the first string.

 Enter string s1: ABCD
 Enter string s2: BC
 BC is a substring of ABCD

 Enter string s1: ABCD
 Enter string s2: BDC
 BDC is not a substring of ABCD

 */
public class Exercise_22 {
    public static void main(String[] args) {
        String s1 = "", s2 = "";

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        s1 = input.nextLine();
        System.out.print("Enter string s2: ");
        s2 = input.nextLine();

        // check if s1 contains s2 as a substring
        if(s1.contains(s2))
            System.out.print(s2 + " is a substring of " + s1);
        else
            System.out.print(s2 + " is not a substring of " + s1);
    }
}
