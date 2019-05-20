package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/22/2017.

 (Display pyramid) Write a program that prompts the user to enter an integer from
 1 to 15 and displays a pyramid, as shown in the following sample run:

 Enter the number of lines: 7
             1
           2 1 2
         3 2 1 2 3
       4 3 2 1 2 3 4
     5 4 3 2 1 2 3 4 5
   6 5 4 3 2 1 2 3 4 5 6
 7 6 5 4 3 2 1 2 3 4 5 6 7

 */
public class Exercise_17 {
    public static void main(String[] args) {
        int lines;

        // Prompt user for number of line
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        lines = input.nextInt();

        // Use lines to count each row
        // then use for loops to add specified number of spaces
        // then add the numbers (row)
        for(int row = 1; row <= lines; row++){
            // use for loops to add spaces
            for(int spaces = 0; spaces < lines - row; spaces++){
                System.out.print("  ");
            }

            // Then print the descendingNumbers
            for(int descendingNumbers = row; descendingNumbers > 0; descendingNumbers--){
                System.out.print(descendingNumbers + " ");
            }

            // Then print the ascendingNumbers
            for(int ascendingNumbers = 2; ascendingNumbers < row + 1; ascendingNumbers++){
                System.out.print(ascendingNumbers + " ");
            }

            // Move to next row
            System.out.println();
        }

    }
}
