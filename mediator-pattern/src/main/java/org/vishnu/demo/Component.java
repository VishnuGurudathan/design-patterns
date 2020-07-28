package org.vishnu.demo;

/**
 * Abstract component class.
 *
 * @author : vishnu.g
 * created on : 26/Jul/2020
 */
public abstract class Component {
    private String name;
    protected Mediator mediator;

    public Component(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void send();
    public abstract void receive(String message);

    public String getName() {
        return this.name;
    }
}
