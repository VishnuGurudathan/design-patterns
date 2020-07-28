package org.vishnu.notification;

/**
 * We could also use Java.Util.Iterator
 *
 * @author : vishnu.g
 * created on : 25/Jul/2020
 */
public interface Iterator {

    /**
     * <p>
     *     Indicates whether there are more elements to iterate over.
     * </p>
     * @return
     */
    boolean hasNext();

    /**
     *
     * @return the next element
     */
    Object next();
}
