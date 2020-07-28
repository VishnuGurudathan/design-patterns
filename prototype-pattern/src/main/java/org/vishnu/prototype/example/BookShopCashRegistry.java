package org.vishnu.prototype.example;

import org.vishnu.prototype.Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author vishnu.g
 * @project org.vishnu.prototype.example : prototype-pattern
 * @created 15/May/2020
 */
public class BookShopCashRegistry {
    private Map<String, Shop> cashRegistry;

    public BookShopCashRegistry() {
        this.cashRegistry = new HashMap<>();
    }

    public void addToCashRegistry(String prototypeName, Shop shop) {
        this.cashRegistry.put(prototypeName, shop);
    }
    public Shop getFromCashRegistry(String prototypeName) {
        return this.cashRegistry.get(prototypeName).clone();
    }

    public static class RegistryType
    {
        public static final String BOOK_SHOP = "book-shop";
    }
}
