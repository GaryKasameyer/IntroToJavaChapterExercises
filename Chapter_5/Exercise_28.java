package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/2/2017.

 (Display the first days of each month) Write a program that prompts the user to
 enter the year and first day of the year, and displays the first day of each month
 in the year. For example, if the user entered the year 2013, and 2 for Tuesday,
 January 1, 2013, your program should display the following output:

 January 1, 2013 is Tuesday
 ...
 December 1, 2013 is Sunday

 */
public class Exercise_28 {
    public static void main(String[] args) {
        int year, day;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the year: ");
        year = input.nextInt();

        System.out.print("Enter first day of year (1 for monday..): ");
        day = input.nextInt();

        // Calculate the days by looping through 12 months
        // print first day, add number of days in month
        // mod by 7 to get day of week
        // next loop prints that mod and continues cycle
        for(int i = 1; i < 13; i++){

            switch(day){
                case 0:
                    System.out.println("The first day of " + year + " is Sunday");
                    break;
                case 1:
                    System.out.println("The first day of " + year + " is Monday");
                    break;
                case 2:
                    System.out.println("The first day of " + year + " is Tuesday");
                    break;
                case 3:
                    System.out.println("The first day of " + year + " is Wednesday");
                    break;
                case 4:
                    System.out.println("The first day of " + year + " is Thursday");
                    break;
                case 5:
                    System.out.println("The first day of " + year + " is Friday");
                    break;
                case 6:
                    System.out.println("The first day of " + year + " is Saturday");
                    break;
            }

            switch(i){
                case 1:
                    day += 31;
                    break;
                case 2:
                    if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                        day += 29;
                    else
                        day += 28;
                    break;
                case 3:
                    day += 31;
                    break;
                case 4:
                    day += 30;
                    break;
                case 5:
                    day += 31;
                    break;
                case 6:
                    day += 30;
                    break;
                case 7:
                    day += 31;
                    break;
                case 8:
                    day += 31;
                    break;
                case 9:
                    day += 30;
                    break;
                case 10:
                    day += 31;
                    break;
                case 11:
                    day += 30;
                    break;
                case 12:
                    day += 31;
                    break;
            }

            day = day % 7;
        }
    }
}
