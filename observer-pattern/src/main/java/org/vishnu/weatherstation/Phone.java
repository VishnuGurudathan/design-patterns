package org.vishnu.weatherstation;

/**
 * @author vishnu.g
 * @project org.vishnu.observer : observer-pattern
 * @created 24/May/2020
 */
public class Phone extends Observer {

    WeatherStation weatherStation;

    public Phone(WeatherStation weatherStation) {
        this.weatherStation = weatherStation;
    }
    @Override
    public void update() {
        weatherStation.getChange();
    }
}
