package org.vishnu.demo;

/**
 * The Originator class can produce snapshots of its own state,
 * as well as restore its state from snapshots when needed.
 *
 * @author : vishnu.g
 * created on : 28/Jul/2020
 */
public class Originator {
    private String state;
    /* lots of memory consumptive private data that is not necessary to define the
     * state and should thus not be saved. Hence the small memento object.
     * */

    public Originator() {}

    public Originator(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento save() {
        return new Memento(state);
    }

    public void restore(Memento memento) {
        this.state = memento.getState();
    }
}
