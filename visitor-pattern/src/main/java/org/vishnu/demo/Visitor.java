package org.vishnu.demo;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 27/Jul/2020
 */
public interface Visitor {
    void visit(Piece piece);
    void visit(BoardBlock boardBlock);
}
