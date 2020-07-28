package org.vishnu.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * This is the context class.
 *
 * @author : vishnu.g
 * created on : 27/Jul/2020
 */
public class LightBulb {

    private Map<State, State> stateToggleMap = new HashMap<>();
    State currentState;

    public LightBulb() {
        State onState = new OnState(this);
        State offState = new OffState(this);
        stateToggleMap.put(onState,offState);
        stateToggleMap.put(offState,onState);
        this.currentState = offState;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    // is the request method of the context.
    public void displayState() {
        this.currentState.displayState();
    }

    // this is a enhanced method to toggle with states.
    /* when more state we can no cannot allow this method and cleint can change the state at runtime to
    change the class behaviour
    */
    public void toggle() {
        this.currentState.transitionTo(stateToggleMap.get(currentState));
    }
}
