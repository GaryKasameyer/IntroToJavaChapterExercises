package Independent;

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
public class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_FILING_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
    public static final int MARRIED_FILING_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    /** No-Arg Constructor */
    public Tax(){}

    /** Constructor with args */
    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome){
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    /** Return filing status */
    public int getFilingStatus(){
        return filingStatus;
    }

    /** set filing status */
    public void setFilingStatus(int filingStatus){
        this.filingStatus = filingStatus;
    }

    /** return brackets */
    public int[][] getBrackets(){
        return brackets;
    }

    /** set brackets */
    public void setBrackets(int[][] brackets){
        this.brackets = brackets;
    }

    /** return rates */
    public double[] getRates(){
        return rates;
    }

    /** set rates */
    public void setRates(double[] rate){
        this.rates = rate;
    }

    /** return taxableIncome */
    public double getTaxableIncome(){
        return taxableIncome;
    }

    /** set taxableIncome */
    public void setTaxableIncome(double taxableIncome){
        this.taxableIncome = taxableIncome;
    }

    /** Calculate and return the tax to be paid */
    public double getTax(){
        double tax = 0;

        if (taxableIncome <= brackets[filingStatus][0]) return Math.round(taxableIncome * rates[0]);

        tax = brackets[filingStatus][0] * rates[0];

        for (int i = 1; i < brackets[filingStatus].length; i++) {

            if (taxableIncome > brackets[filingStatus][i]) {
                tax += (brackets[filingStatus][i] - brackets[filingStatus][i - 1]) * rates[i];

            } else {
                return Math.round(tax + (taxableIncome - brackets[filingStatus][i - 1]) * rates[i]);
            }
        }
        return Math.round(tax + (taxableIncome - brackets[filingStatus][4]) * rates[5]);

    }
}
