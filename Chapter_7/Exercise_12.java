package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/11/2017.

 (Reverse an array) The reverse method in Section 7.7 reverses an array by
 copying it to a new array. Rewrite the method that reverses the array passed in
 the argument and returns this array. Write a test program that prompts the user to
 enter ten numbers, invokes the method to reverse the numbers, and displays the
 numbers.

 // Swap list[i] with list[j]
 int temp = list[i];
 list[i] = list[j];
 list[j] = temp;

 */
public class Exercise_12 {
    public static void main(String[] args) {
        int[] array = new int[10];

        // Prompt user to enter 10 double values
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten double values: ");
        for(int i = 0; i < array.length; i++)
            array[i] = input.nextInt();

        // Call reverse(int[]) and redefine the int[] array
        array = reverse(array);

        // Print out the original array
        for(int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static int[] reverse(int[] list) {
        // Reverse the array passed to the reverse method without copying to a different array
        for(int i = list.length - 1, j = 0; i >= list.length / 2; i--, j++) {
            // Swap list[i] with list[j]
            int temp = list[i];
            list[i] = list[j];
            list[j] = temp;
        }

        return list;
    }
}
