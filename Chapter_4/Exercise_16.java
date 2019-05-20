package Chapter4_Exercises;

/**
 * Created by Gary Kasameyer on 9/19/2017.

 (Random character) Write a program that displays a random uppercase letter
 using the Math.random() method.

 */
public class Exercise_16 {
    public static void main(String[] args) {
        int random =  (int)(Math.random() * ((90 - 65) + 1) + 65);
        char letter = (char)random;

        System.out.print("The random letter is " + letter);
    }
}
