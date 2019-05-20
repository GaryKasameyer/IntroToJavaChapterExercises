package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 9/22/2017.

 (Financial application: compute future tuition) Suppose that the tuition for a university
 is $10,000 this year and increases 5% every year. In one year, the tuition
 will be $10,500. Write a program that computes the tuition in ten years and the
 total cost of four years’ worth of tuition after the tenth year.

 */
public class Exercise_07 {
    public static void main(String[] args) {
        double increaseRate = 1.05, totalTuitionAfterTenYears = 10000, fourYearsTuitionAfterTenYears;

        // Calculate the total tuition after ten years
        for(int i = 0; i < 10; i++)
             totalTuitionAfterTenYears *= increaseRate;

        // test loop
        //System.out.println("tuition after 10 years: " + totalTuitionAfterTenYears);

        // fourYearsTuition is calculated starting with 10 years tuition
        fourYearsTuitionAfterTenYears = totalTuitionAfterTenYears;

        // Calculate four years of tuition after the ten year increase
        for(int i = 0; i < 4; i++)
            fourYearsTuitionAfterTenYears *= increaseRate;

        // Display the final tuition
        System.out.print("total tuition of 4 years after 10 years increase at 5%: " + fourYearsTuitionAfterTenYears);
    }
}
