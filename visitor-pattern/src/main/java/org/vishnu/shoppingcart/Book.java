package org.vishnu.shoppingcart;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 27/Jul/2020
 */
public class Book implements ShoppingCartComponent {

    private int price;
    private String isbnNumber;
    private String name;

    public Book(int price, String isbnNumber, String name) {
        this.price = price;
        this.isbnNumber = isbnNumber;
        this.name = name;
    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

    public int getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public String getName() {
        return name;
    }
}
