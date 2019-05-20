package Chapter6_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/1/2017.

 (Convert milliseconds to hours, minutes, and seconds) Write a method that converts
 milliseconds to hours, minutes, and seconds using the following header:

 public static String convertMillis(long millis)

 The method returns a string as hours:minutes:seconds. For example,
 convertMillis(5500) returns a string 0:0:5, convertMillis(100000) returns
 a string 0:1:40, and convertMillis(555550000) returns a string 154:19:10.

 */
public class Exercise_25 {
    public static void main(String[] args) {
        long millis;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a time in milliseconds: ");
        millis = input.nextInt();

        System.out.print(convertMillis(millis));
    }

    public static String convertMillis(long millis){
        // Obtain the total milliseconds since midnight, Jan 1, 1970
        long totalMilliseconds = millis;

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

        // Return the hours:minutes:seconds string
        return (totalHours + ":" + currentMinute + ":" + currentSecond);
    }
}
