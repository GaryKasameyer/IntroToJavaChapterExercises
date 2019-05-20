package Chapter10_Exercises;

import Independent.MyPoint;

/**
 * Created by Gary Kasameyer on 8/5/2017.

 (The MyPoint class) Design a class named MyPoint to represent a point with
 x- and y-coordinates. The class contains:

 ■ The data fields x and y that represent the coordinates with getter
 methods.
 ■ A no-arg constructor that creates a point (0, 0).
 ■ A constructor that constructs a point with specified coordinates.
 ■ A method named distance that returns the distance from this point to a
 specified point of the MyPoint type.
 ■ A method named distance that returns the distance from this point to
 another point with specified x- and y-coordinates.

 Draw the UML diagram for the class and then implement the class. Write a
 test program that creates the two points (0, 0) and (10, 30.5) and displays the
 distance between them.

 UML:
        MyPoint
 -x: int
 -y: int
 -------------------------
 +MyPoint()
 +MyPoint(x: int, y: int)
 +distance(point: MyPoint): double
 +distance(x: int, y: int): double

 */
public class Exercise_04 {
    public static void main(String[] args) {

        MyPoint first = new MyPoint();
        MyPoint second = new MyPoint(10,13.5);

        System.out.println("Distance between (0,0) and (10,13.5) is: " + first.distance(second));
    }
}
