package Chapter9_Exercises;

import Independent.Rectangle;

/**
 * Created by USER on 5/5/2017.
 *
 *(The Rectangle class) Following the example of the Circle class in Section 9.2,
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
 *
 *
 */
public class Exercise_01 {
    public static void main(String[] args) {
        Rectangle testRec = new Rectangle(4, 40);
        Rectangle testRec2 = new Rectangle(3.5, 35.9);

        System.out.println("Rectangle 1 width = " + testRec.getWidth());
        System.out.println("Rectangle 1 height = " + testRec.getHeight());
        System.out.println("Rectangle 1 area = " + testRec.getArea());
        System.out.println("Rectangle 1 perimeter = " + testRec.getPerimeter());

        System.out.println("\nRectangle 2 width = " + testRec2.getWidth());
        System.out.println("Rectangle 2 height = " + testRec2.getHeight());
        System.out.println("Rectangle 2 area = " + testRec2.getArea());
        System.out.println("Rectangle 2 perimeter = " + testRec2.getPerimeter());
    }
}
