package Chapter7_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 11/12/2017.

 (Game: bean machine) The bean machine, also known as a quincunx or the Galton
 box, is a device for statistics experiments named after English scientist Sir
 Francis Galton. It consists of an upright board with evenly spaced nails (or pegs)
 in a triangular form, as shown in Figure 7.13.

 FIGURE 7.13 Each ball takes a random path and falls into a slot.

 Balls are dropped from the opening of the board. Every time a ball hits a nail, it
 has a 50% chance of falling to the left or to the right. The piles of balls are accumulated
 in the slots at the bottom of the board.
 Write a program that simulates the bean machine. Your program should prompt
 the user to enter the number of the balls and the number of the slots in the machine.
 Simulate the falling of each ball by printing its path. For example, the path for
 the ball in Figure 7.13b is LLRRLLR and the path for the ball in Figure 7.13c is
 RLRRLRR. Display the final buildup of the balls in the slots in a histogram. Here
 is a sample run of the program:

 Enter the number of balls to drop: 5
 Enter the number of slots in the bean machine: 8
 LRLRLRR
 RRLLLRR
 LLRLLRR
 RRLLLLL
 LRLRRLR

   O
   O
 OOO

 (Hint: Create an array named slots. Each element in slots stores the number
 of balls in a slot. Each ball falls into a slot via a path. The number of Rs in
 a path is the position of the slot where the ball falls. For example, for the path
 LRLRLRR, the ball falls into slots[4], and for the path is RRLLLLL, the ball
 falls into slots[2].)

 */
public class Exercise_21 {
    public static void main(String[] args) {
        int numberOfBalls, numberOfSlots;

        // Prompt user to enter number of balls to drop
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        numberOfBalls = input.nextInt();

        System.out.print("Enter the number of slots in the bean machine: ");
        numberOfSlots = input.nextInt();

        // Create slots[]
        int[] slots = new int[numberOfSlots];

        // Call computePath
        System.out.println();
        computePath(slots, numberOfBalls);

        // Call printPath
        printPath(slots);
    }

    /** Use computePath to create the slots[] values for the number of beads that land in each spot */
    public static void computePath(int[] slots, int numberOfBalls){
        int middle = 0;
        int landing = middle, temp;

        // Use nested for loops to calculate the landing point of the ball
        for(int ball = 0; ball < numberOfBalls; ball++){
            for(int numberOfSlots = 0; numberOfSlots < slots.length - 1; numberOfSlots++){
                // Use random() to generate 1's and 0's
                temp = (int)(Math.random() * 2);
                // if temp is 1, add it to landing
                // meaning it goes right, else, it doesnt go right, meaning left
                if(temp == 1)
                    landing++;
                // Print out the letter of the path like the example
                System.out.print((temp == 1) ? "R" : "L");
            }
            // increase value of slots at index of landing
            slots[landing]++;

            // Reset the landing to 0
            landing = middle;

            // Start new line to show next ball path
            System.out.println();
        }
    }

    /** Use printPath to print out the bead landings in each slot */
    public static void printPath(int[] slots){
        // To print the landings of each ball use loop to go through slots and find the largest
        // then Create String[], to hold spaces or 0's for balls
        // create a string[] for each level to be printed
        // and print the string[] in order
        int largest = slots[0];
        for(int i = 1; i < slots.length; i++) {
            if (slots[i] > largest) {
                largest = slots[i];
            }
        }

        // Create temp[] to hold each layer
        int[] temp = new int[slots.length];

        // Use largestIndex to limit nested for loop
        for(int numberOfRows = largest; numberOfRows > 0; numberOfRows--){
            // Use temp int[] to hold 0's for largest value positions, so fill with 1's
            for(int e = 0; e < temp.length; e++)
                temp[e] = 1;
            // Loop through slots and if slots[slot] is == largest, mark temp[slot] as 0
            // leaving the rest as 1's
            // then largest--, to do the same with the next number
            for(int slot = 0; slot < slots.length; slot++){
                if(slots[slot] == largest) {
                    temp[slot] = 0;
                    slots[slot]--;
                }
            }
            System.out.println();
            // Now loop through temp and print 1's as " " and 0's as 0
            for(int i = 0; i < temp.length; i++){
                System.out.print((temp[i] == 1) ? " " : "0");
            }
            // Lower largest to print out next line
            largest--;
        }
    }
}


































