package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 10/31/2017.

 (Display matrix of 0s and 1s) Write a method that displays an n-by-n matrix using
 the following header:

 public static void printMatrix(int n)

 Each element is 0 or 1, which is generated randomly. Write a test program that
 prompts the user to enter n and displays an n-by-n matrix. Here is a sample run:

 Enter n: 3
 0 1 0
 0 0 0
 1 1 1

 */
public class Exercise_17 {
    public static void main(String[] args) {
        int n = 5;
        printMatrix(n);
    }

    public static void printMatrix(int n){
        // Use loop to print matrix
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++) {
                System.out.print((int) (Math.random() * 2));
                if (j % n == 0)
                    System.out.println();
            }
        }
    }
}
