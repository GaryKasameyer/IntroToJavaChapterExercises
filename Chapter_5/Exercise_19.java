package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 9/23/2017.

 (Display numbers in a pyramid pattern) Write a nested for loop that prints the
 following output:
                          1
                     1    2    1
                 1   2    4    2   1
             1   2   4    8    4   2   1
          1  2   4   8   16    8   4   2  1
       1  2  4   8   16  32   16   8   4  2  1
    1  2  4  8   16  32  64   32  16   8  4  2  1
 1  2  4  8  16  32  64  128  64  32  16  8  4  2  1

 */
public class Exercise_19 {
    public static void main(String[] args) {
        // Create 8 rows with for loop
        for(int row = 0; row <= 7; row++){
            // Print out spaces
            for(int spaces = 7; spaces > row; spaces--){
                System.out.printf("%4s", " ");
            }

            // Print out first half of pyramid
            for(int column = 0; column <= row; column++){
                System.out.printf("%4s", (int)Math.pow(2,column));
            }

            // Print out second half of pyramid
            for(int column = row - 1; column >= 0; column--){
                System.out.printf("%4s", (int)Math.pow(2,column));
            }
            System.out.println();
        }
    }
}
