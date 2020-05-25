package org.vishnu.stock;

/**
 * @author vishnu.g
 * @project org.vishnu.stock : observer-pattern
 * @created 25/May/2020
 */
public interface Observable {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
}
