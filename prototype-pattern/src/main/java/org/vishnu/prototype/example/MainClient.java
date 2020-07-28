package org.vishnu.prototype.example;

import org.vishnu.prototype.ConcretePrototypeA;
import org.vishnu.prototype.PrototypeRegistry;

/**
 * @author vishnu.g
 * @project org.vishnu.prototype.example : prototype-pattern
 * @created 15/May/2020
 */
public class MainClient {
    public static void main(String[] args) {
        BookShop bookShop = new BookShop("Fist Shop", 123);
        bookShop.loadBook();

        BookShopCashRegistry cashRegistry = new BookShopCashRegistry();
        cashRegistry.addToCashRegistry(BookShopCashRegistry.RegistryType.BOOK_SHOP, bookShop);

        BookShop clonedShop = (BookShop) cashRegistry.getFromCashRegistry(BookShopCashRegistry.RegistryType.BOOK_SHOP).clone();
        clonedShop.setShopName("Second Shop");
        clonedShop.setShopId(456);

        System.out.println("bookShop : " + bookShop);
        System.out.println("clonedShop : " + clonedShop);

        bookShop.getBooks().remove(0);
        System.out.println("bookShop : " + bookShop);
        System.out.println("clonedShop : " + clonedShop);

    }
}
