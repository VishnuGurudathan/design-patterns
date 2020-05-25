package org.vishnu.weatherstation;

import java.util.Vector;

/**
 * @author vishnu.g
 * @project org.vishnu.observer : observer-pattern
 * @created 24/May/2020
 */
public class WeatherStation implements Observable {
    private Vector<Observer> observers = new Vector<>();
    private boolean change = false;

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        observers.stream().forEach(o->{
            o.update();
        });
    }

    public boolean hasChange() {
        return change;
    }

    public void setChange() {
        this.change = true;
    }

    //java.util.Observable
    public void clearChange() {
        this.change = false;
    }
}
