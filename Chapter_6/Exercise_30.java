package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 11/2/2017.

 (Game: craps) Craps is a popular dice game played in casinos. Write a program
 to play a variation of the game, as follows:

 Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
 Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
 lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
 (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
 a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.

 Your program acts as a single player. Here are some sample runs.

 You rolled 5 + 6 = 11
 You win

 You rolled 1 + 2 = 3
 You lose

 You rolled 4 + 4 = 8
 point is 8
 You rolled 6 + 2 = 8
 You win

 You rolled 3 + 2 = 5
 point is 5
 You rolled 2 + 5 = 7
 You lose

 */
public class Exercise_30 {
    public static void main(String[] args) {
        int dice1, dice2, sum;

        // Roll the dice
        dice1 = rollADice();
        dice2 = rollADice();

        // Calculate the sum of rolled dice and display them
        sum = dice1 + dice2;
        System.out.println("You rolled " + dice1 + " + " + dice2 + " is " + sum);

        // Check for wins
        checkForCraps(sum);
        checkForNatural(sum);
        checkForPoint(sum);
    }

    /** Use rollDice() to return random int value of 1 - 6 to simulate a dice roll */
    public static int rollADice(){
        return  (int)(Math.random() * ((6 - 1) + 1) + 1);
    }

    public static void checkForCraps(int sum){
        if(sum == 2 || sum == 3 || sum == 12) {
            System.out.println("You Lose");
            System.exit(0);
        }
    }

    public static void checkForNatural(int sum){
        if(sum == 7 || sum == 11) {
            System.out.println("You Win");
            System.exit(0);
        }
    }

    public static void checkForPoint(int sum){
        int dice3, dice4, sum2;

        System.out.println("The point is " + sum);

        do{
            dice3 = rollADice();
            dice4 = rollADice();
            sum2 = dice3 + dice4;
        }while(!(sum2 == sum || sum2 == 7));

        System.out.println("You rolled " + dice3 + " + " + dice4 + " = " + sum2);

        if(sum2 == 7)
            System.out.println("You Lose!");
        else
            System.out.println("You Win");
    }
}
