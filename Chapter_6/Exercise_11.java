package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 10/30/2017.

 (Financial application: compute commissions) Write a method that computes the
 commission, using the scheme in Programming Exercise 5.39. The header of the
 method is as follows:

 public static double computeCommission(double salesAmount)

 Write a test program that displays the following table:

 Sales  Amount Commission
 10000  900.0
 15000  1500.0
      ...
 95000  11100.0
 100000 11700.0

 */
public class Exercise_11 {
    public static void main(String[] args) {
        // Print header
        System.out.print("Sales\tAmount Commission\n");

        // Use loop and computeCommission to display table
        for(int i = 10000; i <= 100000; i += 5000)
            System.out.printf("%1d\t%1.2f\n", i, computeCommission(i));
    }

    //
    public static double computeCommission(double salesAmount){
        double earnings = 0;

        if(salesAmount >= 10000.01)
            earnings = 900 + (salesAmount - 10000) * .12;
        else if(salesAmount >= 5000.01)
            earnings = 400 + (salesAmount - 5000) * .10;
        else
            earnings =  salesAmount * .08;

        return earnings;
    }
}
