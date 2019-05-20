package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 10/29/2017.

 (Display patterns) Write a method to display a pattern as follows:

               1
             2 1
           3 2 1
 ...
 n n-1 ... 3 2 1

 The method header is

 public static void displayPattern(int n)

 */
public class Exercise_06 {
    public static void main(String[] args) {
        int number = 6;

        displayPattern(number);
    }

    public static void displayPattern(int n){
        for(int rows = 1; rows <= n; rows++){
            for(int spaces = n - rows; spaces > 0; spaces--){
                System.out.print("  ");
            }

            for(int number = rows; number > 0; number--)
                System.out.print(number + " ");

            System.out.println();
        }
    }
}

























