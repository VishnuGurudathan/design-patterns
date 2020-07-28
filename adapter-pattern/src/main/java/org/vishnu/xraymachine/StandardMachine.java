package org.vishnu.xraymachine;

/**
 * @author vishnu.g
 * @project org.vishnu.xraymachine.adaptee : adapter-pattern
 * @created 07/Jun/2020
 */
public interface StandardMachine {
    /**
     * <p>
     *     Standard input machine is expecting temperature in fahrenheit only.
     * </p>
     * @return
     */
    public double getTemperature(); // should be in Fahrenheit
}
