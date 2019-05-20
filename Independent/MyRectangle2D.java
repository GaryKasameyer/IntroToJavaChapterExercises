package Independent;

/**
 * Created by Gary Kasameyer on 8/7/2018.
 (Geometry: the MyRectangle2D class) Define the MyRectangle2D class that
 contains:

 ■ Two double data fields named x and y that specify the center of the rectangle
 with getter and setter methods. (Assume that the rectangle sides are
 parallel to x- or y- axes.)
 ■ The data fields width and height with getter and setter methods.
 ■ A no-arg constructor that creates a default rectangle with (0, 0) for (x, y) and
 1 for both width and height.
 ■ A constructor that creates a rectangle with the specified x, y, width, and
 height.
 ■ A method getArea() that returns the area of the rectangle.
 ■ A method getPerimeter() that returns the perimeter of the rectangle.
 ■ A method contains(double x, double y) that returns true if the
 specified point (x, y) is inside this rectangle (see Figure 10.24a).
 ■ A method contains(MyRectangle2D r) that returns true if the specified
 rectangle is inside this rectangle (see Figure 10.24b).
 ■ A method overlaps(MyRectangle2D r) that returns true if the specified
 rectangle overlaps with this rectangle (see Figure 10.24c).

 FIGURE 10.24 A point is inside the rectangle. (b) A rectangle is inside another rectangle.
 (c) A rectangle overlaps another rectangle. (d) Points are enclosed inside a rectangle.
 (a) (b) (c) (d)

 Draw the UML diagram for the class and then implement the class. Write a test
 program that creates a MyRectangle2D object r1 (new MyRectangle2D(2,
 2, 5.5, 4.9)), displays its area and perimeter, and displays the result of
 r1.contains(3, 3), r1.contains(new MyRectangle2D(4, 5, 10.5,
 3.2)), and r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)).

 UML:
 MyRectangle2D
 -x: double
 -y: double
 -width: double
 -height: double
 ==========================
 +MyRectangle2D()
 +MyRectangle2D(x: double, y: double, width: double, height: double)
 +getX(): double
 +getY(): double
 +setX(x: double): void
 +setY(y: double): void
 +getWidth(): double
 +setWidth(width: double): void
 +getHeight(): double
 +setHeight(height: double): void
 +getArea(): double
 +getPerimeter(): double
 +contains(x: double, y: double): boolean
 +contains(r: MyRectangle2D): boolean
 +overlaps(r: MyRectangle2D): boolean

 */
public class MyRectangle2D {
    private double x, y, width, height;

    /** No-Arg constructor that creates a default MyRectangle2D object */
    public MyRectangle2D(){
        this(0, 0, 1, 1);
    }

    /** Arg constructor that creates a default MyRectangle2D object */
    public MyRectangle2D(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /** getX() returns the value of x for the MyRectangle2D object */
    public double getX(){
        return x;
    }

    /** setX() sets the value of x for the MyRectangle2D object */
    public void setX(double x){
        this.x = x;
    }

    /** getY() returns the value of y for the MyRectangle2D object */
    public double getY(){
        return y;
    }

    /** setY() sets the value of y for the MyRectangle2D object */
    public void setY(double y){
        this.y = y;
    }

    /** getWidth() returns the value of width for the MyRectangle2D object */
    public double getWidth(){
        return width;
    }

    /** setWidth() sets the value of width for the MyRectangle2D object */
    public void setWidth(double width){
        this.width = width;
    }

    /** getHeight() returns the value of height for the MyRectangle2D object */
    public double getHeight(){
        return height;
    }

    /** setHeight() sets the value of height for the MyRectangle2D object */
    public void setHeight(double height){
        this.height = height;
    }

    /** getArea() returns the area of the MyRectangle2D object */
    public double getArea(){
        return width * height;
    }

    /** getPerimeter() returns the perimeter of the MyRectangle2D object */
    public double getPerimeter(){
        return 2 * (width + height);
    }

    /** contains() returns boolean if a set of coordinates is in the rectangle */
    public boolean contains(double x, double y){
        // Get max X & Y
        double maxX = getMax(getP1().x, getP2().x, getP3().x, getP4().x);
        double maxY = getMax(getP1().y, getP2().y, getP3().y, getP4().y);
        // Get min X & Y
        double minX = getMin(getP1().x, getP2().x, getP3().x, getP4().x);
        double minY = getMin(getP1().y, getP2().y, getP3().y, getP4().y);

        if (x < minX || x > maxX || y < minY || y > maxY)  return false;

        return true;
    }

    public boolean contains(MyRectangle2D r2) {
        double xDistance = (r2.x > x) ? r2.x - x : x - r2.x;
        double yDistance = (r2.y > y) ? r2.y - y : y - r2.y;

        // if the r2 is inside this rectangle
        // this is only valid if the rectangles are parallel
        return (xDistance <= (width - r2.width) / 2 && yDistance <= (height - r2.height) / 2);

    }

    public boolean overlaps(MyRectangle2D r2) {
        // subtract from the highest number
        double xDistance = (r2.x > x) ? r2.x - x : x - r2.x;
        double yDistance = (r2.y > y) ? r2.y - y : y - r2.y;

        // if the r2 overlaps this rectangle
        // this is only valid if the rectangles are parallel
        return (xDistance <= (width + r2.width) / 2 && yDistance <= (height + r2.height) / 2);

    }

    public MyPoint getCenterP() {
        return new MyPoint(x, y);
    }
    public MyPoint getP1() {
        return new MyPoint(x - width / 2, y + height / 2);
    }

    public MyPoint getP2() {
        return new MyPoint(x + width / 2, y + height / 2);
    }

    public MyPoint getP3() {
        return new MyPoint(x - width / 2, y - height / 2);
    }

    public MyPoint getP4() {
        return new MyPoint(x + width / 2, y - height / 2);
    }

    private double getMax(double... n) {
        double max = n[0];
        for (int i = 1; i < n.length; i++) {
            if (max < n[i]) {
                max = n[i];
            }
        }
        return max;
    }

    private double getMin(double... n) {
        double min = n[0];
        for (int i = 1; i < n.length; i++) {
            if (min > n[i]) {
                min = n[i];
            }
        }
        return min;
    }
}
