package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 11/5/2017.

 (Game: chance of winning at craps) Revise Exercise 6.30 to run it 10,000 times
 and display the number of winning games.

 */
public class Exercise_32 {
    public static void main(String[] args) {
        int dice1, dice2, sum, wins = 0, losses = 0;

        for(int i = 1; i <= 10000; i++) {
            // Roll the dice
            dice1 = rollADice();
            dice2 = rollADice();

            // Calculate the sum of rolled dice and display them
            sum = dice1 + dice2;
            System.out.println("You rolled " + dice1 + " + " + dice2 + " is " + sum);

            // Check for wins
            if (checkForCraps(sum)) {
                System.out.println("You Lose");
                losses++;
            }
            else if (checkForNatural(sum)) {
                System.out.println("You Win");
                wins++;
            }
            else if(checkForPoint(sum) == 0)
                losses++;
            else
                wins++;
        }

        System.out.printf("\nNumber of wins: %1d\nNumber of losses: %1d", wins, losses);
    }

    /** Use rollDice() to return random int value of 1 - 6 to simulate a dice roll */
    public static int rollADice(){
        return  (int)(Math.random() * ((6 - 1) + 1) + 1);
    }

    public static boolean checkForCraps(int sum){
        if(sum == 2 || sum == 3 || sum == 12)
            return true;
        else
            return false;
    }

    public static boolean checkForNatural(int sum){
        if(sum == 7 || sum == 11)
            return true;
        return false;
    }

    public static int checkForPoint(int sum){
        int dice3, dice4, sum2;

        System.out.println("The point is " + sum);

        do{
            dice3 = rollADice();
            dice4 = rollADice();
            sum2 = dice3 + dice4;
        }while(!(sum2 == sum || sum2 == 7));

        System.out.println("You rolled " + dice3 + " + " + dice4 + " = " + sum2);

        if(sum2 == 7) {
            System.out.println("You Lose!");
            return 0;
        }
        else {
            System.out.println("You Win");
            return 1;
        }
    }
}
