package org.vishnu.calculation;

/**
 * Substract number based on request type.
 *
 * @author : vishnu.g
 * created on : 23/Jul/2020
 */
public class SubtractNumbers extends AbstractChainHandler implements Calculation {
    @Override
    public void calculate(Numbers number) {
        if (number.getType().equals(CalculationType.SUBTRACT)) {
            System.out.print(number.getNumberOne() + " - " + number.getNumberTwo() + " = "+
                    (number.getNumberOne() - number.getNumberTwo()));
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
            // We can through exception.
            handleChain(t);
        }
    }
}
