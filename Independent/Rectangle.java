package Independent;

/**
 * Created by Gary Kasameyer on 5/6/2017.

 (The Rectangle class) Following the example of the Circle class in Section 9.2,
 design a class named Rectangle to represent a rectangle. The class contains:

 ■ Two double data fields named width and height that specify the width and
 height of the rectangle. The default values are 1 for both width and height.
 ■ A no-arg constructor that creates a default rectangle.
 ■ A constructor that creates a rectangle with the specified width and height.
 ■ A method named getArea() that returns the area of this rectangle.
 ■ A method named getPerimeter() that returns the perimeter.

 Draw the UML diagram for the class and then implement the class. Write a test
 program that creates two Rectangle objects—one with width 4 and height 40
 and the other with width 3.5 and height 35.9. Display the width, height, area,
 and perimeter of each rectangle in this order.

 UML:
        Rectangle
 - width: double
 - height: double
 ---------------------------
 +Rectangle()
 +Rectangle(width: double, height: double)
 +getHeight(): double
 +setHeight(height: double): void
 +getWidth(): double
 +setWidth(width: double): void
 +getArea(): double
 +getPerimeter(): double

 */
public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){
        //width = 1;
        //height = 1;
        this(1,1);
    }

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return this.width * this.height;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }
}

