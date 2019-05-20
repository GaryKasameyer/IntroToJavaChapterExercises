package Chapter6_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/1/2017.

 (Occurrences of a specified character) Write a method that finds the number of
 occurrences of a specified character in a string using the following header:

 public static int count(String str, char a)

 For example, count("Welcome", 'e') returns 2. Write a test program that
 prompts the user to enter a string followed by a character and displays the number
 of occurrences of the character in the string.

 */
public class Exercise_23 {
    public static void main(String[] args) {
        String str, charStr;
        char a;

        // Prompt user for string and char input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        str = input.nextLine();

        System.out.print("Enter the character to count: ");
        charStr = input.next();
        a = charStr.charAt(0);

        // Call the count() method and print out the result
        System.out.printf("The occurrences of %1s is %1d", a, count(str, a));
    }

    //
    public static int count(String str, char a){
        int count = 0;
        // Use for loop to go through string
        // Use charAt() to check if each char == a and count++
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == a)
                count++;
        }

        return count;
    }
}
