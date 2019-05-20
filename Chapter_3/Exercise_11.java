package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/28/2017.

 (Find the number of days in a month) Write a program that prompts the user
 to enter the month and year and displays the number of days in the month. For
 example, if the user entered month 2 and year 2012, the program should display
 that February 2012 had 29 days. If the user entered month 3 and year 2015, the
 program should display that March 2015 had 31 days.

 */
public class Exercise_11 {
    public static void main(String[] args) {
        int month, year, numberOfDaysInMonth = 0;
        String nameOfMonth = "";

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the month and year: ");
        month = input.nextInt();
        year = input.nextInt();

        // Determine if year is leap year
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // use Switch case to determine numberOfDaysInMonth
        switch (month){
            case 1: numberOfDaysInMonth = 31;
                nameOfMonth = "January";
                break;
            case 2: numberOfDaysInMonth = 28;
                nameOfMonth = "February";
                break;
            case 3: numberOfDaysInMonth = 31;
                nameOfMonth = "March";
                break;
            case 4: numberOfDaysInMonth = 30;
                nameOfMonth = "April";
                break;
            case 5: numberOfDaysInMonth = 31;
                nameOfMonth = "May";
                break;
            case 6: numberOfDaysInMonth = 30;
                nameOfMonth = "June";
                break;
            case 7: numberOfDaysInMonth = 31;
                nameOfMonth = "July";
                break;
            case 8: numberOfDaysInMonth = 31;
                nameOfMonth = "August";
                break;
            case 9: numberOfDaysInMonth = 30;
                nameOfMonth = "September";
                break;
            case 10: numberOfDaysInMonth = 31;
                nameOfMonth = "October";
                break;
            case 11: numberOfDaysInMonth = 30;
                nameOfMonth = "November";
                break;
            case 12: numberOfDaysInMonth = 31;
                nameOfMonth = "December";
                break;
        }

        // Change value of february if leapyear == true
        if(isLeapYear && month == 2)
            numberOfDaysInMonth += 1;

        // Print out the final result
        System.out.print(nameOfMonth + " " + year + " had " + numberOfDaysInMonth + " days");

    }
}
