package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/30/2017.

 (Game: scissor, rock, paper) Write a program that plays the popular scissor-rock-paper
 game. (A scissor can cut a paper, a rock can knock a scissor, and a paper can
 wrap a rock.) The program randomly generates a number 0, 1, or 2 representing
 scissor, rock, and paper. The program prompts the user to enter a number 0, 1, or
 2 and displays a message indicating whether the user or the computer wins, loses,
 or draws. Here are sample runs:

 */
public class Exercise_17 {
    public static void main(String[] args) {
        int bot =  (int)(Math.random() * ((2) + 1)), player;
        final int SCISSORS = 0, ROCK = 1, PAPER = 2;


        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("scissor(0), rock(1), paper(2): ");
        player = input.nextInt();

        if(bot == player)
            System.out.println("The computer is paper, you are paper too. It is a draw");
        else if(bot == SCISSORS && player == PAPER)
            System.out.println("The computer is scissors, you are paper. You lose");
        else if(bot == ROCK && player == SCISSORS)
            System.out.println("The computer is rock, you are scissors. You lose");
        else if(bot == PAPER && player == ROCK)
            System.out.println("The computer is paper, you are rock. You lose");
        else if(bot == PAPER && player == SCISSORS)
            System.out.println("The computer is paper, you are scissors. You win");
        else if(bot == SCISSORS && player == ROCK)
            System.out.println("The computer is scissors, you are rock. You win");
        else if(bot == ROCK && player == PAPER)
            System.out.println("The computer is rock, you are paper. You win");
    }
}
