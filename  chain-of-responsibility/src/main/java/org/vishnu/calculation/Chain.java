package org.vishnu.calculation;

/**
 * Chain interface
 *
 * @author : vishnu.g
 * created on : 23/Jul/2020
 */
public interface Chain {
    /**
     * <p>
     *     Defines the next Object to receive the data if this Object can't process it.
     * </p>
     * @param nextChain
     */
    void setNextChain(Chain nextChain);

    /**
     * <p>
     *     Handle the request or pass the request to next chain.
     * </p>
     * @param t
     */
    <T> void handle(T t);
}
