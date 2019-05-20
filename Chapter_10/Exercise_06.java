package Chapter10_Exercises;

import Independent.MyInteger;
import Independent.StackOfIntegers;

/**
 * Created by Gary Kasameyer on 8/9/2017.

 (Displaying the prime numbers) Write a program that displays all the prime
 numbers less than 120 in decreasing order. Use the StackOfIntegers class
 to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
 reverse order.

 */
public class Exercise_06 {
    public static void main(String[] args) {
        StackOfIntegers stack = new StackOfIntegers();
        final int INTEGER = 120;
        int start;

         for(start = 0; start != INTEGER; start++){
            if(MyInteger.isPrime(start))
                stack.push(start);
         }

         while(stack.getSize() != 0){
             System.out.print(stack.pop() + ", ");
         }
    }
}
