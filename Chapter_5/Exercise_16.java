package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/22/2017.

 (Find the factors of an integer) Write a program that reads an integer and displays
 all its smallest factors in increasing order. For example, if the input integer is
 120, the output should be as follows: 2, 2, 2, 3, 5.

 */
public class Exercise_16 {
    public static void main(String[] args) {
        int integer, divisor = 2;
        String factors = "";

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        integer = input.nextInt();

        // use while loop, ifs, and % to
        while(integer > 1){
            if(integer % divisor == 0){
                integer /= divisor;
                factors += divisor + ", ";
            }else
                divisor++;
        }

        // Print the factors
        System.out.print("" + factors);
    }
}
