package org.vishnu.client;

import org.vishnu.weatherstation.Phone;
import org.vishnu.weatherstation.WeatherStation;

/**
 * @author vishnu.g
 * @project org.vishnu.client : observer-pattern
 * @created 25/May/2020
 */
public class WeatherStationDemo {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation(12);
        Phone phone = new Phone(weatherStation);

        weatherStation.register(phone);

        weatherStation.setTemperature(20);

    }




}
