package org.vishnu.weatherstation;

/**
 * @author vishnu.g
 * @project org.vishnu.observer : observer-pattern
 * @created 24/May/2020
 */
public interface Observable {
    /* Observable/Subject  will notify the observers. */
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers();
}
