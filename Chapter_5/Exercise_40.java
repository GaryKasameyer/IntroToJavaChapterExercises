package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 10/21/2017.

 (Simulation: heads or tails) Write a program that simulates flipping a coin one
 million times and displays the number of heads and tails.

 */
public class Exercise_40 {
    public static void main(String[] args) {
        int heads = 0, tails = 0, toss;

        // Use for loop to determine
        for(int i = 0; i < 1000000; i++){
            toss = (int)(Math.random() * 2);

            if(toss == 0)
                tails++;
            else
                heads++;
        }

        // Print out the final result
        System.out.printf("Number of heads:%1d tails:%1d", heads, tails);
    }
}
