package org.vishnu.demo;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 27/Jul/2020
 */
public class LightBulb {
    State currentState;

    public LightBulb() {
        this.currentState = new OffState(this);
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void displayState() {
        this.currentState.displayState();
    }
}
