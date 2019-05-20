package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 11/1/2017.

 (Display current date and time) Listing 2.7, ShowCurrentTime.java, displays the
 current time. Improve this example to display the current date and time. The calendar
 example in Listing 6.12, PrintCalendar.java, should give you some ideas on
 how to find the year, month, and day.

 */
public class Exercise_24 {
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
        long currentHour = totalHours % 24;

        // Get the actual day
        long totalDays = totalHours / 24;

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

            if(totalDays > total)
                year++;
            else if(total > totalDays) {
                daysLeftInYear = total - totalDays;
                yearFound = true;
            }
        }

        // Display results
        System.out.println("Current time is " + (currentHour - 5)+ ":" + currentMinute + ":" + currentSecond + " EST");
        System.out.printf("%1d/%1d/%1d", getMonth(daysLeftInYear, year), getDay(daysLeftInYear, year), year);

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
    public static int getMonth(long daysLeftInYear, int year){
        boolean monthFound = false;
        int month = 12;
        while(!monthFound){
            switch (month) {
                case 12:
                    daysLeftInYear -= 31;
                    if (daysLeftInYear <= 0)
                        return 12;
                    break;
                case 11:
                    daysLeftInYear -= 30;
                    if (daysLeftInYear <= 0)
                        return 11;
                    break;
                case 10:
                    daysLeftInYear -= 31;
                    if (daysLeftInYear <= 0)
                        return 10;
                    break;
                case 9:
                    daysLeftInYear -= 30;
                    if (daysLeftInYear <= 0)
                        return 9;
                    break;
                case 8:
                    daysLeftInYear -= 31;
                    if (daysLeftInYear <= 0)
                        return 8;
                    break;
                case 7:
                    daysLeftInYear -= 31;
                    if (daysLeftInYear <= 0)
                        return 7;
                    break;
                case 6:
                    daysLeftInYear -= 30;
                    if (daysLeftInYear <= 0)
                        return 6;
                    break;
                case 5:
                    daysLeftInYear -= 31;
                    if (daysLeftInYear <= 0)
                        return 5;
                    break;
                case 4:
                    daysLeftInYear -= 30;
                    if (daysLeftInYear <= 0)
                        return 4;
                    break;
                case 3:
                    daysLeftInYear -= 31;
                    if (daysLeftInYear <= 0)
                        return 3;
                    break;
                case 2:
                    if(isLeapYear(year))
                        daysLeftInYear -= 29;
                    else
                        daysLeftInYear -= 28;

                    if (daysLeftInYear <= 0)
                        return 2;
                    break;
                case 1:
                    daysLeftInYear -= 31;
                    if (daysLeftInYear <= 0)
                        return 1;
                    break;
            }
            month--;
        }
        return 0;
    }

    /** Determine if it is a leap year */
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
