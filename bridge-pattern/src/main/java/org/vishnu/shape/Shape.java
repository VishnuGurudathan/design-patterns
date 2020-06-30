package org.vishnu.shape;

/**
 * Created By : vishnu.g
 * Created On : 30/Jun/2020
 *
 * @project org.vishnu.shape : bridge-pattern
 */
public abstract class Shape {
    protected int area;
    protected String shapeType;
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public int getArea() {
        return this.area;
    }

    public abstract void computeArea();

    public void paintShape() {
        System.out.println("Painting " + this.shapeType + " with color " + this.color.fillColor());
    }
}
