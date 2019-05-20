package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 11/2/2017.

 (Palindromic prime) A palindromic prime is a prime number and also palindromic.
 For example, 131 is a prime and also a palindromic prime, as are 313 and
 757. Write a program that displays the first 100 palindromic prime numbers. Display
 10 numbers per line, separated by exactly one space, as follows:

 2 3 5 7 11 101 131 151 181 191
 313 353 373 383 727 757 787 797 919 929
 ...

 */
public class Exercise_26 {
    public static void main(String[] args) {
        int primePalindromeCount = 0, numbers = 2;

        // Use While loop to move through numbers
        // and check if isPalindrome && isPrime
        // and display them
        while (primePalindromeCount != 100){
            if(isPrime(numbers) && isPalindrome(numbers)){
                System.out.print(numbers + " ");
                primePalindromeCount++;
                if(primePalindromeCount % 10 == 0)
                    System.out.println();
            }
            numbers++;
        }
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

    /** Return the reversal of an integer, i.e., reverse(456) returns 654 */
    public static int reverse(int number){
        int reverse = 0;

        while(number != 0){
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }

        return reverse;
    }

    /** Return true if number is a palindrome */
    public static boolean isPalindrome(int number){
        return (number == reverse(number));
    }
}
