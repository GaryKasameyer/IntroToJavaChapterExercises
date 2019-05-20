package Chapter5_Exercises;

/**
 * Created by Gary Kasameyer on 9/21/2017.

 (Conversion from kilograms to pounds and pounds to kilograms) Write a program
 that displays the following two tables side by side:

 Kilograms Pounds | Pounds Kilograms
 1          2.2   | 20      9.09
 3          6.6   | 25      11.36
                ...
 197        433.4 | 510     231.82
 199        437.8 | 515     234.09

 */
public class Exercise_05 {
    public static void main(String[] args) {
        final double POUNDS_PER_KILOGRAM = 2.2;

        System.out.println("Kilograms\t\tPounds\t|\tPounds\t\tKilograms");
        for(int i = 1, k = 20; i < 200; i++, k += 5){
            System.out.printf("%1d\t\t%2.1f\t\t|\t\t%1d\t\t%1.2f\n", i, (i * POUNDS_PER_KILOGRAM), k, (k / POUNDS_PER_KILOGRAM));
            //System.out.printf(i + "\t\t" + (i * POUNDS_PER_KILOGRAM) + "\t|\t" + k + "")
        }
    }
}
