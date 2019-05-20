package Chapter2_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/23/2017.

 (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
 the current time in GMT. Revise the program so that it prompts the user to enter
 the time zone offset to GMT and displays the time in the specified time zone. Here
 is a sample run:

 */
public class Exercise_08 {
    public static void main(String[] args) {
        int offset;

        // Create Scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for timezone offset
        System.out.print("Enter the timezone offset to GMT: ");
        offset = input.nextInt();

        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = System.currentTimeMillis();

        // Obtain the total seconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;

        // Compute the current second in the minute in the hour
        long currentSecond = totalSeconds % 60;

        // Obtain the total minutes
        long totalMinutes = totalSeconds / 60;

        // Compute the current minute in the hour
        long currentMinute = totalMinutes % 60;

        // Obtain the total hours
        long totalHours = totalMinutes / 60;

        // Compute the current hour
        long currentHour = (totalHours + offset) % 24;

        // Display results
        System.out.println("Current time is " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT");
    }
}
