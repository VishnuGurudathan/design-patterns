package org.vishnu.demo;

/**
 * Concrete Visitor class.
 *
 * @author : vishnu.g
 * created on : 27/Jul/2020
 */
public class ConsoleVisitor implements Visitor {

    @Override
    public void visit(Piece piece) {
        System.out.println("Visiting : " + piece.getComponentName() + ", color : " + piece.getColor());
    }

    @Override
    public void visit(BoardBlock boardBlock) {
        System.out.println("Visiting : " + boardBlock.getComponentName() + ". This board has : "
                + boardBlock.getBlockColor() + " block and a piece with name : "
                + boardBlock.getPiece().getComponentName() + " and color : " +  boardBlock.getPiece().getColor());
    }
}
