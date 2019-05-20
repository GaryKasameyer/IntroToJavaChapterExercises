package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 9/23/2017.

 (Display four patterns using loops) Use nested loops that display the following
 patterns in four separate programs:

 Pattern A      Pattern B       Pattern C       Pattern D
 1              1 2 3 4 5 6             1       1 2 3 4 5 6
 1 2            1 2 3 4 5             2 1       1 2 3 4 5
 1 2 3          1 2 3 4             3 2 1       1 2 3 4
 1 2 3 4        1 2 3             4 3 2 1       1 2 3
 1 2 3 4 5      1 2             5 4 3 2 1       1 2
 1 2 3 4 5 6    1             6 5 4 3 2 1       1

 */
public class Exercise_18 {
    public static void main(String[] args) {
        // Create pattern A
        System.out.println("Pattern A");
        for(int row = 1; row < 7; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // Create pattern B
        System.out.println("\nPattern B");
        for(int row = 7; row > 0; row--){
            for(int col = 1; col < row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // Create pattern C
        System.out.println("\nPattern C");
        for(int row = 6; row >= 1; row--){
            for(int spaces = row; spaces > 1; spaces--){
                System.out.print("  ");
            }
            for(int col = 7 - row; col > 0; col--){
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // Create Pattern D
        System.out.println("\nPattern D");
        for(int row = 1; row < 7; row++){
            for(int col = 1; col < 8 - row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
