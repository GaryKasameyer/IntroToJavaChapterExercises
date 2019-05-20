package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 10/31/2017.

 (Estimate p) p can be computed using the following series:
                1   1   1   1   1           (-1)^i+1
 m(i) = 4 ( 1 - - + - - - + - - - + ... + -----------
                3   5   7   9   11          2i - 1

 Write a method that returns m(i) for a given i and write a test program that displays
 the following table:

 i      m(i)
 -------------
 1      4.0000
 101    3.1515
 201    3.1466
 301    3.1449
 401    3.1441
 501    3.1436
 601    3.1433
 701    3.1430
 801    3.1428
 901    3.1427

 */
public class Exercise_14 {
    public static void main(String[] args) {
        // Print header
        System.out.print("i\t\tm(i)\n--------------\n");

        // Use loop to create table values
        for(double i = 1; i <= 901; i += 100)
            System.out.printf("%1.0f\t\t%1.6f\n", i, m(i));
    }

    public static double m(double i){
        double sum = 0;

        for(double j = 1; j <= i; j++)
            sum += Math.pow(-1, j + 1) / (2 * j - 1);

        return sum * 4;
    }
}



















