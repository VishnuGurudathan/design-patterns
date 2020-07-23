package org.vishnu.calculation;

/**
 * Divide number based on request type.
 *
 * @author : vishnu.g
 * created on : 23/Jul/2020
 */
public class DivideNumbers extends AbstractChainHandler implements Calculation {
    @Override
    public void calculate(Numbers number) {
        if (number.getType().equals(CalculationType.DIVIDE)) {
            System.out.print(number.getNumberOne() + " / " + number.getNumberTwo() + " = "+
                    (number.getNumberOne() / number.getNumberTwo()));
            // If we need the request to be processed by all chain avoid breaking the chan.
            return;
        }
        handleChain(number);
    }

    @Override
    public <T> void handle(T t) {
        if (t instanceof Numbers) {
            calculate((Numbers) t);
        } else {
            // We can through exception or pass to next chain.
           handleChain(t);
        }
    }
}
