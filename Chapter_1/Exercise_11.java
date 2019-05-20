package Chapter1_Exercises;

/**
 * Created by Gary Kasameyer on 8/12/2017.

 (Population projection) The U.S. Census Bureau projects population based on the
 following assumptions:

 ■ One birth every 7 seconds
 ■ One death every 13 seconds
 ■ One new immigrant every 45 seconds

 Write a program to display the population for each of the next five years. Assume the
 current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
 integers perform division, the result is an integer. The fractional part is truncated. For
 example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
 the fractional part, one of the values involved in the division must be a number with a
 decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.

 */
public class Exercise_11 {
    public static void main(String[] args) {
        // We have 1 birth every 7 seconds, thats per year, per day, per hour, per minute,
        // so 365 * 24 * 60 * 60 / 7, or the total seconds per year / 7 = number of births
        // again we have 1 new immigrant every 45 seconds
        // so 365 * 24 * 60 * 60 / 45, total seconds / 45 = number of immigrants
        // and number of deaths / second
        // is 365 * 24 * 60 * 60 / 13, total seconds / 13 = number of deaths
        // finally, the total population is
        // current population + births + immigrants - deaths = total population
        // and multiply to get the next 5 years

        System.out.println((int)(((365 * 24 * 60 * 60 / 7.0) + (365 * 24 * 60 * 60 / 45) - (365 * 24 * 60 * 60 / 13))) + 312032486);
        System.out.println((int)(((365 * 24 * 60 * 60 / 7.0) + (365 * 24 * 60 * 60 / 45) - (365 * 24 * 60 * 60 / 13)) * 2) + 312032486);
        System.out.println((int)(((365 * 24 * 60 * 60 / 7.0) + (365 * 24 * 60 * 60 / 45) - (365 * 24 * 60 * 60 / 13)) * 3) + 312032486);
        System.out.println((int)(((365 * 24 * 60 * 60 / 7.0) + (365 * 24 * 60 * 60 / 45) - (365 * 24 * 60 * 60 / 13)) * 4) + 312032486);
        System.out.println((int)(((365 * 24 * 60 * 60 / 7.0) + (365 * 24 * 60 * 60 / 45) - (365 * 24 * 60 * 60 / 13)) * 5) + 312032486);
    }
}
