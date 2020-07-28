package org.vishnu.demo;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 27/Jul/2020
 */
public class OffState implements State {
    LightBulb lightBulb;

    public OffState(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    @Override
    public void transitionTo(State state) {
        lightBulb.setCurrentState(state);
    }

    @Override
    public void displayState() {
        System.out.println("Light bulb is turned OFF");
    }
}
