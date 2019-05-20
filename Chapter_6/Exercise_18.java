package Chapter6_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/31/2017.

 (Check password) Some websites impose certain rules for passwords. Write a
 method that checks whether a string is a valid password. Suppose the password
 rules are as follows:

 ■ A password must have at least eight characters.
 ■ A password consists of only letters and digits.
 ■ A password must contain at least two digits.

 Write a program that prompts the user to enter a password and displays Valid
 Password if the rules are followed or Invalid Password otherwise.

 */
public class Exercise_18 {
    public static void main(String[] args) {
        String password;

        // Prompt user to enter password
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        password = input.next();

        // Use if statement to check password
        if(checkPassword(password))
            System.out.print("Password " + password + " is valid");
        else
            System.out.print("Password " + password + " is invalid");
    }

    public static boolean checkPassword(String password){
        boolean isPassword = true;
        int digitCount = 0;

        // Check if password is < 8 in length
        if(password.length() < 8)
            isPassword = false;
        for(int i = 0; i < password.length(); i++){
            char ch = password.charAt(i);
            if(Character.isDigit(ch))
                digitCount++;
            else if(!Character.isLetter(ch))
                return false;
        }
        if(digitCount < 2)
            isPassword = false;

        return isPassword;
    }
}





















