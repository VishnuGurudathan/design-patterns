package org.vishnu.client;

import org.vishnu.stock.Apple;
import org.vishnu.stock.DisplayBoard;
import org.vishnu.stock.Google;

/**
 * @author vishnu.g
 * @project org.vishnu.client : observer-pattern
 * @created 25/May/2020
 */
public class StockDemo {
    public static void main(String[] args) throws InterruptedException {
        Apple apple = new Apple(100);
        Google google = new Google(170);

        DisplayBoard displayBoard = new DisplayBoard();

        apple.register(displayBoard);
        google.register(displayBoard);

        apple.setStockPrice(150);
        System.out.println("==============================================================");

        Thread.sleep(5000);
        google.setStockPrice(200);
        apple.setStockPrice(190);
        System.out.println("==============================================================");
    }
}
