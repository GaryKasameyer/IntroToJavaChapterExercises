package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 9/22/2017.

 (Conversion from miles to kilometers) Write a program that displays the following
 two tables side by side:

 Miles Kilometers | Kilometers Miles
 1     1.609      | 20         12.430
 2     3.218      | 25         15.538
                 ...
 9     14.481     | 60         37.290
 10    16.090     | 65         40.398

 */
public class Exercise_06 {
    public static void main(String[] args) {
        final double KILOMETERS_PER_MILE = 1.609;

        System.out.printf("%1s\t%1s\t|\t%1s\t%1s\n", "Miles", "Kilometers", "Kilometers", "Miles");
        for(int i = 1, k = 20; i < 11; i++, k += 5){
            System.out.printf("%1d\t\t%1.3f\t\t|\t%2d\t\t\t%1.3f\n", i, (i * KILOMETERS_PER_MILE), k, (k / KILOMETERS_PER_MILE));
        }
    }
}
