package Chapter9_Exercises;

import java.util.Date;

/**
 * Created by Gary Kasameyer on 5/6/2017.

 (Use the Date class) Write a program that creates a Date object, sets its elapsed
 time to 10,000, 100,000, 1,000,000, 10,000,000, 100,000,000, 1,000,000,000,
 10,000,000,000, and 100,000,000,000, and displays the date and time using the
 toString() method, respectively.

 */
public class Exercise_03 {
    static long time;
    public static void main(String[] args) {
        time = 10000;

        Date Ex3 = new Date(time);
        System.out.println("Date 10000: " + Ex3.toString());

        time *= 10;
        Ex3.setTime(time);
        System.out.println("Date 100000: " + Ex3.toString());

        time *= 10;
        Ex3.setTime(time);
        System.out.println("Date 1000000: " + Ex3.toString());

        time *= 10;
        Ex3.setTime(time);
        System.out.println("Date 10000000: " + Ex3.toString());

        time *= 10;
        Ex3.setTime(time);
        System.out.println("Date 100000000: " + Ex3.toString());

        time *= 10;
        Ex3.setTime(time);
        System.out.println("Date 1000000000: " + Ex3.toString());

        time *= 10;
        Ex3.setTime(time);
        System.out.println("Date 10000000000: " + Ex3.toString());

        time *= 10;
        Ex3.setTime(time);
        System.out.println("Date 100000000000: " + Ex3.toString());

        /*long time = 10000;
        for(int i = 0; i < 8; i++, time *= 10){
            Date date = new Date(time);
            System.out.println(date.toString());
        }*/
    }
}
