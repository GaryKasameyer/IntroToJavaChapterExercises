package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 9/22/2017.

 (Find the largest n such that n^3 < 12,000) Use a while loop to find the largest
 integer n such that n3 is less than 12,000.

 */
public class Exercise_13 {
    public static void main(String[] args) {
        int n = 2;

        // use while loop to increment n++
        // while n * n is < 12000
        while((n * n * n) < 12000){
            n++;
        }

        System.out.print("Smallest integer (n^3) < 12000 is " + (n - 1));
    }
}
