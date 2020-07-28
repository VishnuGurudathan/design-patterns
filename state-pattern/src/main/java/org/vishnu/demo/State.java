package org.vishnu.demo;

/**
 * State interface.
 *
 * @author : vishnu.g
 * created on : 27/Jul/2020
 */
public interface State {

    /**
     *
     * @param state
     */
    void transitionTo(State state);

    /**
     *
     */
    // is the handle method
    void displayState();
}
