package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 8/27/2017.

 (Sort three integers) Write a program that prompts the user to enter three integers
 and display the integers in non-decreasing order.

 */
public class Exercise_08 {
    public static void main(String[] args) {
        int num1, num2, num3, max, mid, min;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        // Determine largest, middle, and smallest
        if(num1 < num2){
            if(num1 < num3){
                min = num1;
                if(num2 < num3){
                    mid = num2;
                    max = num3;
                } else{
                    mid = num3;
                    max = num2;
                }
            }else{
                mid = num1;
                if(num2 < num3){
                    min = num2;
                    max = num3;
                }else{
                    min = num3;
                    max = num2;
                }
            }
        }else{
            if(num2 < num3){
                max = num3;
                if(num1 < num3){
                    min = num1;
                    mid = num2;
                }else{
                    min = num2;
                    mid = num1;
                }
            }else{
                min = num1;
                mid = num2;
                max = num3;
            }
        }

        System.out.print("smallest " + min + " middle " + mid + " largest " + max);
    }
}
