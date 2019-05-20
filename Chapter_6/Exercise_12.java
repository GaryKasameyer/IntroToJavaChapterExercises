package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 10/30/2017.

 (Display characters) Write a method that prints characters using the following
 header:

 public static void printChars(char ch1, char ch2, int
 numberPerLine)

 This method prints the characters between ch1 and ch2 with the specified numbers
 per line. Write a test program that prints ten characters per line from 1 to Z.
 Characters are separated by exactly one space.

 */
public class Exercise_12 {
    public static void main(String[] args) {
        char ch1 = '1', ch2 = 'z';
        final int NUMBERS_PER_LINE = 10;

        printChars(ch1, ch2, NUMBERS_PER_LINE);
    }

    public static void printChars(char ch1, char ch2, int numberPerLine){
        for(int i = (int)ch1, count = 1; i <= (int)ch2; i++, count++){
            System.out.print((char) i + " ");
            if(count % numberPerLine == 0)
                System.out.println();
        }
    }
}
