package org.vishnu.shape;

/**
 * @author vishnu.g
 * @project org.vishnu.shape : facade-pattern
 * @created 28/May/2020
 */
public class CircleSubSystem implements ShapeSubSystem {
    @Override
    public void draw() {
        System.out.println("Drawing a circle in circle Sub-system.");
    }
}
