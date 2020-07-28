package org.vishnu.demo;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 24/Jul/2020
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doSomething() {
        strategy.execute();
    }
}
