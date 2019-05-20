package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 10/31/2017.

 (Number of days in a year) Write a method that returns the number of days in a
 year using the following header:

 public static int numberOfDaysInAYear(int year)

 Write a test program that displays the number of days in year from 2000 to 2020.

 */
public class Exercise_16 {
    public static void main(String[] args) {
        int totalDays = 0;
        for(int year = 2000; year <= 2020; year++){
            totalDays += numberOfDaysInAYear(year);
            System.out.println("Number of days in " + year + " is " + numberOfDaysInAYear(year));
        }

        System.out.print("total days from 2000 to 2020: " + totalDays);
    }

    // Method to calculate the number of days in a year
    public static int numberOfDaysInAYear(int year){
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            return 366;
        else
            return 365;
    }

}
