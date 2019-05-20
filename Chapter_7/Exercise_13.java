package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/11/2017.

 (Random number chooser) Write a method that returns a random number between
 1 and 54, excluding the numbers passed in the argument. The method header is
 specified as follows:

 public static int getRandom(int... numbers)

 */
public class Exercise_13 {
    public static void main(String[] args) {
        int[] array = new int[10];

        // Prompt user to enter 10 double values
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten double values: ");
        for(int i = 0; i < array.length; i++)
            array[i] = input.nextInt();

        // Call get random and print it out
        for(int i = 0; i < 100; i++)
            System.out.print(getRandom(array) + " ");
    }

    /** Use getRandom() to get a random number that is not one of the restricted numbers passed to the method */
    public static int getRandom(int... numbers){
        int random = (int) (Math.random() * ((54 - 1) + 1) + 1);

        // Use for loop to check if random is == any prohibited element in numbers
        // if random == prohibited number, get new random and reset loop to 0
            for (int i = 0; i < numbers.length; i++) {
                if (random == numbers[i]) {
                    random = (int)(Math.random() * ((54 - 1) + 1) + 1);
                    i = 0;
                }
            }

        return random;
    }
}
