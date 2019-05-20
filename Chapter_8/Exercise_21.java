package Chapter8_Exercises;

import java.util.Scanner;

/**
 * Created by Gary Kasameyer on 3/1/2018.

 (Central city) Given a set of cities, the central city is the city that has the shortest
 total distance to all other cities. Write a program that prompts the user to enter
 the number of the cities and the locations of the cities (coordinates), and finds
 the central city and its total distance to all other cities.

 Enter the number of cities: 5
 Enter the coordinates of the cities:
 2.5 5 5.1 3 1 9 5.4 54 5.5 2.1
 The central city is at (2.5, 5.0)
 The total distance to all other cities is 60.81

 */
public class Exercise_21 {
    public static void main(String[] args) {
        int numberOfCities;


        // Prompt user for variable input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of cities: ");
        numberOfCities = input.nextInt();

        // Make the double[][]
        double[][] cityCoordinates = new double[numberOfCities][2];

        // Prompt user for coordinates and populate double[][]
        System.out.println("Enter the coordinates of the cities: ");
        for(int row = 0; row < cityCoordinates.length; row++){
            for(int col = 0; col < cityCoordinates[row].length; col++){
                cityCoordinates[row][col] = input.nextDouble();
            }
        }

        int centerCity = centerCity(cityCoordinates);

        System.out.println("The central city is (" + cityCoordinates[centerCity][0] + ", " + cityCoordinates[centerCity][1] + ")");
        System.out.println("The total distance to all other cities is " + totalDistance(cityCoordinates, centerCity));

    }

    /** Use centerCity to find the city with the least distance to all other cities
     * by finding the totalDistances between this city and all others
     * then using the lowest total as the center city */
    public static int centerCity(double[][] cityCoordinates){
        int shortestCity = 0;
        double shortestDistance = distance(cityCoordinates[0][0], cityCoordinates[0][1],
                cityCoordinates[1][0], cityCoordinates[1][1]);

        double tempDistance = 0;
        for(int city = 1; city < cityCoordinates.length; city++){
            for(int otherCities = 0; otherCities < cityCoordinates[city].length; otherCities++) {
                tempDistance += distance(cityCoordinates[city][0], cityCoordinates[city][1],
                        cityCoordinates[otherCities][0], cityCoordinates[otherCities][1]);
            }
            if (tempDistance < shortestDistance) {
                shortestCity = city;
                shortestDistance = tempDistance;
            }

            tempDistance = 0;
        }

        return shortestCity;
    }

    /** Use totalDistance to loop call distance to find total distance of all cities from the center city */
    public static double totalDistance(double[][] cityCoordinates, int centerCity){
        double distance = 0.0;

        // Loop through cities and total distance between them
        for(int row = 0; row < cityCoordinates.length - 1; row++){
            if(row == centerCity)
               continue;

            distance += distance(cityCoordinates[centerCity][0], cityCoordinates[centerCity][1],
                    cityCoordinates[row][0], cityCoordinates[row][1]);
        }

        // Return calculated distance
        return distance;
    }

    /** Compute the distance between two points (x1, y1, z1) and (x2, y2, z2)*/
    public static double distance(double x1, double x2, double y1, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }
}
