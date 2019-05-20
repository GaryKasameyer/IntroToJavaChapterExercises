package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/27/2017.

 (Statistics: compute mean and standard deviation) In business applications, you
 are often asked to compute the mean and standard deviation of data. The mean is
 simply the average of the numbers. The standard deviation is a statistic that tells
 you how tightly all the various data are clustered around the mean in a set of data.

 For example, what is the average age of the students in a class? How close are the
 ages? If all the students are the same age, the deviation is 0.

 Write a program that prompts the user to enter ten numbers, and displays the
 mean and standard deviations of these numbers using the following formula:

 mean =
 a
 n
 i = 1
 xi
 n =
 x1 + x2 + g + xn
 n
 deviation = c
 a
 n
 i = 1
 x2i
 -
 ¢a
 n
 i = 1
 xi≤
 2
 n
 n - 1
 Here is a sample run:

 mean = all numbers added up / total number of elements added together

 standardDeviation = Math.sqrt((Math.pow(((each number - mean)), 2) / total number added together))

 */
public class Exercise_45 {
    public static void main(String[] args) {
        double mean, squareTotal = 0, standardDeviation, numberOne, numberTwo, numberThree, numberFour,
        numberFive, numberSix, numberSeven, numberEight, numberNine, numberTen;

        // Prompt user to enter ten numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        // assign inputs to variables
        numberOne = input.nextDouble();
        numberTwo = input.nextDouble();
        numberThree = input.nextDouble();
        numberFour = input.nextDouble();
        numberFive = input.nextDouble();
        numberSix = input.nextDouble();
        numberSeven = input.nextDouble();
        numberEight = input.nextDouble();
        numberNine = input.nextDouble();
        numberTen = input.nextDouble();

        // add up the numbers
        mean = (numberOne + numberTwo + numberThree + numberFour+ numberFive+ numberSix+ numberSeven+ numberEight + numberNine + numberTen) / 10.0;

        squareTotal += Math.pow((numberOne - mean), 2);
        squareTotal += Math.pow((numberTwo - mean), 2);
        squareTotal += Math.pow((numberThree - mean), 2);
        squareTotal += Math.pow((numberFour - mean), 2);
        squareTotal += Math.pow((numberFive - mean), 2);
        squareTotal += Math.pow((numberSix - mean), 2);
        squareTotal += Math.pow((numberSeven - mean), 2);
        squareTotal += Math.pow((numberEight - mean), 2);
        squareTotal += Math.pow((numberNine - mean), 2);
        squareTotal += Math.pow((numberTen - mean), 2);

        // calculate the standard deviation
        standardDeviation = Math.sqrt(squareTotal / 9.0);

        // Print out final values
        System.out.printf("Mean: %1.2f\nStandard Deviation: %1.1f", mean, standardDeviation);
    }
}




















