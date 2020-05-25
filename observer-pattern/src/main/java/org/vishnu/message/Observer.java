package org.vishnu.message;

/**
 * @author vishnu.g
 * @project org.vishnu.observer : observer-pattern
 * @created 24/May/2020
 */
public abstract class Observer {
    protected MessagePublisher publisher;

    /**
     * This method is called whenever the observed object is changed. An application
     * calls an <tt>Observable</tt> object's <code>notifyObservers</code> method to
     * have all the object's observers notified of the change.
     */
    public abstract void update();
}
