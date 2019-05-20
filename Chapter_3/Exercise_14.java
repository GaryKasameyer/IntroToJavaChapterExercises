package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/30/2017.

 (Game: heads or tails) Write a program that lets the user guess whether the flip of
 a coin results in heads or tails. The program randomly generates an integer 0 or 1,
 which represents head or tail. The program prompts the user to enter a guess and
 reports whether the guess is correct or incorrect.

 */
public class Exercise_14 {
    public static void main(String[] args) {
        int guess, random = (int)(Math.random() * 2);

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a guess 0 for heads and 1 for tails: ");
        guess = input.nextInt();

        // determine if random and guess match and print result
        if(guess == random)
            System.out.print("Correct!");
        else
            System.out.print("Incorrect!");

    }
}
