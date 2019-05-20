package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/12/2017.

 (Sorted?) Write the following method that returns true if the list is already sorted
 in increasing order.

 public static boolean isSorted(int[] list)

 Write a test program that prompts the user to enter a list and displays whether
 the list is sorted or not. Here is a sample run. Note that the first number in the
 input indicates the number of the elements in the list. This number is not part
 of the list.

 Enter list: 8 10 1 5 16 61 9 11 1
 The list is not sorted

 Enter list: 10 1 1 3 4 4 5 7 9 11 21
 The list is already sorted

 */
public class Exercise_19 {
    public static void main(String[] args) {

        // Prompt user to enter 10 double values
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int[] array = new int[input.nextInt()];

        // Populate the array
        for(int i = 0; i < array.length; i++)
            array[i] = input.nextInt();

        // call isSorted and print the result
        if(isSorted(array))
            System.out.print("The list is already sorted.");
        else
            System.out.print("The list is not sorted.");
    }

    /** int[] is sorted if each element is > the element before it*/
    public static boolean isSorted(int[] list){
        for(int i = 2; i < list[0]; i++){
            if(list[i] < list[i - 1])
                return false;
        }
        return true;
    }
}
