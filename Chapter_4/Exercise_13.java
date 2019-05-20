package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/18/2017.

 (Vowel or consonant?) Write a program that prompts the user to enter a letter and
 check whether the letter is a vowel or consonant. Here is a sample run:

 */
public class Exercise_13 {
    public static void main(String[] args) {
        char user;
        String letter = "";

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        letter = input.nextLine();
        user = letter.charAt(0);
        //System.out.print("char is " + user);

        if(user != 'a' && user != 'A' && user != 'e' && user != 'E' && user != 'i' && user != 'I'
                && user != 'o' && user != 'O' && user != 'u' && user != 'U' && user != 'y' && user != 'Y'
                && user != 'z' && user != 'Z' && user != 'b' && user != 'B' && user != 't' && user != 'T'
                && user != 'g' && user != 'G' && user != 'h' && user != 'H')
            System.out.print(user + " is an invalid input.");
        else{
            switch((int)user){
                case (int)'a':{
                    System.out.print(user + " is a vowel");
                    break;
                }
                case (int)'A':{
                    System.out.print(user + " is a vowel");
                    break;
                }
                case (int)'e':{
                    System.out.print(user + " is a vowel");
                    break;
                }
                case (int)'E':{
                    System.out.print(user + " is a vowel");
                    break;
                }
                case (int)'i':{
                    System.out.print(user + " is a vowel");
                    break;
                }
                case (int)'I':{
                    System.out.print(user + " is a vowel");
                    break;
                }
                case (int)'o':{
                    System.out.print(user + " is a vowel");
                    break;
                }
                case (int)'O':{
                    System.out.print(user + " is a vowel");
                    break;
                }
                case (int)'u':{
                    System.out.print(user + " is a vowel");
                    break;
                }
                case (int)'U':{
                    System.out.print(user + " is a vowel");
                    break;
                }
                case (int)'y':{
                    System.out.print(user + " is a vowel");
                    break;
                }
                case (int)'Y':{
                    System.out.print(user + " is a vowel");
                    break;
                }
                case (int)'z':{
                    System.out.print(user + " is a constant");
                    break;
                }
                case (int)'Z':{
                    System.out.print(user + " is a constant");
                    break;
                }
                case (int)'b':{
                    System.out.print(user + " is a constant");
                    break;
                }
                case (int)'B':{
                    System.out.print(user + " is a constant");
                    break;
                }
                case (int)'t':{
                    System.out.print(user + " is a constant");
                    break;
                }
                case (int)'T':{
                    System.out.print(user + " is a constant");
                    break;
                }
                case (int)'g':{
                    System.out.print(user + " is a constant");
                    break;
                }
                case (int)'G':{
                    System.out.print(user + " is a constant");
                    break;
                }
                case (int)'h':{
                    System.out.print(user + " is a constant");
                    break;
                }
                case (int)'H':{
                    System.out.print(user + " is a constant");
                    break;
                }
            }
        }
    }
}
