package org.vishnu.automation;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 23/Jul/2020
 */
public abstract class Receiver {

    protected String name;

    public Receiver(String name) {
        this.name = name;
    }

    abstract void on();

    abstract void off();
}
