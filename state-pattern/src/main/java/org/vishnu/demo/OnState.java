package org.vishnu.demo;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 27/Jul/2020
 */
public class OnState implements State {

    LightBulb lightBulb;

    public OnState(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }


    @Override
    public void transitionTo(State state) {
        lightBulb.setCurrentState(state);
    }

    @Override
    public void displayState() {
        // is the handle method
        System.out.println("Light bulb is turned ON.");
    }
}
