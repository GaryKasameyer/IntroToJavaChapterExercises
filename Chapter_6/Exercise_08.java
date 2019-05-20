package Chapter6_Exercises;

/**
 * Created by Gary Kasameyer on 10/30/2017.

 (Conversions between Celsius and Fahrenheit) Write a class that contains the following
 two methods:

 /** Convert from Celsius to Fahrenheit
 public static double celsiusToFahrenheit(double celsius)

 /** Convert from Fahrenheit to Celsius
 public static double fahrenheitToCelsius(double fahrenheit)

 The formula for the conversion is:

 fahrenheit = (9.0 / 5) * celsius + 32
 celsius = (5.0 / 9) * (fahrenheit – 32)

 Write a test program that invokes these methods to display the following tables:

 Celsius    Fahrenheit      |    Fahrenheit      Celsius
 ---------------------------|-----------------------------
 40.0       104.0           |    120.0           48.89
 39.0       102.2           |    110.0           43.33
                           ...
 32.0       89.6            |    40.0            4.44
 31.0       87.8            |    30.0           -1.11

 */
public class Exercise_08 {
    public static void main(String[] args) {

        // Print header
        System.out.print("Celcius\t\tFahrenheit\t|\tFahrenheit\tCelsius\n");

        // Use loop to get temperature values
        for(double celsius = 40, fahrenheit = 120; celsius > 30; celsius--, fahrenheit -= 10){
            System.out.printf("%1.2f\t\t%1.2f\t\t|\t%1.2f\t\t%1.2f\n", celsius, celsiusToFahrenheit(celsius), fahrenheit, fahrenheitToCelsius(fahrenheit));
        }

    }

    //Convert from Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;
    }

    // Convert from Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
