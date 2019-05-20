package Independent;

/**
 * Created by Gary Kasameyer on 8/6/2018.

 (Geometry: the Circle2D class) Define the Circle2D class that contains:

 ■ Two double data fields named x and y that specify the center of the circle
 with getter methods.
 ■ A data field radius with a getter method.
 ■ A no-arg constructor that creates a default circle with (0, 0) for (x, y) and 1
 for radius.
 ■ A constructor that creates a circle with the specified x, y, and radius.
 ■ A method getArea() that returns the area of the circle.
 ■ A method getPerimeter() that returns the perimeter of the circle.
 ■ A method contains(double x, double y) that returns true if the
 specified point (x, y) is inside this circle (see Figure 10.21a).
 ■ A method contains(Circle2D circle) that returns true if the specified
 circle is inside this circle (see Figure 10.21b).
 ■ A method overlaps(Circle2D circle) that returns true if the specified
 circle overlaps with this circle (see Figure 10.21c).

 FIGURE 10.21 (a) A point is inside the circle. (b) A circle is inside another circle. (c) A circle
 overlaps another circle.
 (a) (b) (c)

 Draw the UML diagram for the class and then implement the class. Write a test
 program that creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)),
 displays its area and perimeter, and displays the result of c1.contains(3,
 3), c1.contains(new Circle2D(4, 5, 10.5)), and c1.overlaps(new
 Circle2D(3, 5, 2.3)).

 UML:
        Circle2D
 -x: double
 -y: double
 -radius: double
 ------------------
 +Circle2D{}
 +Circle2D(x: double y: double radius: double)
 +getArea(): double
 +getPerimeter(): double
 +contains(x: double y: double): boolean
 +contains(circle: Circle2D): boolean
 +overlaps(circle: Circle2D): boolean


 */
public class Circle2D {
    public static double PI = 3.14;
    double x, y, radius;

    /** No-Arg Constructor for Circle2D */
    public Circle2D(){
        this(0, 0, 1);
    }

    /** Argument constructor for Circle2D */
    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    /** getRadius() returns the radius of the Circle2D object */
    public double getRadius(){
        return this.radius;
    }

    /** getArea() returns the area of the Circle2D object */
    public double getArea(){
        return PI * radius * radius;
    }

    /** getPerimeter() returns the perimeter of the Circle2D object */
    public double getPerimeter(){
        return 2 * PI * radius;
    }

    /** contains() returns true if a particular point is in the Circle2D objects radius */
    public boolean contains(double x, double y){
        if ((x - this.x) * (x - this.x) +
                (y - this.y) * (y - this.y) <= radius * radius)
            return true;
        else
            return false;
    }

    /** contains() returns true if a Circle2D object is contained inside this Circle2D object */
    public boolean contains(Circle2D circle){
        double maxOffset = Math.sqrt((circle.x - this.x)*(circle.x - this.x) + (circle.y - this.y)*(circle.y - this.y)) + circle.radius;

        return maxOffset < this.radius;
    }

    /** overlaps() returns true if another Circle2D object overlaps this circle */
    public boolean overlaps(Circle2D circle){
        double xDistance = this.x - circle.x;
        double yDistance = this.y - circle.y;

        double sumOfRadii = this.getRadius() + circle.getRadius();
        double distanceSquared = xDistance * xDistance + yDistance * yDistance;

        boolean isOverlapping = distanceSquared  < sumOfRadii * sumOfRadii;
        return isOverlapping;
    }

}
