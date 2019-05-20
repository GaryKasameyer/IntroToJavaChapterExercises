package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/19/2017.

 (Strictly identical arrays) The arrays list1 and list2 are strictly identical
 if their corresponding elements are equal. Write a method that returns true if
 list1 and list2 are strictly identical, using the following header:

 public static boolean equals(int[] list1, int[] list2)

 Write a test program that prompts the user to enter two lists of integers and displays
 whether the two are strictly identical. Here are the sample runs. Note that
 the first number in the input indicates the number of the elements in the list. This
 number is not part of the list.

 Enter list1: 5 2 5 6 1 6
 Enter list2: 5 2 5 6 1 6
 Two lists are strictly identical

 Enter list1: 5 2 5 6 6 1
 Enter list2: 5 2 5 6 1 6
 Two lists are not strictly identical

 */
public class Exercise_26 {
    public static void main(String[] args) {
        int[] list1, list2;

        // Prompt user to enter list1, index 0 is length of list1, then populate array
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        list1 = new int[input.nextInt()];

        // Populate the array
        for(int i = 0; i < list1.length; i++)
            list1[i] = input.nextInt();

        // Prompt user to enter list2, index 0 is length of list1, then populate array
        System.out.print("Enter list2: ");
        list2 = new int[input.nextInt()];

        // Populate the array
        for(int i = 0; i < list2.length; i++)
            list2[i] = input.nextInt();

        // Call equals and print out the corresponding result
        System.out.print((equals(list1, list2)) ? "Two lists are strictly identical" : "Two lists are not strictly identical");
    }

    /** Return true if index of each list is == each other, if any index != otherIndex return false */
    public static boolean equals(int[] list1, int[] list2){
        for(int index = 0; index < list1.length; index++){
            if(list1[index] != list2[index])
                return false;
        }

        return true;
    }
}
