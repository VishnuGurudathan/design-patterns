package org.vishnu.factory;

import org.vishnu.ShapeType;
import org.vishnu.products.Shape;

/**
 * @author vishnu.g
 * @project org.vishnu : factory-pattern
 * @created 19/May/2020
 */
public interface ShapeFactory {
    Shape createShape(ShapeType type) throws Exception;
}
