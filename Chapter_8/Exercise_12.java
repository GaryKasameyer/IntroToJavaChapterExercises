package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 5/21/2017.

 **8.12 (Financial application: compute tax) Rewrite Listing 3.5, ComputeTax.java,
 using arrays. For each filing status, there are six tax rates. Each rate is applied
 to a certain amount of taxable income. For example, from the taxable income of
 $400,000 for a single filer, $8,350 is taxed at 10%, (33,950 - 8,350) at 15%,
 (82,250 - 33,950) at 25%, (171,550 - 82,550) at 28%, (372,550 - 82,250) at
 33%, and (400,000 - 372,950) at 36%. The six rates are the same for all filing
 statuses, which can be represented in the following array:

 double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};

 The brackets for each rate for all the filing statuses can be represented in a twodimensional
 array as follows:

 int[][] brackets = {
     {8350, 33950, 82250, 171550, 372950}, // Single filer
     {16700, 67900, 137050, 20885, 372950}, // Married jointly
     // -or qualifying widow(er)
     {8350, 33950, 68525, 104425, 186475}, // Married separately
     {11950, 45500, 117450, 190200, 372950} // Head of household
 };

 Suppose the taxable income is $400,000 for single filers. The tax can be computed
 as follows:

 tax = brackets[0][0] * rates[0] +
     (brackets[0][1] – brackets[0][0]) * rates[1] +
     (brackets[0][2] – brackets[0][1]) * rates[2] +
     (brackets[0][3] – brackets[0][2]) * rates[3] +
     (brackets[0][4] – brackets[0][3]) * rates[4] +
     (400000 – brackets[0][4]) * rates[5]

 */


public class Exercise_12 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
                {8350, 33950, 82250, 171550, 372950},  // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly
                                                       // -or- qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475},  // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        };

        // Prompt the user to enter filing status
        System.out.print("(0-single filer, 1-married jointly or " +
                "qualifying widow(er), 2-married separately, 3-head of " +
                "household) Enter the filing status: ");

        int status = input.nextInt();

        // Prompt the user to enter taxable income
        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        // Compute tax
        double tax = 0;

        if(status == 0) {
            tax = brackets[0][0] * rates[0] +
                    (brackets[0][1] - brackets[0][0]) * rates[1] +
                    (brackets[0][2] - brackets[0][1]) * rates[2] +
                    (brackets[0][3] - brackets[0][2]) * rates[3] +
                    (brackets[0][4] - brackets[0][3]) * rates[4] +
                    (income - brackets[0][4]) * rates[5];
        }else if(status == 1){
            tax = brackets[1][0] * rates[0] +
                    (brackets[1][1] - brackets[1][0]) * rates[1] +
                    (brackets[1][2] - brackets[1][1]) * rates[2] +
                    (brackets[1][3] - brackets[1][2]) * rates[3] +
                    (brackets[1][4] - brackets[1][3]) * rates[4] +
                    (income - brackets[1][4]) * rates[5];
        }else if(status == 2){
            tax = brackets[2][0] * rates[0] +
                    (brackets[2][1] - brackets[2][0]) * rates[1] +
                    (brackets[2][2] - brackets[2][1]) * rates[2] +
                    (brackets[2][3] - brackets[2][2]) * rates[3] +
                    (brackets[2][4] - brackets[2][3]) * rates[4] +
                    (income - brackets[2][4]) * rates[5];
        }else if(status == 3){
            tax = brackets[3][0] * rates[0] +
                    (brackets[3][1] - brackets[3][0]) * rates[1] +
                    (brackets[3][2] - brackets[3][1]) * rates[2] +
                    (brackets[3][3] - brackets[3][2]) * rates[3] +
                    (brackets[3][4] - brackets[3][3]) * rates[4] +
                    (income - brackets[3][4]) * rates[5];
        }else
            System.out.print("YOU FUCKED UP - ");

         // Display the result
         System.out.println("Tax is " + (int)(tax * 100) / 100.0);
 }
}
