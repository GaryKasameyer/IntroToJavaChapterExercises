package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/16/2017.

 (Game: scissor, rock, paper) Programming Exercise 3.17 gives a program that
 plays the scissor-rock-paper game. Revise the program to let the user continuously
 play until either the user or the computer wins more than two times than its
 opponent.

 */
public class Exercise_34 {
    public static void main(String[] args) {
        int botScore = 0, playerScore = 0;
        final int SCISSORS = 0, ROCK = 1, PAPER = 2;
        boolean winner = false;


        while(!winner) {
            int bot = (int) (Math.random() * ((2) + 1)), player;
            // Prompt user for variable input
            Scanner input = new Scanner(System.in);
            System.out.print("scissor(0), rock(1), paper(2): ");
            player = input.nextInt();

            if (bot == player) {
                System.out.println("The computer is paper, you are paper too. It is a draw");
            }
            else if (bot == SCISSORS && player == PAPER) {
                System.out.println("The computer is scissors, you are paper. You lose");
                botScore += 1;
            }
            else if (bot == ROCK && player == SCISSORS) {
                System.out.println("The computer is rock, you are scissors. You lose");
                botScore += 1;
            }
            else if (bot == PAPER && player == ROCK) {
                System.out.println("The computer is paper, you are rock. You lose");
                botScore += 1;
            }
            else if (bot == PAPER && player == SCISSORS) {
                System.out.println("The computer is paper, you are scissors. You win");
                playerScore += 1;
            }
            else if (bot == SCISSORS && player == ROCK) {
                System.out.println("The computer is scissors, you are rock. You win");
                playerScore += 1;
            }
            else if (bot == ROCK && player == PAPER) {
                System.out.println("The computer is rock, you are paper. You win");
                playerScore += 1;
            }

            if(botScore >= (playerScore + 2))
                winner = true;
            else if(playerScore >= (botScore + 2))
                winner = true;
        }

        if(botScore >= (playerScore + 2))
            System.out.print("You Lose " + botScore + " - " + playerScore);
        else if(playerScore >= (botScore + 2))
            System.out.print("You Win " + botScore + " - " + playerScore);
    }
}
