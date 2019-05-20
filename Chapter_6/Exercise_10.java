package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 10/30/2017.

 (Use the isPrime Method) Listing 6.7, PrimeNumberMethod.java, provides the
 isPrime(int number) method for testing whether a number is prime. Use this
 method to find the number of prime numbers less than 10000.

 */
public class Exercise_10 {
    public static void main(String[] args) {
        int primeNumberCount = 0;
        for(int i = 1; i < 10000; i++){
            if(isPrime(i))
                primeNumberCount++;
        }

        System.out.print(primeNumberCount);
    }

    /** Use boolean to determine if a number is prime */
    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }
        return true; // Number is prime
    }
}
