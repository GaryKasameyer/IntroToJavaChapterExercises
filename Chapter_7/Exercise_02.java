package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/9/2017.

 (Reverse the numbers entered) Write a program that reads ten integers and displays
 them in the reverse of the order in which they were read.

 */
public class Exercise_02 {
    public static void main(String[] args) {
        int[] numbersEntered = getNumbersEntered();

        printReverse(numbersEntered);
    }

    /** Create a int[10] and populate it with user input */
    public static int[] getNumbersEntered(){
        int[] numbersEntered = new int[10];

        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        for(int i = 0; i < numbersEntered.length; i++)
            numbersEntered[i] = input.nextInt();

        return numbersEntered;
    }

    /** Print out the reverse of the numbersEntered[] */
    public static void printReverse(int[] numbersEntered){
        for(int i = numbersEntered.length - 1; i >= 0; i--)
            System.out.print(numbersEntered[i] + " ");
    }
}
