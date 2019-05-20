package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 11/2/2017.

 (Mersenne prime) A prime number is called a Mersenne prime if it can be written
 in the form (2^p) - 1 for some positive integer p. Write a program that finds all
 Mersenne primes with p … 31 and displays the output as follows:

 p      (2^p) – 1
 -----------------
 2      3
 3      7
 5      31
 ...

 */
public class Exercise_28 {
    public static void main(String[] args) {
        int mersennePrimeCount = 0, numbers = 2;

        // Print headers
        System.out.print("P\t\t(2^P) - 1\n-----------------");

        // Use While loop to move through numbers
        // and check if !isPalindrome && reverse(isPrime)
        // and display them
        while (numbers != 31){
            if(isPrime(mersenneValue(numbers))){
                System.out.printf("\n%1d\t\t%1d", numbers, mersenneValue(numbers));
                mersennePrimeCount++;
                if(mersennePrimeCount % 10 == 0)
                    System.out.println();
            }
            numbers++;
        }
    }

    /** Use this method to calculate the mersenne value */
    public static int mersenneValue(int p){
        return (int)Math.pow(2, p) - 1;
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
