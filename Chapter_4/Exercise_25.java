package Chapter4_Exercises;

/**
 * Created by Gary Kasameyer on 9/20/2017.

 (Generate vehicle plate numbers) Assume a vehicle plate number consists of three
 uppercase letters followed by four digits. Write a program to generate a plate
 number.

 */
public class Exercise_25 {
    public static void main(String[] args) {
        int char1, char2, char3, digit1, digit2, digit3, digit4;

        // create random ints
        char1 = (int)(Math.random() * ((90 - 65) + 1) + 65);
        char2 = (int)(Math.random() * ((90 - 65) + 1) + 65);
        char3 = (int)(Math.random() * ((90 - 65) + 1) + 65);
        digit1 = (int)(Math.random() * ((9) + 1));
        digit2 = (int)(Math.random() * ((9) + 1));
        digit3 = (int)(Math.random() * ((9) + 1));
        digit4 = (int)(Math.random() * ((9) + 1));

        // cast ints to chars, display final result
        System.out.print("" + (char)char1 + (char)char2 + (char)char3 + digit1 + digit2 + digit3 + digit4);
    }
}
