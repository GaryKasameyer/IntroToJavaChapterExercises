package Chapter6_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/31/2017.

 (Count the letters in a string) Write a method that counts the number of letters in
 a string using the following header:

 public static int countLetters(String s)

 Write a test program that prompts the user to enter a string and displays the number
 of letters in the string.

 */
public class Exercise_20 {
    public static void main(String[] args) {
        String user;

        // Prompt user for string to count letters
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        user = input.nextLine();

        // Call countLetters to get the number of letters and print them
        System.out.print("The number of letters is " + countLetters(user));
    }
    public static int countLetters(String s){
        int letterCount = 0;

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i)))
                letterCount++;
        }

        return letterCount;
    }

}
