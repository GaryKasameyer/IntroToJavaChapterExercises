package Chapter3_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/1/2017.

 (Cost of shipping) A shipping company uses the following function to calculate
 the cost (in dollars) of shipping based on the weight of the package (in
 pounds).

 c(w) = d
 3.5, if 0 6 w 6 = 1
 5.5, if 1 6 w 6 = 3
 8.5, if 3 6 w 6 = 10
 10.5, if 10 6 w 6 = 20

 Write a program that prompts the user to enter the weight of the package and
 display the shipping cost. If the weight is greater than 50, display a message “the
 package cannot be shipped.”

 */
public class Exercise_18 {
    public static void main(String[] args) {
        int weight;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of the package: ");
        weight = input.nextInt();

        // perform the calculation
        if(weight > 50)
            System.out.print("The package cannot be shipped");
        else if(weight > 0 && weight <= 1)
            System.out.print("The shipping cost is $3.50");
        else if(weight > 1 && weight <= 3)
            System.out.print("The shipping cost is $5.50");
        else if(weight > 3 && weight <= 10)
            System.out.print("The shipping cost is $8.50");
        else if(weight > 10 && weight <= 20)
            System.out.print("The shipping cost is $3.50");
    }
}
