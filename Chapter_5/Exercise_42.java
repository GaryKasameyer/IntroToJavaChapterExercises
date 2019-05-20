package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/21/2017.

 (Financial application: find the sales amount) Rewrite Programming Exercise
 5.39 as follows:

 ■ Use a for loop instead of a do-while loop.
 ■ Let the user enter COMMISSION_SOUGHT instead of fixing it as a constant.

 */
public class Exercise_42 {
    public static void main(String[] args) {
        double earnings = 0, sales = 1, total = 0, commissionSought;

        // Prompt user for commission_sought
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the commission goal: ");
        commissionSought = input.nextDouble();

        // Use for loop to calculate earnings for a given salary
        // limited by commission sought
        for(; earnings <= commissionSought;){
            // increment sales
            sales++;
            total = sales;
            earnings = 0;

            // use if statement to separate the first 5000
            // the second and third
            // perform calculate for sales on each and gather the final earnings
            if(total <= 5000 && total > 0){
                earnings += total * .08;
                total -= 5000;
            }else if(total >= 5000.01 && total <= 10000){
                earnings += total * .10;
                total -= 5000;
            }else if(total > 10000){
                earnings += total * .12;
            }
        }

        // Print out the final result
        System.out.print("Sales is " + (int)sales + " earnings is " + earnings);
    }
}
