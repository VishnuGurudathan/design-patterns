package org.vishnu.stock;

/**
 * @author vishnu.g
 * @project org.vishnu.stock : observer-pattern
 * @created 25/May/2020
 */
public class Apple extends Stock {

    private static final String COMPANY_NAME  = "Apple";
    public Apple() {
        super(COMPANY_NAME);
    }
    public Apple(int price) {
        super(COMPANY_NAME);
        this.setStockPrice(price);
    }
}
