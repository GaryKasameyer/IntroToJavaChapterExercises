package Chapter7_Exercises;

/**
 * Created by Gary Kasameyer on 11/10/2017.

 (Count single digits) Write a program that generates 100 random integers between
 0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
 say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)

 */
public class Exercise_07 {
    public static void main(String[] args) {
        int[] count = new int[10];
        int random;

        // Use for loop to generate 100 single digits
        // and add them to count array
        for(int i = 0; i < 100; i++){
            random = (int)(Math.random() * 10);
            count[random]++;
        }

        // Print out the count values
        for(int i = 0; i < count.length; i++)
            System.out.printf("%1ds: %1d\n", i, count[i]);
    }
}
