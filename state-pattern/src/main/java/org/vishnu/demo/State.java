package org.vishnu.demo;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 27/Jul/2020
 */
public interface State {

    void transitionTo(State state);
    void displayState();
}
