package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 10/31/2017.

 (Financial application: print a tax table) Listing 3.5 gives a program to compute
 tax. Write a method for computing tax using the following header:

 public static double computeTax(int status, double taxableIncome)

 Use this method to write a program that prints a tax table for taxable taxableIncome from
 $50,000 to $60,000 with intervals of $50 for all the following statuses:

 Taxable    Single      Married Joint   Married     Head of
 Income                 or Qualifying   Separate    a House
                        Widow(er)
 50000      8688        6665            8688        7353
 50050      8700        6673            8700        7365
                        ...
 59950      11175       8158            11175       9840
 60000      11188       8165            11188       9853

 Hint: round the tax into integers using Math.round (i.e., Math.round(computeTax(status, taxableIncome)).

 */
public class Exercise_15 {
    public static void main(String[] args) {
        // Print header
        System.out.print("Taxable\t\tSingle\tMarried Jointly\t\tMarried\t\tHead of\nIncome\t\t\t\tor Qualifying\t\tSeparate\ta House\n\t\t\t\t\tWidow(er)\n" +
                "-----------------------------------------------------------\n");

        // Use loop to call computeTax to create and print table values
        for(double taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 50){
            System.out.printf("%1.0f\t\t", taxableIncome);
            for(int status = 1; status <= 4; status++){
                System.out.printf("%1.0f\t\t", computeTax(status, taxableIncome));
            }
            System.out.println();
        }
    }

    // Use computeTax to
    public static double computeTax(int status, double taxableIncome){
        // Compute tax
        double tax = 0;

        if (status == 1) { // Compute tax for single filers
            if (taxableIncome <= 8350)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (taxableIncome - 33950) * 0.25;
            else if (taxableIncome <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
            else if (taxableIncome <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (taxableIncome - 171550) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
        }
        else if (status == 2) { // Left as an exercise
            // Compute tax for married file jointly or qualifying widow(er)
            if (taxableIncome <= 16700)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 67900)
                tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;
            else if (taxableIncome <= 137050)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (taxableIncome - 67900) * 0.25;
            else if (taxableIncome <= 208850)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (137050 - 67900) * 0.25 + (taxableIncome - 137050) * 0.28;
            else if (taxableIncome <= 372950)
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 +
                        (taxableIncome - 208850) * 0.33;
            else
                tax = 16700 * 0.10 + (67900 - 16700) * 0.15 +
                        (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 +
                        (372950 - 208850) * 0.33 + (taxableIncome - 372950) * 0.35;
        }
        else if (status == 3) { // Compute tax for married separately
            // Left as an exercise
            if (taxableIncome <= 8350)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 68525)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (taxableIncome - 33950) * 0.25;
            else if (taxableIncome <= 104425)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (taxableIncome - 82250) * 0.28;
            else if (taxableIncome <= 186475)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 +
                        (taxableIncome - 171550) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
                        (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 +
                        (186475 - 104425) * 0.33 + (taxableIncome - 186475) * 0.35;
        }
        else if (status == 4) { // Compute tax for head of household
            // Left as an exercise
            if (taxableIncome <= 11950)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 45500)
                tax = 11950 * 0.10 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 117450)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                        (taxableIncome - 45500) * 0.25;
            else if (taxableIncome <= 190200)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                        (117450 - 45500) * 0.25 + (taxableIncome - 117450) * 0.28;
            else if (taxableIncome <= 372950)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                        (117450 - 45500) * 0.25 + (372950 - 190200) * 0.28 +
                        (taxableIncome - 190200) * 0.33;
            else
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 +
                        (117450 - 45500) * 0.25 + (190200 - 117450) * 0.28 +
                        (372950 - 190200) * 0.33 + (taxableIncome - 372950) * 0.35;
        }
        else {
            System.out.println("Error: invalid status");
            System.exit(1);
        }
        
        return tax;
    }
}
