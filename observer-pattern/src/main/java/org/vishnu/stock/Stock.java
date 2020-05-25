package org.vishnu.stock;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vishnu.g
 * @project org.vishnu.stock : observer-pattern
 * @created 25/May/2020
 */
public class Stock implements Observable {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.stream().forEach( o-> {
            o.update();
        });
    }
}
