package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 5/20/2017.

 (Game: nine heads and tails) Nine coins are placed in a 3-by-3 matrix with some
 face up and some face down. You can represent the state of the coins using a
 3-by-3 matrix with values 0 (heads) and 1 (tails). Here are some examples:

 0 0 0   1 0 1   1 1 0   1 0 1   1 0 0
 0 1 0   0 0 1   1 0 0   1 1 0   1 1 1
 0 0 0   1 0 0   0 0 1   1 0 0   1 1 0

 Each state can also be represented using a binary number. For example, the preceding
 matrices correspond to the numbers

 000010000 101001100 110100001 101110100 100111110

 There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2, 3,
 . . . , and 511 to represent all states of the matrix. Write a program that prompts
 the user to enter a number between 0 and 511 and displays the corresponding
 matrix with the characters H and T. Here is a sample run:

 Enter a number between 0 and 511: 7
 H H H
 H H H
 T T T

 The user entered 7, which corresponds to 000000111. Since 0 stands for H and
 1 for T, the output is correct.

 */
public class Exercise_11 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int number;

        // Prompt user for variable input
        System.out.print("Enter a number between 0 and 511: ");
        number = input.nextInt();

        // Call createBinaryVersion and
        // it will create a 3x3 binary version of the number entered
        // and print it
        createBinaryVersion(number);
    }

    /** Use createBinaryVersion to convert a number to the binary form in a byte[3][3] */
    public static void createBinaryVersion(int number){
        int index = 0;
        int[][] binaryVersion = new int[3][3];
        String binaryString = createBinaryString(number), binaryStringLength;

        // Use while loop to create a binaryString with binary value of number
        // by creating a new string binaryStringLength and
        // putting 0's at the beginning, then each character in binaryString
        while(binaryString.length() != 9){
            binaryStringLength = new String();
            binaryStringLength += "0";
            for(int i = 0; i < binaryString.length(); i++) {
                binaryStringLength += binaryString.charAt(i);
            }
            binaryString = binaryStringLength;
        }

        // Assign the int value of each char in binaryString - 48 (the int value of '0')
        for(int i = 0; i < binaryVersion.length; i++){
            for(int j = 0; j < binaryVersion[i].length; j++, index++){
                binaryVersion[i][j] = binaryString.charAt(index) - 48;
            }
        }

        // Print the binaryVersion[3][3]
        printBinaryVersion(binaryVersion);
    }

    /** Use createBinaryString to return a String of binary value of number */
    public static String createBinaryString(int number){
        String binary = new String();
        int binaryValue = (int)Math.pow(2, 8);

        // Use for loop to check if a number is >= binaryValue (256, 128, 64, ....)
        // if it is, concat 1 and reduce number otherwise concat 0
        for(int i = 0; i < 9; i++, binaryValue /= 2){
            if(number >= binaryValue){
                binary += 1;
                number -= binaryValue;
            }else
                binary += 0;
        }

        return binary;
    }

    /** Use printBinaryVersion to print out the byte[][] version of the number entered */
    public static void printBinaryVersion(int[][] binaryVersion){
        for (int i = 0; i < binaryVersion.length; i++) {
            for (int j = 0; j < binaryVersion[i].length; j++) {
                System.out.print(binaryVersion[i][j] == 0 ? "H " : "T ");
            }
            if(i == 0 || i == 1)
                System.out.println();
        }
    }
}
