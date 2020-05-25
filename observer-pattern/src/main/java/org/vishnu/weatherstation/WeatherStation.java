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
    //private Weather weather;
    private  int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public WeatherStation() {
        observers = new Vector<>();
    }

    public WeatherStation(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public WeatherStation(int temperature, Observer observer) {
        this.temperature = temperature;
        register(observer);
        notifyObservers();
    }
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

    @Override
    public void getChange() {
        System.out.println("Temperature : " + temperature );
    }
}
