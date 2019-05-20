package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 11/2/2017.

 (Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
 whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 17
 and 71 are emirps. Write a program that displays the first 100 emirps. Display 10
 numbers per line, separated by exactly one space, as follows:

 13 17 31 37 71 73 79 97 107 113
 149 157 167 179 199 311 337 347 359 389
 ...

 */
public class Exercise_27 {
    public static void main(String[] args) {
        int emirpCount = 0, numbers = 2;

        // Use While loop to move through numbers
        // and check if !isPalindrome && reverse(isPrime)
        // and display them
        while (emirpCount != 100){
            if(isPrime(numbers) && !isPalindrome(numbers) && isPrime(reverse(numbers))){
                System.out.print(numbers + " ");
                emirpCount++;
                if(emirpCount % 10 == 0)
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
