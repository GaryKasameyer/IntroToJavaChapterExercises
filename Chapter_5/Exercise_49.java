package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/27/2017.

 (Count vowels and consonants) Assume letters A, E, I, O, and U as the vowels.
 Write a program that prompts the user to enter a string and displays the number
 of vowels and consonants in the string.

 Enter a string: Programming is fun
 The number of vowels is 5
 The number of consonants is 11

 */
public class Exercise_49 {
    public static void main(String[] args) {
        int vowel = 0, constant = 0;
        String user;

        // Prompt user for string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        user = input.nextLine();
        user = user.toLowerCase();

        // use loop to count vowels and constants
        for(int i = 0; i < user.length(); i++){
            if(user.charAt(i) != ' ') {
                if (user.charAt(i) == 'a' || user.charAt(i) == 'e' || user.charAt(i) == 'i' ||
                        user.charAt(i) == 'o' || user.charAt(i) == 'u' || user.charAt(i) == 'y')
                    vowel++;
                else
                    constant++;
            }
        }

        // Print out the result
        System.out.println("The number of vowels is " + vowel);
        System.out.print("The number of constants is " + constant);
    }
}
