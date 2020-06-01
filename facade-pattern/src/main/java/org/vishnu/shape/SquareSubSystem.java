package org.vishnu.shape;

/**
 * @author vishnu.g
 * @project org.vishnu.shape : facade-pattern
 * @created 28/May/2020
 */
public class SquareSubSystem implements ShapeSubSystem {
    @Override
    public void draw() {
        System.out.println("Drawing a square in Square Sub-system.");
    }
}
