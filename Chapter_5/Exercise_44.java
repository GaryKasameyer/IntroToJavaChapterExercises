package Chapter5_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 10/22/2017.

 (Computer architecture: bit-level operations) A short value is stored in 16 bits.
 Write a program that prompts the user to enter a short integer and displays the 16
 bits for the integer. Here are sample runs:

 Enter an integer: 5
 The bits are 0000000000000101

 Enter an integer: -5
 The bits are 1111111111111011

 (Hint: You need to use the bitwise right shift operator (>>) and the bitwise AND
 operator (&), which are covered in Appendix G, Bitwise Operations.)
 */
public class Exercise_44 {
    public static void main(String[] args) {
        byte byteInteger;
        String bit = "";

        // Prompt user for bitwise integer
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        byteInteger = (byte)input.nextInt();

        // Get the current bitwise value by &ing 1
        // concatenate it to the string
        bit += byteInteger & 1;

        // Get each current bit value
        // concatenate each to string
        for(int i = 0; i < 15; i++){
            byteInteger >>= 1;
            bit += byteInteger & 1;
        }

        // Print the string backwards
        for(int i = bit.length() - 1; i >= 0; i--){
            System.out.print(bit.charAt(i));
        }
    }
}
