package org.vishnu.shape;

/**
 * Created By : vishnu.g
 * Created On : 30/Jun/2020
 *
 * @project org.vishnu.shape : bridge-pattern
 */
public class Rectangle extends Shape {

    private int length;
    private int breadth;

    public Rectangle(int length, int breadth, Color color) {
        super(color);
        this.length = length;
        this.breadth = breadth;
        this.shapeType = "Rectangle";
    }

    public void computeArea() {
        this.area = this.length * this.breadth;
    }
}
