package org.vishnu.client;

import org.vishnu.shape.ShapeMaker;

/**
 * @author vishnu.g
 * @project org.vishnu.client : facade-pattern
 * @created 28/May/2020
 */
public class ShapeMakerDemo {
    public static void main(String[] args) {

        /* Here the ShaperMaker facade class will hide the implementation details of underlying subsystem */
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();

        shapeMaker.drawSquare();
    }
}
