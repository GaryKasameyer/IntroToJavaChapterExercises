package Chapter6_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/31/2017.

 (Phone keypads) The international standard letter/number mapping for telephones
 is shown in Programming Exercise 4.15. Write a method that returns a number,
 given an uppercase letter, as follows:

 int getNumber(char uppercaseLetter)

 Write a test program that prompts the user to enter a phone number as a string.
 The input number may contain letters. The program translates a letter (uppercase
 or lowercase) to a digit and leaves all other characters intact. Here is a sample run
 of the program:

 Enter a string: 1-800-Flowers
 1-800-3569377

 Enter a string: 1800flowers
 18003569377

 */
public class Exercise_21 {
    public static void main(String[] args) {
        String phoneNumber;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a phone number: ");
        phoneNumber = input.next();
        phoneNumber = phoneNumber.toLowerCase();

        // Use loop to check if charAt() is a char or int
        // if char call getNumber() to get the int and print it out
        // if it is an int already, just print and move on
        for(int i = 0; i < phoneNumber.length(); i++){
            if(Character.isDigit(phoneNumber.charAt(i)) || phoneNumber.charAt(i) == '-')
                System.out.print(phoneNumber.charAt(i));
            else if(Character.isLetter(phoneNumber.charAt(i)))
                System.out.print(getNumber(phoneNumber.charAt(i)));

        }

    }

    public static int getNumber(char uppercaseLetter){
        if(uppercaseLetter >= 'a' && uppercaseLetter <= 'c')
            return 2;
        else if(uppercaseLetter >= 'd' && uppercaseLetter <= 'f')
            return 3;
        else if(uppercaseLetter >= 'g' && uppercaseLetter <= 'i')
            return 4;
        else if(uppercaseLetter >= 'j' && uppercaseLetter <= 'l')
            return 5;
        else if(uppercaseLetter >= 'm' && uppercaseLetter <= 'o')
            return 6;
        else if(uppercaseLetter >= 'p' && uppercaseLetter <= 's')
            return 7;
        else if(uppercaseLetter >= 't' && uppercaseLetter <= 'v')
            return 8;
        else
            return 9;

    }
}













