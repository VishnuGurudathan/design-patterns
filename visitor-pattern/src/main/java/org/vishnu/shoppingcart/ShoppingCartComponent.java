package org.vishnu.shoppingcart;

/**
 * Component interface to accept visitor.
 *
 * @author : vishnu.g
 * created on : 27/Jul/2020
 */
public interface ShoppingCartComponent {
    int accept(ShoppingCartVisitor visitor);
}
