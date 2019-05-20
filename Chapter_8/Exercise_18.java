package Chapter8_Exercises;


/**
 * Created by Gary Kasameyer on 2/14/2018.

 (Shuffle rows) Write a method that shuffles the rows in a two-dimensional int
 array using the following header:

 public static void shuffle(int[][] m)

 Write a test program that shuffles the following matrix:

 int[][] m = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

 */
public class Exercise_18 {
    public static void main(String[] args) {
        int[][] unshuffled = {{1, 2}, {3, 4}, {5, 6}, {7, 8}, {9, 10}};

        // Call shuffle
        shuffle(unshuffled);

        // Print out shuffle array
        for(int row = 0; row < unshuffled.length; row++){
            for(int col = 0; col < unshuffled[row].length; col++){
                System.out.print(unshuffled[row][col] + " ");
            }
            System.out.println();
        }
    }

    // Use shuffle to shuffle to the rows in a two-dimensional int array
    public static void shuffle(int[][] m){
        for(int row = 0; row < m.length; row++){
            int random = (int)(Math.random() * m.length);

            // Swap this row with random row
            int temp = m[row][0];
            int temp2 = m[row][1];
            m[row][0] = m[random][0];
            m[row][1] = m[random][1];
            m[random][0] = temp;
            m[random][1] = temp2;
        }
    }


}
