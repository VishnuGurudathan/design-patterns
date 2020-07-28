package org.vishnu.calculation;

/**
 * Add number based on request type.
 *
 * @author : vishnu.g
 * created on : 23/Jul/2020
 */
public class AddNumbers extends AbstractChainHandler implements Calculation {

    @Override
    public void calculate(Numbers number) {
        if(number.getType().equals(CalculationType.ADD)) {
            System.out.print(number.getNumberOne() + " + " + number.getNumberTwo() + " = "+
                    (number.getNumberOne() + number.getNumberTwo()));
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
            // We can throw exception.
            handleChain(t);
        }
    }
}
