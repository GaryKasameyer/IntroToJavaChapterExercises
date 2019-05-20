package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 9/22/2017.

 (Display the ASCII character table) Write a program that prints the characters in
 the ASCII character table from ! to ~. Display ten characters per line. The ASCII
 table is shown in Appendix B. Characters are separated by exactly one space.

 */
public class Exercise_15 {
    public static void main(String[] args) {
        // find out in values of !(33) and -(45)
        //System.out.println("! = " + (int)'!' + " - is " + (int)'-');

        for(int i = 33; i < 46; i++){
            System.out.print((char)i + " ");
            if((i - 32) % 10 == 0)
                System.out.println();
        }
    }
}
