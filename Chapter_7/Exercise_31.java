package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/20/2017.

 (Merge two sorted lists) Write the following method that merges two sorted lists
 into a new sorted list.

 public static int[] merge(int[] list1, int[] list2)

 Implement the method in a way that takes at most list1.length + list2.
 length comparisons. Write a test program that prompts the user to enter two
 sorted lists and displays the merged list. Here is a sample run. Note that the first
 number in the input indicates the number of the elements in the list. This number
 is not part of the list.

 Enter list1: 5 1 5 16 61 111
 Enter list2: 4 2 4 5 6
 The merged list is 1 2 4 5 5 6 16 61 111

 */
public class Exercise_31 {
    public static void main(String[] args) {
        int[] list1, list2, merged;

        // Prompt user to enter both lists
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");
        list1 = new int[input.nextInt()];
        for(int length = 0; length < list1.length; length++)
            list1[length] = input.nextInt();

        System.out.print("Enter list2: ");
        list2 = new int[input.nextInt()];
        for(int length = 0; length < list2.length; length++)
            list2[length] = input.nextInt();

        // Call merge and initialize merged[]
        merged = merge(list1, list2);

        // Print out the sorted array
        System.out.print("The merged list is ");
        for(int e: merged)
            System.out.print(e + " ");
    }

    /** Use merge to combine both list into one, then use selection sort to sort the list */
    public static int[] merge(int[] list1, int[] list2){
        // Create merged size of list1 + list2
        int[] merged = new int[(list1.length + list2.length)];

        // Use for loop to add all elements in list1 to merged
        for(int index = 0; index < list1.length; index++){
            merged[index] = list1[index];
        }

        // Use for loop to add all elements in list2 to merged
        for(int index = list1.length; index < merged.length; index++){
            merged[index] = list2[(index - list1.length)]; // index - list1.length == 0, then 1, 2 3 ....
        }

        return selectionSort(merged); // Call selectionSort to sort merged then return sorted merged
    }

    /** Use Selection sort to sort nonRepeated in ascending order */
    public static int[] selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the minimum in the list[i..list.length-1]
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            // Swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        return list;
    }
}
