package org.vishnu.stock;

/**
 * @author vishnu.g
 * @project org.vishnu.stock : observer-pattern
 * @created 25/May/2020
 */
public class Google extends Stock{

    private static final String COMPANY_NAME  = "Google";

    public Google() {
        super(COMPANY_NAME);
    }
    public Google(int price) {
        super(COMPANY_NAME);
        this.setStockPrice(price);
    }
}
