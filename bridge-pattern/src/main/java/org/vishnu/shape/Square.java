package org.vishnu.shape;

/**
 * Created By : vishnu.g
 * Created On : 30/Jun/2020
 *
 * @project org.vishnu.shape : bridge-pattern
 */
public class Square extends Shape {
    private int sideLength;

    public Square(int sideLength, Color color) {
        super(color);
        this.sideLength = sideLength;
        this.shapeType = "Square";
    }

    public void computeArea() {
        this.area = this.sideLength * this.sideLength;
    }
}
