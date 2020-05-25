package org.vishnu.stock;

/**
 * @author vishnu.g
 * @project org.vishnu.stock : observer-pattern
 * @created 25/May/2020
 */
public class DisplayBoard implements Observer {

    @Override
    public void update(Stock stock) {
        System.out.println("In display board => Company name : " +  stock.getStockName() + ", stock price : " + stock.getStockPrice());
    }
}
