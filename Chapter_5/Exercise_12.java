package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 9/22/2017.

 (Find the smallest n such that n^2 > 12,000) Use a while loop to find the smallest
 integer n such that n2 is greater than 12,000.

 */
public class Exercise_12 {
    public static void main(String[] args) {
        int n = 2;

        // use while loop to increment n++
        // while n * n is < 12000
        while((n * n) < 12000){
            n++;
        }

        System.out.print("Smallest integer (n^2) > 12000 is " + (n - 1));
    }
}
