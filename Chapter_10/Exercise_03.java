package Chapter10_Exercises;

import Independent.MyInteger;

/**
 * Created by Gary Kasameyer on 8/1/2017.

 (The MyInteger class) Design a class named MyInteger. The class contains:

 ■ An int data field named value that stores the int value represented by this
 object.
 ■ A constructor that creates a MyInteger object for the specified int value.
 ■ A getter method that returns the int value.
 ■ The methods isEven(), isOdd(), and isPrime() that return true if the
 value in this object is even, odd, or prime, respectively.
 ■ The static methods isEven(int), isOdd(int), and isPrime(int) that
 return true if the specified value is even, odd, or prime, respectively.
 ■ The static methods isEven(MyInteger), isOdd(MyInteger), and
 isPrime(MyInteger) that return true if the specified value is even, odd,
 or prime, respectively.
 ■ The methods equals(int) and equals(MyInteger) that return true if
 the value in this object is equal to the specified value.
 ■ A static method parseInt(char[]) that converts an array of numeric
 characters to an int value.
 ■ A static method parseInt(String) that converts a string into an int
 value.

 Draw the UML diagram for the class and then implement the class. Write a client
 program that tests all methods in the class.

 UML:
        MyInteger
 -value: int
 -------------------------
 +MyInteger(integer: int)
 +getInteger(): int
 +isEven(): boolean
 +isodd(): boolean
 +isPrime(): boolean
 <Static>+isEven(int): boolean </Static>
 <Static>+isOdd(int): boolean </Static>
 <Static>+isPrime(int): boolean </Static>
 +equals(int): boolean
 +equals(MyInteger): boolean
 <Static>parseInt(char[]): int</Static>
 <Static>parseInt(String): int</Static>

 */
public class Exercise_03 {
    public static void main(String[] args) {

        MyInteger seven = new MyInteger(7);
        System.out.println("seven is Even is " + seven.isEven());
        System.out.println("seven is Odd is " + seven.isOdd());
        System.out.println("seven is prime is " + seven.isPrime());

        System.out.println("Static isEven(1) is " + MyInteger.isEven(1));
        System.out.println("Static isOdd(1) is " + MyInteger.isOdd(1));
        System.out.println("Static isPrime(7) is " + MyInteger.isPrime(7));

        System.out.println("does MyInteger seven equal int 1 is " + seven.equals(1));
        System.out.println("does MyInteger seven equal new MyInteger(8) " + seven.equals(new MyInteger(8)));
        System.out.println("does MyInteger seven equal new MyInteger(7) " + seven.equals(new MyInteger(7)));

        System.out.println("parseInt value of char[1,2,3,4] is " + MyInteger.parseInt(new char[]{'1','2','3','4'}));

    }
}
