package org.vishnu.calculation;

/**
 * Abstract chain handler.
 *
 * @author : vishnu.g
 * created on : 23/Jul/2020
 */
public abstract class AbstractChainHandler implements Chain {

    protected Chain nextChain;

    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    /**
     * <p>
     *     Gracefully handle the chain.
     * </p>
     * @param t
     * @param <T>
     */
    protected <T> void handleChain(T t) {
        if (this.nextChain != null)
            this.nextChain.handle(t);
        else
            System.out.println("No more handler to handle request !");
    }
}
