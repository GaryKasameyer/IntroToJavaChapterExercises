package Chapter7_Exercises;

/**
 * Created by Gary Kasameyer on 11/10/2017.

 (Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a number
 n is prime by checking whether 2, 3, 4, 5, 6, . . . , n/2 is a divisor. If a divisor
 is found, n is not prime. A more efficient approach is to check whether any of the
 prime numbers less than or equal to sqrt(n) can divide n evenly. If not, n is prime.
 Rewrite Listing 5.15 to display the first 50 prime numbers using this approach.
 You need to use an array to store the prime numbers and later use them to check
 whether they are possible divisors for n.

 */
public class Exercise_06 {
    public static void main(String[] args) {
        System.out.println("The first 50 prime numbers are \n");
        printPrimeNumbers(50);
    }

    public static void printPrimeNumbers(int numberOfPrimes) {
        final int NUMBER_OF_PRIMES_PER_LINE = 10; // Display 10 per line
        int count = 0; // Count the number of prime numbers
        int number = 2; // A number to be tested for primeness

        int[] primes = new int[0];
        // Repeatedly find prime numbers
        while (count < numberOfPrimes) {
            // Print the prime number and increase the count
            if (isPrime(number, primes)) {
                primes = increaseArray(primes, number);
                count++; // Increase the count
                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    // Print the number and advance to the new line
                    System.out.printf("%-5s\n", number);
                    }
                else
                System.out.printf("%-5s", number);
            }

            // Check whether the next number is prime
            number++;
        }
    }

    /** Check whether number is prime */
    public static boolean isPrime(int number, int primes[]) {
        /*for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) { // If true, number is not prime
                return false; // Number is not a prime
            }
        }*/

        if(primes.length > 0){
            for(int i = 0; i < primes.length; i++){
                if(number % primes[i] == 0)
                    return false;
            }
        } else if(!oldIsPrime(number)){
            return false;
        }

        return true; // Number is prime
    }

    /** Use oldIsPrime if the array of primes does not solve the next prime problem */
    public static boolean oldIsPrime(int number){
        for(int divisor = 2; divisor <= Math.sqrt(number); divisor++){
            if(number % divisor == 0)
                return false;
        }
        return true;
    }

    /** Use increaseArray to make a new int[] and copy the old int[] to it, then return the new int[] */
    public static int[] increaseArray(int[] numbers, int temp){
        // Check if numbers == 100
        if(numbers.length == 100)
            return numbers;

        // Create a new array == numbers.length + 1
        int[] bigger = new int[numbers.length + 1];

        // Use loop to copy old array to new array
        for(int i = 0; i < numbers.length; i++)
            bigger[i] = numbers[i];

        // Then add the next element temp
        bigger[bigger.length - 1] = temp;

        // And return the new array with all elements
        return bigger;
    }
}



































