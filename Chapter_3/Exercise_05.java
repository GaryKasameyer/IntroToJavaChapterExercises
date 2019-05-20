package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/26/2017.

 (Find future dates) Write a program that prompts the user to enter an integer for
 today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
 prompt the user to enter the number of days after today for a future day and display
 the future day of the week. Here is a sample run:

 */
public class Exercise_05 {
    public static void main(String[] args) {
        int today, future, numberOfDays;
        String day = "", futureDay = "";

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter today's date: ");
        today = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        numberOfDays = input.nextInt();

        // Perform calculation
        future = today + numberOfDays;

        /*if(future > 6)
            future %= 6;
        else
            future = today + numberOfDays;
            */
        // Determine the current day
        switch (today){
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
        }

        // Determine the future day
        switch (future){
            case 0:
                futureDay = "Sunday";
                break;
            case 1:
                futureDay = "Monday";
                break;
            case 2:
                futureDay = "Tuesday";
                break;
            case 3:
                futureDay = "Wednesday";
                break;
            case 4:
                futureDay = "Thursday";
                break;
            case 5:
                futureDay = "Friday";
                break;
            case 6:
                futureDay = "Saturday";
                break;
        }

        System.out.print("Today is " + day + " and the future day is " + futureDay);
    }
}
