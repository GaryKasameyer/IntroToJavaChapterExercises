package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/9/2017.

 (Financial: compare costs) Suppose you shop for rice in two different packages.
 You would like to write a program to compare the cost. The program prompts the
 user to enter the weight and price of the each package and displays the one with
 the better price. Here is a sample run:

 */
public class Exercise_33 {
    public static void main(String[] args) {
        double p1_Weight, p2_Weight, p1_Price, p2_Price, p1_PricePerPound, p2_PricePerPound;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight and price for package 1: ");
        p1_Weight = input.nextDouble();
        p1_Price = input.nextDouble();

        System.out.print("Enter the weight and price for package 2: ");
        p2_Weight = input.nextDouble();
        p2_Price = input.nextDouble();

        // Divide the price by the weight
        p1_PricePerPound = p1_Price / p1_Weight;
        p2_PricePerPound = p2_Price / p2_Weight;

        // determine lowest value and display it as best
        if(p1_PricePerPound > p2_PricePerPound)
            System.out.print("Package 2 has a better price.");
        else if(p1_PricePerPound < p2_PricePerPound)
            System.out.print("Package 1 has a better price.");
        else
            System.out.print("Two packages have the same price.");
    }
}
