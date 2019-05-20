package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/1/2017.

 (Science: day of the week) Zeller’s congruence is an algorithm developed by
 Christian Zeller to calculate the day of the week. The formula is
           26(m + 1)       k   j
 h = ( q + --------- + k + - + - + 5j ) % 7
             10            4   4

 where:

 ■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4:
 Wednesday, 5: Thursday, 6: Friday).
 ■ q is the day of the month.
 ■ m is the month (3: March, 4: April, …, 12: December). January and February
 are counted as months 13 and 14 of the previous year.
                           year
 ■ j is the century (i.e.,-----).
                            100
 ■ k is the year of the century (i.e., year % 100).

 Note that the division in the formula performs an integer division. Write a program
 that prompts the user to enter a year, month, and day of the month, and
 displays the name of the day of the week. Here are some sample runs:

 Enter year: (e.g., 2012): 2015
 Enter month: 1-12: 1
 Enter the day of the month: 1-31: 25
 Day of the week is Sunday

 Enter year: (e.g., 2012): 2012
 Enter month: 1-12: 5
 Enter the day of the month: 1-31: 12
 Day of the week is Saturday
 */
public class Exercise_21 {
    public static void main(String[] args) {
        int h, q, m, j, k, year;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        year = input.nextInt();

        System.out.print("Enter month: 1-12: ");
        m = input.nextInt();

        System.out.print("Enter the day of the month: 1-31: ");
        q = input.nextInt();

        if(m == 1) {
            m = 13;
            year--;
        }else if(m == 2){
            m = 14;
            year--;
        }

        j = year / 100;
        k = year % 100;

        // perform the calculation
        h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        switch(h){
            case 0:
                System.out.print("Day of the week is Saturday");
                break;
            case 1:
                System.out.print("Day of the week is Sunday");
                break;
            case 2:
                System.out.print("Day of the week is Monday");
                break;
            case 3:
                System.out.print("Day of the week is Tuesday");
                break;
            case 4:
                System.out.print("Day of the week is Wednesday");
                break;
            case 5:
                System.out.print("Day of the week is Thursday");
                break;
            case 6:
                System.out.print("Day of the week is Friday");
                break;
        }
    }
}
