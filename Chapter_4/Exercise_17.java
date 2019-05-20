package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/19/2017.

 (Days of a month) Write a program that prompts the user to enter a year and the
 first three letters of a month name (with the first letter in uppercase) and displays
 the number of days in the month. Here is a sample run:

 Enter a year: 2001
 Enter a month: Jan
 Jan 2001 has 31 days

 Enter a year: 2016
 Enter a month: Feb
 Jan 2016 has 29 days

 */
public class Exercise_17 {
    public static void main(String[] args) {
        int year;
        String month;
        boolean isLeapYear;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        // Get year
        System.out.print("Enter a year: ");
        year = input.nextInt();
        // Get month
        System.out.print("Enter a month: ");
        month = input.next();
        // Get first three letters, in case user enters full month name
        month = month.substring(0, 3);


        if(month.equals("Jan")){
            System.out.print(month + " " + year + " has 31 days");
        }else if(month.equals("Feb")) {
            isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if(isLeapYear)
                System.out.print(month + " " + year + " has 29 days");
            else
                System.out.print(month + " " + year + " has 28 days");
        }else if(month.equals("Mar")){
            System.out.print(month + " " + year + " has 31 days");
        }else if(month.equals("Apr")){
            System.out.print(month + " " + year + " has 30 days");
        }else if(month.equals("May")){
            System.out.print(month + " " + year + " has 31 days");
        }else if(month.equals("Jun")){
            System.out.print(month + " " + year + " has 30 days");
        }else if(month.equals("Jul")){
            System.out.print(month + " " + year + " has 31 days");
        }else if(month.equals("Aug")){
            System.out.print(month + " " + year + " has 31 days");
        }else if(month.equals("Sep")){
            System.out.print(month + " " + year + " has 30 days");
        }else if(month.equals("Oct")){
            System.out.print(month + " " + year + " has 31 days");
        }else if(month.equals("Nov")){
            System.out.print(month + " " + year + " has 30 days");
        }else if(month.equals("Dec")){
            System.out.print(month + " " + year + " has 31 days");
        }else
            System.out.print("Invalid Input");
    }
}
