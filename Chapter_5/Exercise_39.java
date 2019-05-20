package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 10/18/2017.

 (Financial application: find the sales amount) You have just started a sales job
 in a department store. Your pay consists of a base salary and a commission. The
 base salary is $5,000. The scheme shown below is used to determine the commission
 rate.

 Sales Amount               Commission Rate
 $0.01–$5,000                   8 percent
 $5,000.01–$10,000              10 percent
 $10,000.01 and above           12 percent

 Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next
 $5000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the commission
 is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.

 Your goal is to earn $30,000 a year. Write a program that finds the minimum sales
 you have to generate in order to make $30,000.

 */
public class Exercise_39 {
    public static void main(String[] args) {
        double earnings = 0, sales = 1, total = 0;

        // Use while loop to calculate earnings for a given salary
        // if
        while(earnings <= 25000){
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






















