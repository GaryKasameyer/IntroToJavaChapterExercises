package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/27/2017.

 (Business: check ISBN-13) ISBN-13 is a new standard for indentifying books. It
 uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
 which is calculated from the other digits using the following formula:

 10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10

 If the checksum is 10, replace it with 0. Your program should read the input as a
 string. Here are sample runs:

 Enter the first 12 digits of an ISBN-13 as a string: 978013213080
 The ISBN-13 number is 9780132130806

 Enter the first 12 digits of an ISBN-13 as a string: 978013213079
 The ISBN-13 number is 9780132130790

 Enter the first 12 digits of an ISBN-13 as a string: 97801320
 97801320 is an invalid input

 */
public class Exercise_47 {
    public static void main(String[] args) {
        int checkSum = 0;
        String isbn;

        // Prompt user for isbn
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        isbn = input.next();

        // loop through string add each int with (int)chatAt() - 48(int value of char 1 is 49 so 49 - 48 = 1)
        // use if/else to multiply,
        for(int i = 1; i < 13; i++){
            if(i % 2 == 0)
                checkSum += ((int)isbn.charAt(i - 1) - 48) * 3;
            else
                checkSum += ((int)isbn.charAt(i - 1) - 48);
        }

        // Complete the checksum calculation
        checkSum = 10 - (checkSum % 10);

        // use if statement to check checksum
        if(checkSum == 10)
            isbn += "0";
        else
            isbn += checkSum;

        // Print the result
        System.out.println("checksum is " + checkSum);
        System.out.print("The ISBN-13 number is " + isbn);
    }
}
