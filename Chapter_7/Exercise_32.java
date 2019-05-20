package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/21/2017.

 (Partition of a list) Write the following method that partitions the list using the
 first element, called a pivot.

 public static int partition(int[] list)

 After the partition, the elements in the list are rearranged so that all the elements
 before the pivot are less than or equal to the pivot and the elements after the pivot
 are greater than the pivot. The method returns the index where the pivot is located
 in the new list. For example, suppose the list is {5, 2, 9, 3, 6, 8}. After the partition,
 the list becomes {3, 2, 5, 9, 6, 8}. Implement the method in a way that takes
 at most list.length comparisons. Write a test program that prompts the user
 to enter a list and displays the list after the partition. Here is a sample run. Note
 that the first number in the input indicates the number of the elements in the list.
 This number is not part of the list.

 Enter list: 8 10 1 5 16 61 9 11 1
 After the partition, the list is 9 1 5 1 10 61 11 16

 */
public class Exercise_32 {
    public static void main(String[] args) {
        int[] list;

        // Prompt user to enter list
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        list = new int[input.nextInt()];
        for(int index = 0; index < list.length; index++)
            list[index] = input.nextInt();

        // Call partition to rearrange the [] and give the location of the pivot after partition
        partition(list);

        // Print out the partitioned list
        System.out.print("After the partition, the list is ");
        for(int e: list)
            System.out.print(e + " ");
    }

    /** Use partition to sort the list */
    public static int partition(int[] list){
        int[] newList = new int[list.length];
        int partition = list[0];
        int left = 0, right = list.length - 1;

        for(int index = 0; index < list.length; index++){
            if(list[index] < partition)
                newList[left++] = list[index];
            else if(list[index] > partition)
                newList[right--] = list[index];
        }

        newList[newList.length - right] = partition;

        for(int index = 0; index < list.length; index++)
            list[index] = newList[index];

        return newList.length - right;
    }
}
