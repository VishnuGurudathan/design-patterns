package org.vishnu.demo;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 27/Jul/2020
 */
public class Piece extends ChessComponent {

    private String color;

    public Piece(String componentName, String color) {
        super(componentName);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
