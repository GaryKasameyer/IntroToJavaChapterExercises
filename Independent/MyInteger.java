package Independent;


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
 +isOdd(): boolean
 +isPrime(): boolean
 <Static>+isEven(int): boolean </Static>
 <Static>+isOdd(int): boolean </Static>
 <Static>+isPrime(int): boolean </Static>
 +equals(int): boolean
 +equals(MyInteger): boolean
 <Static>parseInt(char[]): int</Static>
 <Static>parseInt(String): int</Static>

 */
public class MyInteger {
    private int value;

    public MyInteger(int value){
        this.value = value;
    }

    public int getInteger(){
        return value;
    }

    public boolean isEven(){
        /***if(value % 2 == 0)
            return true;
        else
            return false;*/
        return value % 2 == 0;
    }

    public boolean isOdd(){
        if(value % 2 != 0)
            return true;
        else
            return false;
    }

    public boolean isPrime(){
        // Check if value is a multiple of 2
        if(value == 2)
            return true;
        else if(value % 2 == 0)
            return false;
        for(int i = 3; i*i <= value; i+=2){
            if(value % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isEven(int value){
        if(value % 2 == 0)
            return true;
        return false;
    }

    public static boolean isOdd(int value){
        if(value % 2 != 0)
            return true;
        return false;
    }

    public static boolean isPrime(int value){
        if(value == 2)
            return true;
        if(value % 2 == 0)
            return false;
        for(int i = 3; i*i <= value; i+=2){
            if(value % i == 0)
                return false;
        }
        return true;
    }

    public boolean equals(int value){
        if(this.value == value)
            return true;
        return false;
    }

    public boolean equals(MyInteger value){
        if(this.value == value.value)
            return true;
        return false;
    }

    public static int parseInt(char[] value){
        return parseInt(new String(value));
    }

    public static int parseInt(String value){
        return Integer.parseInt(value);
    }
}
