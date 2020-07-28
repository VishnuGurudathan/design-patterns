package org.vishnu.shoppingcart;

/**
 * Visitor interface for shopping cart.
 *
 * @author : vishnu.g
 * created on : 27/Jul/2020
 */
public interface ShoppingCartVisitor {
    int visit(Book book);
    int visit(Fruit fruit);
}
