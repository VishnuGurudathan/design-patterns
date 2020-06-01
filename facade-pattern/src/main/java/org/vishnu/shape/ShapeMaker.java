package org.vishnu.shape;

/**
 * @author vishnu.g
 * @project org.vishnu.shape : facade-pattern
 * @created 28/May/2020
 */
public class ShapeMaker {
    /** This is a facade class, which act as an interface between client and complex subsystems.**/

    /* Suppose our subsystems interact each other and to other helper classes to give the result.
    *  By using facade pattern we can hide the complex communication from the client who is using our
    *  library or framework.
    * */
    private ShapeSubSystem circleSubSystem;
    private ShapeSubSystem rectangleSubSystem;
    private ShapeSubSystem squareSubSystem;

    public ShapeMaker() { }

    public void drawCircle() {
        circleSubSystem = new CircleSubSystem();
        circleSubSystem.draw();
    }

    public void drawSquare() {
        squareSubSystem = new SquareSubSystem();
        squareSubSystem.draw();
    }
}
