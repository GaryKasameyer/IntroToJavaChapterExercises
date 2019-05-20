package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 11/6/2017.

 (Current date and time) Invoking System.currentTimeMillis() returns the
 elapsed time in milliseconds since midnight of January 1, 1970. Write a program
 that displays the date and time. Here is a sample run:

 Current date and time is May 16, 2012 10:34:23

 */
public class Exercise_33 {
    public static void main(String[] args) {
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
        long currentHour = (totalHours % 24) - 5;

        // Get the total days since January 1, 1970
        long totalDays = totalHours / 24;

        // Get Year
        // Use total days to find current year
        // by looping through years from 1970 totaling days
        // and checking if totalDays is == the range of days for that year
        boolean yearFound = false;
        int total = 0;
        int year = 1970;
        long daysLeftInYear = 0;
        while(!yearFound){
            if(isLeapYear(year))
                total += 366;
            else
                total += 365;

            if(totalDays >= total)
                year++;
            else if(total >= totalDays) {
                daysLeftInYear = total - totalDays;
                yearFound = true;
            }
        }

        // Get Month
        String month = getMonthName(daysLeftInYear, year);

        // Print out values
        System.out.printf("%1s %1d, %1d %1d:%1d:%1d", month, getDay(daysLeftInYear, year), year, currentHour, currentMinute, currentSecond);
    }

    /** Get day of month */
    public static int getDay(long daysLeftInYear, int year){
        // get day is = daysleftinyear - 1, - days in remaining months, until <= 0, * -1
        // today is november 7, so daysLeftInYear == 55
        // 55 - 1 = 54
        // 54 - 31(december days) = 23
        // 23 - 30(november days) = -7
        // -7 * -1 = 7
        // 7 is the day of the month
        daysLeftInYear--;
        int month = 12;

        while(daysLeftInYear > 0){
            switch (month){
                case 4:
                case 6:
                case 9:
                case 11:{
                    daysLeftInYear -= 30;
                    break;
                }

                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:{
                    daysLeftInYear -= 31;
                    break;
                }

                case 2:{
                    if(isLeapYear(year))
                        daysLeftInYear -= 29;
                    else
                        daysLeftInYear -= 28;
                    break;
                }
            }

            if (daysLeftInYear <= 0)
                return (int) daysLeftInYear * -1;
            month--;
        }

        return 0;
    }

    /** Convert daysLeft into month of year */
    public static String getMonthName(long daysLeftInYear, int year){
        boolean monthFound = false;
        int month = 12;
        while(!monthFound){
            switch (month) {
                case 12:
                    daysLeftInYear -= 31;
                    if (daysLeftInYear <= 0)
                        return "December";
                    break;
                case 11:
                    daysLeftInYear -= 30;
                    if (daysLeftInYear <= 0)
                        return "November";
                    break;
                case 10:
                    daysLeftInYear -= 31;
                    if (daysLeftInYear <= 0)
                        return "October";
                    break;
                case 9:
                    daysLeftInYear -= 30;
                    if (daysLeftInYear <= 0)
                        return "September";
                    break;
                case 8:
                    daysLeftInYear -= 31;
                    if (daysLeftInYear <= 0)
                        return "August";
                    break;
                case 7:
                    daysLeftInYear -= 31;
                    if (daysLeftInYear <= 0)
                        return "July";
                    break;
                case 6:
                    daysLeftInYear -= 30;
                    if (daysLeftInYear <= 0)
                        return "June";
                    break;
                case 5:
                    daysLeftInYear -= 31;
                    if (daysLeftInYear <= 0)
                        return "May";
                    break;
                case 4:
                    daysLeftInYear -= 30;
                    if (daysLeftInYear <= 0)
                        return "April";
                    break;
                case 3:
                    daysLeftInYear -= 31;
                    if (daysLeftInYear <= 0)
                        return "March";
                    break;
                case 2:
                    if(isLeapYear(year))
                        daysLeftInYear -= 29;
                    else
                        daysLeftInYear -= 28;

                    if (daysLeftInYear <= 0)
                        return "February";
                    break;
                case 1:
                    daysLeftInYear -= 31;
                    if (daysLeftInYear <= 0)
                        return "January";
                    break;
            }
            month--;
        }
        return "Month Not Found";
    }

    /** Determine if it is a leap year */
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
