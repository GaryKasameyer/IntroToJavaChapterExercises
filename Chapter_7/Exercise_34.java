package Chapter7_Exercises;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/21/2017.

 (Sort characters in a string) Write a method that returns a sorted string using the
 following header:

 public static String sort(String s)

 For example, sort("acb") returns abc.
 Write a test program that prompts the user to enter a string and displays the sorted
 string.

 */
public class Exercise_34 {
    public static void main(String[] args) {
        String s;

        // Prompt user to enter string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        s = input.nextLine();

        System.out.print(sort(s));

    }

    /** Use sort to write a new string with charAt(s) */
    public static String sort(String s){
        char[] charTemp = new char[s.length()];
        String temp = "";

        // Convert string s to a char array
        for(int index = 0; index < s.length(); index++){
            charTemp[index] = s.charAt(index);
        }

        // Loop through charTemp and check each index, if next element > previous element swap them
        for(int index = 1; index < charTemp.length; index++){
            if(charTemp[index - 1] > charTemp[index])
                swap(charTemp, index - 1, index);
        }

        // Loop through charTemp[] and concat elements into string
        for(char e: charTemp)
            temp += e;

        return temp;
    }

    /** Use swap to switch positions of two elements */
    public static void swap(char[] list, int i, int j){
        // Swap list[i] with list[j]
        char temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
}






















