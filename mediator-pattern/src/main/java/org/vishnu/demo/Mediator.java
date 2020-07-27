package org.vishnu.demo;

/**
 * Mediator interface
 *
 * @author : vishnu.g
 * created on : 26/Jul/2020
 */
public interface Mediator {

    /**
     *
     * @param sender
     * @param message
     */
    void notify(Component sender, String message);

    /**
     *
     * @param component
     */
    void register(Component component);
}
