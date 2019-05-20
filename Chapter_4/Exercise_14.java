package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/19/2017.

 (Convert letter grade to number) Write a program that prompts the user to enter a
 letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2,
 1, or 0. Here is a sample run:

 */
public class Exercise_14 {
    public static void main(String[] args) {
        String user;
        char letter;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        user = input.next();
        letter = user.charAt(0);

        // use switch to find value
        if(letter != 'A' && letter != 'a' && letter != 'B' && letter != 'b' && letter != 'C' && letter != 'c' && letter != 'D' && letter != 'd' &&
                letter != 'F' && letter != 'f')
            System.out.print(letter + " is an invalid input.");
        else {
            switch ((int)letter){
                case (int)'a':{
                    System.out.print("The numerical value for grade " + letter + " is 4");
                    break;
                }
                case (int)'A':{
                    System.out.print("The numerical value for grade " + letter + " is 4");
                    break;
                }
                case (int)'b':{
                    System.out.print("The numerical value for grade " + letter + " is 3");
                    break;
                }
                case (int)'B':{
                    System.out.print("The numerical value for grade " + letter + " is 3");
                    break;
                }
                case (int)'c':{
                    System.out.print("The numerical value for grade " + letter + " is 2");
                    break;
                }
                case (int)'C':{
                    System.out.print("The numerical value for grade " + letter + " is 2");
                    break;
                }
                case (int)'d':{
                    System.out.print("The numerical value for grade " + letter + " is 1");
                    break;
                }
                case (int)'D':{
                    System.out.print("The numerical value for grade " + letter + " is 1");
                    break;
                }
                case (int)'f':{
                    System.out.print("The numerical value for grade " + letter + " is 0");
                    break;
                }
                case (int)'F':{
                    System.out.print("The numerical value for grade " + letter + " is 0");
                    break;
                }

            }
        }

    }
}
