package org.vishnu.weatherstation;

/**
 * @author vishnu.g
 * @project org.vishnu.observer : observer-pattern
 * @created 24/May/2020
 */
public class Weather extends WeatherStation {

    private int temperature;

    public Weather(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public String toString() {
        return "Weather{" +
                "temperature=" + temperature +
                '}';
    }
}
