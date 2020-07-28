package org.vishnu.factory;

import org.vishnu.ShapeType;
import org.vishnu.factory.ShapeFactory;
import org.vishnu.products.Circle;
import org.vishnu.products.Shape;
import org.vishnu.products.Square;

/**
 * @author vishnu.g
 * @project org.vishnu : factory-pattern
 * @created 19/May/2020
 */
public class SimpleShapeFactory implements ShapeFactory {

    public Shape createShape(ShapeType type) throws Exception {
        Shape shape = null;
        switch (type) {
            case CIRCLE:
                shape = new Circle();
                break;
            case SQUARE:
                shape = new Square();
                break;
            case RECTANGLE:
                System.err.println("Rectangle is yet to be defined.");
                break;
            default:
                throw new Exception("Shape of type '" + type + "' not supported.");
        }
        return shape;
    }
}
