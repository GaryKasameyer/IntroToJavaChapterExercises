package Chapter10_Exercises;

import Independent.Tax;

/**
 * Created by Gary Kasameyer on 4/7/2018.

 (Financial: the Tax class) Programming Exercise 8.12 writes a program for
 computing taxes using arrays. Design a class named Tax to contain the following
 instance data fields:

 ■ int filingStatus: One of the four tax-filing statuses: 0—single filer, 1—
 married filing jointly or qualifying widow(er), 2—married filing separately,
 and 3—head of household. Use the public static constants SINGLE_FILER
 (0), MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1), MARRIED_
 SEPARATELY (2), HEAD_OF_HOUSEHOLD (3) to represent the statuses.
 ■ int[][] brackets: Stores the tax brackets for each filing status.
 ■ double[] rates: Stores the tax rates for each bracket.
 ■ double taxableIncome: Stores the taxable income.

 Provide the getter and setter methods for each data field and the getTax()
 method that returns the tax. Also provide a no-arg constructor and the constructor
 Tax(filingStatus, brackets, rates, taxableIncome).

 Draw the UML diagram for the class and then implement the class. Write a test
 program that uses the Tax class to print the 2001 and 2009 tax tables for taxable
 income from $50,000 to $60,000 with intervals of $1,000 for all four statuses.
 The tax rates for the year 2009 were given in Table 3.2. The tax rates for 2001
 are shown in Table 10.1.

 Married filing jointly     Married filing
 Tax rate    Single filers       or qualifying widow(er)    separately             Head of household
 15%         Up to $27,050       Up to $45,200              Up to $22,600          Up to $36,250
 27.5%       $27,051–$65,550     $45,201–$109,250           $22,601–$54,625        $36,251–$93,650
 30.5%       $65,551–$136,750    $109,251–$166,500          $54,626–$83,250        $93,651–$151,650
 35.5%       $136,751–$297,350   $166,501–$297,350          $83,251–$148,675       $151,651–$297,350
 39.1%       $297,351 or more    $297,351 or more           $148,676 or more       $297,351 or more

 UML:
        Tax
 +SINGLE_FILER: INT
 +MARRIED_FILING_JOINTLY_OR_QUALIFYING_WIDOW(ER): INT
 +MARRIED_FILING_SEPARATELY: INT
 +HEAD_OF_HOUSEHOLD: INT
 -filingStatus: int
 -brackets: int[][]
 -rates: double[]
 -taxableIncome: double
 --------------------------------
 +Tax()
 +Tax(filingStatus: int, brackets: int[][], rates: double, taxableIncome: double)
 +getFilingStatus(): int
 +setFilingStatus(filingStatus: int): void
 +getBrackets(): int[][]
 +setBrackets(brackets: int[][]): void
 +getRate(): double[]
 +setRate(rate: double[]): void
 +getTaxableIncome(): double
 +setTaxableIncome(taxableIncome: double): void
 +getTax(): double


 */
public class Exercise_08 {
    public static void main(String[] args) {
        double[] ratesFor2009 = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35},
                ratesFor2001 = {0.15, 0.275, 0.305, 0.355, 0.391};
        int[][] bracketsFor2009 = {
                {8350, 33950, 82250, 171550, 372950}, // Single filer
                {16700, 67900, 137050, 20885, 372950}, // Married jointly -or qualifying widow(er)
                {8350, 33950, 68525, 104425, 186475}, // Married separately
                {11950, 45500, 117450, 190200, 372950} // Head of household
        },
                bracketsFor2001 = {
                {27050, 65550, 136750, 297350}, // Single filer
                {45200, 109250, 166500, 297350}, // Married jointly -or qualifying widow(er)
                {22600, 54625, 83250, 148675}, // Married separately
                {36250, 93650, 151650, 297350} // Head of household
        };

        int[][] brackets = bracketsFor2001;
        double[] rates = ratesFor2001;


        System.out.printf("2001\n%-20s%-12s%-4s%21s%16s\n", "Taxable Income", "Single", "Married Joint", "Married Separate", "Head of house");
        for (int i = 50000; i <= 60000; i += 1000) {
            System.out.printf("%4d%19.0f%16.0f%16.0f%20.0f\n", i,
                    new Tax(Tax.SINGLE_FILER, brackets, rates, i).getTax(),
                    new Tax(Tax.MARRIED_FILING_JOINTLY_OR_QUALIFYING_WIDOWER, brackets, rates, i).getTax(),
                    new Tax(Tax.MARRIED_FILING_SEPARATELY, brackets, rates, i).getTax(),
                    new Tax(Tax.HEAD_OF_HOUSEHOLD, brackets, rates, i).getTax()
            );
        }

        brackets = bracketsFor2009;
        rates = ratesFor2009;

        System.out.printf("\n2009\n%-20s%-12s%-4s%21s%16s\n", "Taxable Income", "Single", "Married Joint", "Married Separate", "Head of house");
        for (int i = 50000; i <= 60000; i += 1000) {
            System.out.printf("%4d%19.0f%16.0f%16.0f%20.0f\n", i,
                    new Tax(Tax.SINGLE_FILER, brackets, rates, i).getTax(),
                    new Tax(Tax.MARRIED_FILING_JOINTLY_OR_QUALIFYING_WIDOWER, brackets, rates, i).getTax(),
                    new Tax(Tax.MARRIED_FILING_SEPARATELY, brackets, rates, i).getTax(),
                    new Tax(Tax.HEAD_OF_HOUSEHOLD, brackets, rates, i).getTax()
            );
        }
    }
}
