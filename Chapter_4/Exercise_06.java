package Chapter4_Exercises;

/**
 * Created by Gary Kasameyer on 9/16/2017.

 (Random points on a circle) Write a program that generates three random points
 on a circle centered at (0, 0) with radius 40 and display three angles in a triangle
 formed by these three points, as shown in Figure 4.7a. (Hint: Generate a random
 angle a in radians between 0 and 2p, as shown in Figure 4.7b and the point determined
 by this angle is (r*cos(a), r*sin(a)).)

 FIGURE 4.7 (a) A triangle is formed from three random points on the circle. (b) A random
 point on the circle can be generated using a random angle a. (c) A pentagon is centered at
 (0, 0) with one point at the 0 o’clock position.
 65
 55
 60
 x = r × cos(α) and y = r ×sin(α) 0 o’clock position

 */
public class Exercise_06 {
    public static void main(String[] args) {
        double  randomPoint1, randomPoint2, randomPoint3,
                randomPoint1_X, randomPoint2_X, randomPoint3_X,
                randomPoint1_Y, randomPoint2_Y, randomPoint3_Y,
                distancePoint1_Point2, distancePoint2_Point3, distancePoint3_Point1,
                angle1, angle2, angle3;
        final double RADIUS = 40;

        // assign random values to points 1 2 3
        // these are just random points anywhere on the circle (1 - 360)
        randomPoint1 = (int)(Math.random() * ((360 - 1) + 1) + 1);
        randomPoint2 = (int)(Math.random() * ((360 - 1) + 1) + 1);
        randomPoint3 = (int)(Math.random() * ((360 - 1) + 1) + 1);

        // check random point values
        //System.out.print("1 " + randomPoint1 + " 2 " + randomPoint2 + " 3 " + randomPoint3);

        // Calculate the X and Y values of randomPoint's 1 2 3
        // x = r × cos(α) and y = r ×sin(α)
        randomPoint1_X = RADIUS * Math.cos(randomPoint1);
        randomPoint1_Y = RADIUS * Math.sin(randomPoint1);

        randomPoint2_X = RADIUS * Math.cos(randomPoint2);
        randomPoint2_Y = RADIUS * Math.sin(randomPoint2);

        randomPoint3_X = RADIUS * Math.cos(randomPoint3);
        randomPoint3_Y = RADIUS * Math.sin(randomPoint3);

        /*// Display X and Y of random points
        System.out.printf("Angle 1: %2.0f (X: %2.0f, Y: %2.0f)\nAngle 2: %2.0f (X: %2.0f, Y: %2.0f)\nAngle 3: %2.0f (X: %2.0f, Y: %2.0f)",
                angle1, angle1_X, angle1_Y, angle2, angle2_X, angle2_Y, angle3, angle3_X, angle3_Y);*/

        // Find the Distance Between all three points (X, Y)'s using the distance formula
        distancePoint1_Point2 = Math.sqrt(Math.pow((randomPoint2_X - randomPoint1_X),2) + Math.pow((randomPoint2_Y - randomPoint1_Y),2));
        distancePoint2_Point3 = Math.sqrt(Math.pow((randomPoint3_X - randomPoint2_X),2) + Math.pow((randomPoint3_Y - randomPoint2_Y),2));
        distancePoint3_Point1 = Math.sqrt(Math.pow((randomPoint1_X - randomPoint3_X),2) + Math.pow((randomPoint1_Y - randomPoint3_Y),2));

        // Check distances
        //System.out.println("P1P2: " + distancePoint1_Point2 + " P2P3: " + distancePoint2_Point3 + " P3P1 " + distancePoint3_Point1);

        // Use distances along with Law of cosine a2=b2+c2−2bc⋅cos(A) to find 3 angles of triangle formed by random points 1 2 3
        angle1 = Math.toDegrees(Math.acos((Math.pow(distancePoint2_Point3, 2) - (Math.pow(distancePoint3_Point1, 2) + Math.pow(distancePoint1_Point2, 2))) / (-2 * distancePoint3_Point1 * distancePoint1_Point2)));
        angle2 = Math.toDegrees(Math.acos((Math.pow(distancePoint3_Point1, 2) - (Math.pow(distancePoint1_Point2, 2) + Math.pow(distancePoint2_Point3, 2))) / (-2 * distancePoint1_Point2 * distancePoint2_Point3)));
        angle3 = Math.toDegrees(Math.acos((Math.pow(distancePoint1_Point2, 2) - (Math.pow(distancePoint2_Point3, 2) + Math.pow(distancePoint3_Point1, 2))) / (-2 * distancePoint2_Point3 * distancePoint3_Point1)));

        // Display the final result
        System.out.printf("Angle 1: %1.0f   Angle 2: %1.0f   Angle 3: %1.0f", angle1, angle2, angle3);
    }
}
