package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 11/1/2017.

 (Math: approximate the square root) There are several techniques for implementing
 the sqrt method in the Math class. One such technique is known as the
 Babylonian method. It approximates the square root of a number, n, by repeatedly
 performing a calculation using the following formula:

 nextGuess = (lastGuess + n / lastGuess) / 2

 When nextGuess and lastGuess are almost identical, nextGuess is the
 approximated square root. The initial guess can be any positive value (e.g., 1).
 This value will be the starting value for lastGuess. If the difference between
 nextGuess and lastGuess is less than a very small number, such as 0.0001,
 you can claim that nextGuess is the approximated square root of n. If not, next-
 Guess becomes lastGuess and the approximation process continues. Implement
 the following method that returns the square root of n.

 public static double sqrt(long n)

 */
public class Exercise_22 {
    public static void main(String[] args) {
        long n = 20;

        // Use sqrt method to find sqrt of n
        System.out.printf("%1.6f", sqrt(20));
    }

    // Use sqrt to find sqrt by looping though guesses
    public static double sqrt(long n){
        double nextGuess, lastGuess = 2, sqrt = 0;

        // Use for loop to make guesses to find sqrt value
        for(int i = 2; i < n / 2; i++){
            nextGuess = (lastGuess + n / lastGuess) / 2;

            if(nextGuess * 100 == lastGuess * 100)
                sqrt = nextGuess;

            lastGuess = nextGuess;
        }

        return sqrt;
    }
}























