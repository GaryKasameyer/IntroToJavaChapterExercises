package Chapter4_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 9/20/2017.

 (Order three cities) Write a program that prompts the user to enter three cities and
 displays them in ascending order. Here is a sample run:

 Enter the first city: Chicago
 Enter the second city: Los Angeles
 Enter the third city: Atlanta
 The three cities in alphabetical order are Atlanta Chicago Los Angeles

 */
public class Exercise_24 {
    public static void main(String[] args) {
        String city1, city2, city3, largest, middle, smallest;

        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        city3 = input.nextLine();

        // Compare cities using chars
        if(city1.charAt(0) > city2.charAt(0)){
            if(city1.charAt(0) > city3.charAt(0)){
                largest = city1;
                if(city2.charAt(0) > city3.charAt(0)){
                    middle = city2;
                    smallest = city3;
                }else{
                    middle = city3;
                    smallest = city2;
                }
            }else if(city2.charAt(0) > city3.charAt(0)){
                largest = city1;
                middle = city2;
                smallest = city3;
            }else{
                largest = city1;
                middle = city3;
                smallest = city2;
            }
        }else if(city1.charAt(0) > city3.charAt(0)){
            largest = city2;
            middle = city1;
            smallest = city3;
        }else{
            largest = city2;
            middle = city3;
            smallest = city1;
        }

        System.out.print("The three cities in alphabetical order are " + smallest + " " + middle + " " + largest);
    }
}
