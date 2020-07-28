package org.vishnu.prototype.example;

/**
 * @author vishnu.g
 * @project org.vishnu.prototype.example : prototype-pattern
 * @created 15/May/2020
 */
public class Book implements Cloneable {
    String bookName;
    String description;

    public Book(String bookName, String description) {
        this.bookName = bookName;
        this.description = description;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Book clone = null;
        try
        {
            clone = (Book) super.clone();

            //Copy new date object to cloned method

        }
        catch (CloneNotSupportedException e)
        {
            throw new RuntimeException(e);
        }
        return clone;
    }
}
