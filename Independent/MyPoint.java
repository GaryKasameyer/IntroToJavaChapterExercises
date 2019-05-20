package Independent;

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
public class MyPoint {
    public double x;
    public double y;

    public MyPoint(){
        x = 0;
        y = 0;
    }

    public MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }

    // Returns the distance from this point to a point
    // specified (argument passed) point of MyPoint type.
    public double distance(MyPoint point){
        return Math.sqrt(Math.pow((point.x - this.x),2)+Math.pow((point.y - this.y),2));
    }

    // Returns the distance from this point to another point
    // with the specified x- and y-coordinates (arguments passed)
    public double distance(int x, int y){
        return Math.sqrt(Math.pow((x - this.x),2)+Math.pow((y - this.y),2));
    }
}
