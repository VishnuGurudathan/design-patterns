package org.vishnu.demo;

/**
 * The Memento is a value object that acts as a snapshot of the originator’s state/object.
 * It’s a common practice to make the memento immutable and pass it the data only once,
 * via the constructor.
 *
 * @author : vishnu.g
 * created on : 28/Jul/2020
 */
public final class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
