package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 10/30/2017.

 (Conversions between feet and meters) Write a class that contains the following
 two methods:

 /** Convert from feet to meters
 public static double footToMeter(double foot)

 /** Convert from meters to feet
 public static double meterToFoot(double meter)

 The formula for the conversion is:

        meter = 0.305 * foot
        foot = 3.279 * meter

 Write a test program that invokes these methods to display the following tables:

 Feet   Meters   |    Meters     Feet
 1.0    0.305    |    20.0       65.574
 2.0    0.610    |    25.0       81.967
                ...
 9.0    2.745    |    60.0       196.721
 10.0   3.050    |    65.0       213.115

 */
public class Exercise_09 {
    public static void main(String[] args) {
        // Print header
        System.out.print("Feet\tMeters\t|\tMeters\tFeet\n");

        // Loop through to create table
        for(double feet = 1.0, meters = 20.0; feet <= 10; feet++, meters += 5){
            System.out.printf("%1.2f\t%1.3f\t|\t%1.2f\t%1.3f\n", feet, footToMeter(feet), meters, meterToFoot(meters));
        }
    }

    // Convert from feet to meters
    public static double footToMeter(double foot){
        return 0.305 * foot;
    }

    // Convert from meters to feet
    public static double meterToFoot(double meter){
        return 3.279 * meter;
    }
}
