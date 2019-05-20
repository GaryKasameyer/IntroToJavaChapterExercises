package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 9/30/2017.

 (Demonstrate cancellation errors) A cancellation error occurs when you are
 manipulating a very large number with a very small number. The large number
 may cancel out the smaller number. For example, the result of 100000000.0 +
 0.000000001 is equal to 100000000.0. To avoid cancellation errors and obtain
 more accurate results, carefully select the order of computation. For example, in
 computing the following series, you will obtain more accurate results by computing
 from right to left rather than from left to right:

 1 + 1/2 + 1/3 + ... + 1/n

 Write a program that compares the results of the summation of the preceding
 series, computing from left to right and from right to left with n = 50000.

 */
public class Exercise_23 {
    public static void main(String[] args) {
        double sumLeftToRight = 0, sumRightToLeft = 0;
        // Add numbers from left to right
        for(int n = 1; n <= 50000; n++){
            sumLeftToRight += 1.0 / n;
        }
        System.out.println("total from left to right: " + sumLeftToRight);

        // Add numbers from right to left
        for(int n = 50000; n > 0; n--){
            sumRightToLeft += 1.0 / n;
        }
        System.out.println("total from right to left: " + sumRightToLeft);

        // difference of two numbers
        System.out.print("The difference is " + (sumRightToLeft - sumLeftToRight));
    }
}
