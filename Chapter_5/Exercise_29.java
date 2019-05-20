package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/14/2017.

 (Display calendars) Write a program that prompts the user to enter the year and
 first day of the year and displays the calendar table for the year on the console. For
 example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
 your program should display the calendar for each month in the year, as follows:

        January 2013
 ----------------------------
 Sun Mon Tue Wed Thu Fri Sat
          1   2   3   4   5
 6    7   8   9  10  11  12
 13  14  15  16  17  18  19
 20  21  22  23  24  25  26
 27  28  29  30  31

            ...

        December 2013
 ----------------------------
 Sun Mon Tue Wed Thu Fri Sat
 1   2   3   4   5   6   7
 8   9  10  11  12  13  14
 15 16  17  18  19  20  21
 22 23  24  25  26  27  28
 29 30  31

 */
public class Exercise_29 {
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
        for (int i = 1; i < 13; i++) {
            switch (i) {
                case 1:
                    System.out.printf("\n\t\tJanuary %1d\n---------------------------\n" +
                            "Sun\tMon\tTue\tWed\tThu\tFri\tSat\n", year);
                    for(int j = 0; j < day; j++)
                        System.out.printf("\t");
                    for(int k = 1; k <= 31; k++){
                        System.out.printf("%1d\t", k);
                        if((k + day)% 7 == 0)
                            System.out.println();
                    }
                    //System.out.printf(" %1d", day);
                    day += 31;
                    break;
                case 2:
                    if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                        System.out.printf("\n\t\tFebruary %1d\n---------------------------\n" +
                                "Sun\tMon\tTue\tWed\tThu\tFri\tSat\n", year);
                        for (int j = 0; j < day; j++)
                            System.out.printf("\t");
                        for (int k = 1; k <= 29; k++) {
                            System.out.printf("%1d\t", k);
                            if ((k + day) % 7 == 0)
                                System.out.println();
                        }
                        day += 29;
                    }
                    else {
                        System.out.printf("\n\t\tFebruary %1d\n---------------------------\n" +
                                "Sun\tMon\tTue\tWed\tThu\tFri\tSat\n", year);
                        for (int j = 0; j < day; j++)
                            System.out.printf("\t");
                        for (int k = 1; k <= 28; k++) {
                            System.out.printf("%1d\t", k);
                            if ((k + day) % 7 == 0)
                                System.out.println();
                        }
                        day += 28;
                    }
                    break;
                case 3:
                    System.out.printf("\n\t\tMarch %1d\n---------------------------\n" +
                            "Sun\tMon\tTue\tWed\tThu\tFri\tSat\n", year);
                    for(int j = 0; j < day; j++)
                        System.out.printf("\t");
                    for(int k = 1; k <= 31; k++){
                        System.out.printf("%1d\t", k);
                        if((k + day)% 7 == 0)
                            System.out.println();
                    }
                    day += 31;
                    break;
                case 4:
                    System.out.printf("\n\t\tApril %1d\n---------------------------\n" +
                            "Sun\tMon\tTue\tWed\tThu\tFri\tSat\n", year);
                    for(int j = 0; j < day; j++)
                        System.out.printf("\t");
                    for(int k = 1; k <= 30; k++){
                        System.out.printf("%1d\t", k);
                        if((k + day)% 7 == 0)
                            System.out.println();
                    }
                    day += 30;
                    break;
                case 5:
                    System.out.printf("\n\t\tMay %1d\n---------------------------\n" +
                            "Sun\tMon\tTue\tWed\tThu\tFri\tSat\n", year);
                    for(int j = 0; j < day; j++)
                        System.out.printf("\t");
                    for(int k = 1; k <= 31; k++){
                        System.out.printf("%1d\t", k);
                        if((k + day)% 7 == 0)
                            System.out.println();
                    }
                    day += 31;
                    break;
                case 6:
                    System.out.printf("\n\t\tJune %1d\n---------------------------\n" +
                            "Sun\tMon\tTue\tWed\tThu\tFri\tSat\n", year);
                    for(int j = 0; j < day; j++)
                        System.out.printf("\t");
                    for(int k = 1; k <= 30; k++){
                        System.out.printf("%1d\t", k);
                        if((k + day)% 7 == 0)
                            System.out.println();
                    }
                    day += 30;
                    break;
                case 7:
                    System.out.printf("\n\t\tJuly %1d\n---------------------------\n" +
                            "Sun\tMon\tTue\tWed\tThu\tFri\tSat\n", year);
                    for(int j = 0; j < day; j++)
                        System.out.printf("\t");
                    for(int k = 1; k <= 31; k++){
                        System.out.printf("%1d\t", k);
                        if((k + day)% 7 == 0)
                            System.out.println();
                    }
                    day += 31;
                    break;
                case 8:
                    System.out.printf("\n\t\tAugust %1d\n---------------------------\n" +
                            "Sun\tMon\tTue\tWed\tThu\tFri\tSat\n", year);
                    for(int j = 0; j < day; j++)
                        System.out.printf("\t");
                    for(int k = 1; k <= 31; k++){
                        System.out.printf("%1d\t", k);
                        if((k + day)% 7 == 0)
                            System.out.println();
                    }
                    day += 31;
                    break;
                case 9:
                    System.out.printf("\n\t\tSeptember %1d\n---------------------------\n" +
                            "Sun\tMon\tTue\tWed\tThu\tFri\tSat\n", year);
                    for(int j = 0; j < day; j++)
                        System.out.printf("\t");
                    for(int k = 1; k <= 30; k++){
                        System.out.printf("%1d\t", k);
                        if((k + day)% 7 == 0)
                            System.out.println();
                    }
                    day += 30;
                    break;
                case 10:
                    System.out.printf("\n\t\tOctober %1d\n---------------------------\n" +
                            "Sun\tMon\tTue\tWed\tThu\tFri\tSat\n", year);
                    for(int j = 0; j < day; j++)
                        System.out.printf("\t");
                    for(int k = 1; k <= 31; k++){
                        System.out.printf("%1d\t", k);
                        if((k + day)% 7 == 0)
                            System.out.println();
                    }
                    day += 31;
                    break;
                case 11:
                    System.out.printf("\n\t\tNovember %1d\n---------------------------\n" +
                            "Sun\tMon\tTue\tWed\tThu\tFri\tSat\n", year);
                    for(int j = 0; j < day; j++)
                        System.out.printf("\t");
                    for(int k = 1; k <= 30; k++){
                        System.out.printf("%1d\t", k);
                        if((k + day)% 7 == 0)
                            System.out.println();
                    }
                    day += 30;
                    break;
                case 12:
                    System.out.printf("\n\t\tDecember %1d\n---------------------------\n" +
                            "Sun\tMon\tTue\tWed\tThu\tFri\tSat\n", year);
                    for(int j = 0; j < day; j++)
                        System.out.printf("\t");
                    for(int k = 1; k <= 31; k++){
                        System.out.printf("%1d\t", k);
                        if((k + day)% 7 == 0)
                            System.out.println();
                    }
                    day += 31;
                    break;
            }



            day = day % 7;

        }
    }
}
