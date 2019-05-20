package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/21/2017.

 (Culture: Chinese Zodiac) Simplify Listing 3.9 using an array of strings to store
 the animal names.

 */
public class Exercise_33 {
    public static void main(String[] args) {
        String[] animals = {"monkey", "rooster", "dog", "pig", "rat", "ox",
                "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        System.out.print(animals[year % 12]);
    }
}

