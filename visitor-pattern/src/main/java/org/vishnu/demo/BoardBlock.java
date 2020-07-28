package org.vishnu.demo;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 27/Jul/2020
 */
public class BoardBlock extends ChessComponent {

    private String blockColor;
    private Piece piece;

    public BoardBlock(String componentName, String blockColor, Piece piece) {
        super(componentName);
        this.blockColor = blockColor;
        this.piece = piece;
    }

    public String getBlockColor() {
        return blockColor;
    }

    public Piece getPiece() {
        return piece;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
