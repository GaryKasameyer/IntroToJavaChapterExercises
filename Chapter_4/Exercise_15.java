package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/19/2017.

 (Phone key pads) The international standard letter/number mapping found on the
 telephone is shown below:

 Write a program that prompts the user to enter a letter and displays its corresponding
 number.

 Enter a letter: A
 The corresponding number is 2

 Enter a letter: a
 The corresponding number is 2

 Enter a letter: +
 + is an invalid input

 */
public class Exercise_15 {
    public static void main(String[] args) {
        String user = "";
        char letter;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        // collect string
        user = input.next();
        // convert to lower case to allow upper and lowers
        user = user.toLowerCase();
        // get the letter entered
        letter = user.charAt(0);

        // user switch to display key
        if(letter >= 'a' && letter <= 'z'){
            switch ((int)letter){
                case (int)'a':{
                    System.out.print("The corresponding number is 2");
                    break;
                }
                case (int)'b':{
                    System.out.print("The corresponding number is 2");
                    break;
                }
                case (int)'c':{
                    System.out.print("The corresponding number is 2");
                    break;
                }
                case (int)'d':{
                    System.out.print("The corresponding number is 3");
                    break;
                }
                case (int)'e':{
                    System.out.print("The corresponding number is 3");
                    break;
                }
                case (int)'f':{
                    System.out.print("The corresponding number is 3");
                    break;
                }
                case (int)'g':{
                    System.out.print("The corresponding number is 4");
                    break;
                }
                case (int)'h':{
                    System.out.print("The corresponding number is 4");
                    break;
                }
                case (int)'i':{
                    System.out.print("The corresponding number is 4");
                    break;
                }
                case (int)'j':{
                    System.out.print("The corresponding number is 5");
                    break;
                }
                case (int)'k':{
                    System.out.print("The corresponding number is 5");
                    break;
                }
                case (int)'l':{
                    System.out.print("The corresponding number is 5");
                    break;
                }
                case (int)'m':{
                    System.out.print("The corresponding number is 6");
                    break;
                }
                case (int)'n':{
                    System.out.print("The corresponding number is 6");
                    break;
                }
                case (int)'o':{
                    System.out.print("The corresponding number is 6");
                    break;
                }
                case (int)'p':{
                    System.out.print("The corresponding number is 7");
                    break;
                }
                case (int)'q':{
                    System.out.print("The corresponding number is 7");
                    break;
                }
                case (int)'r':{
                    System.out.print("The corresponding number is 7");
                    break;
                }
                case (int)'s':{
                    System.out.print("The corresponding number is 7");
                    break;
                }
                case (int)'t':{
                    System.out.print("The corresponding number is 8");
                    break;
                }
                case (int)'u':{
                    System.out.print("The corresponding number is 8");
                    break;
                }
                case (int)'v':{
                    System.out.print("The corresponding number is 8");
                    break;
                }
                case (int)'w':{
                    System.out.print("The corresponding number is 9");
                    break;
                }
                case (int)'x':{
                    System.out.print("The corresponding number is 9");
                    break;
                }
                case (int)'y':{
                    System.out.print("The corresponding number is 9");
                    break;
                }
                case (int)'z':{
                    System.out.print("The corresponding number is 9");
                    break;
                }
            }
        }else
            System.out.print(letter + " is an invalid input");
    }
}
