package org.vishnu.prototype.example;

import org.vishnu.prototype.ConcretePrototypeA;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author vishnu.g
 * @project org.vishnu.prototype.example : prototype-pattern
 * @created 15/May/2020
 */
public class BookShop implements Shop {
    private String shopName;
    private int shopId;
    private List<Book> books;

    public BookShop() {
    }

    public BookShop(String shopName, int shopId) {
        this.shopName = shopName;
        this.shopId = shopId;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void loadBook() {
        /* Mock book load from db*/
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Book book = new Book("Book-" + i, "Test book " + i);
            books.add(book);
        }
        this.setBooks(books);
    }

    @Override
    public Shop clone() {
        return deepCopy();
    }

    /**
     * <p>This will give a shallow copy of the object.</p>
     * @return
     */
    private Shop shallowCopy() {
        BookShop obj = null;
        try {
            obj = (BookShop) super.clone();
        } catch (CloneNotSupportedException exc) {
            exc.printStackTrace();
        }
        return obj;
    }

    /**
     * <p>This will give a deep copy of the object.</p>
     * @return
     */
    private Shop deepCopy() {
        BookShop obj = null;
        try {
            obj = (BookShop) super.clone();
            List<Book> books = new ArrayList<>();
            Iterator<Book> iterator = this.getBooks().iterator();
            while(iterator.hasNext()){

                books.add((Book) iterator.next().clone());
            }
            obj.setBooks(books);
        } catch (CloneNotSupportedException exc) {
            exc.printStackTrace();
        }
        return obj;
    }
    @Override
    public String toString() {
        return "BookShop{" +
                "shopName='" + shopName + '\'' +
                ", shopId=" + shopId +
                ", books=" + books +
                '}';
    }
}
