package org.vishnu;

/**
 * @author vishnu.g
 * @project org.vishnu : factory-pattern
 * @created 19/May/2020
 */
public interface ShapeFactory {
    Shape createShape(ShapeType type) throws Exception;
}
