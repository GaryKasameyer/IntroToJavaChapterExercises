package Chapter9_Exercises;

import java.util.GregorianCalendar;

/**
 * Created by Gary Kasameyer on 5/6/2017.

 (Use the GregorianCalendar class) Java API has the GregorianCalendar class
 in the java.util package, which you can use to obtain the year, month, and day of a
 date. The no-arg constructor constructs an instance for the current date, and the methods
 get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH),
 and get(GregorianCalendar.DAY_OF_MONTH) return the year, month, and day.
 Write a program to perform two tasks:

 ■ Display the current year, month, and day.
 ■ The GregorianCalendar class has the setTimeInMillis(long), which
 can be used to set a specified elapsed time since January 1, 1970. Set the value
 to 1234567898765L and display the year, month, and day.

 */
public class Exercise_05 {
    public static void main(String[] args) {
        GregorianCalendar greg = new GregorianCalendar();

        System.out.println("Current Year: " + greg.get(greg.YEAR));
        System.out.println("Current Month: " + greg.get(greg.MONTH));
        System.out.println("Current Day of Month: " + greg.get(greg.DAY_OF_MONTH));

        greg.setTimeInMillis(1234567898765L);
        System.out.println("\nCurrent Year: " + greg.get(greg.YEAR));
        System.out.println("Current Month: " + greg.get(greg.MONTH));
        System.out.println("Current Day of Month: " + greg.get(greg.DAY_OF_MONTH));
    }
}
