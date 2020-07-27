package org.vishnu.client;

import org.vishnu.shoppingcart.*;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 27/Jul/2020
 */
public class ShoppingCartClient {
    public static void main(String[] args)
    {
        ShoppingCartComponent[] items = new ShoppingCartComponent[]{new Book(20, "1234", "My book 1234"),
                new Book(100, "5678", "My book 5678"), new Fruit(10, 2, "Banana"),
                new Fruit(5, 5, "Apple")};

        int total = calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }

    private static int calculatePrice(ShoppingCartComponent[] items)
    {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum=0;
        for(ShoppingCartComponent item : items)
        {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}
