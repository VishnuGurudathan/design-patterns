package org.vishnu.client;

import org.vishnu.demo.BoardBlock;
import org.vishnu.demo.ConsoleVisitor;
import org.vishnu.demo.Piece;
import org.vishnu.demo.Visitor;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 27/Jul/2020
 */
public class DemoClient {
    public static void main(String[] args) {
        Piece rook = new Piece("Rook", "black");
        BoardBlock block = new BoardBlock("Block", "white", rook);

        Visitor visitor = new ConsoleVisitor();
        block.accept(visitor);


    }
}
