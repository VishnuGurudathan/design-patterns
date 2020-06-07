package org.vishnu.xraymachine.adaptee;

/**
 * @author vishnu.g
 * @project org.vishnu.xraymachine.adaptee : adapter-pattern
 * @created 07/Jun/2020
 */
public class IBMXRay {
    /**
     * <p> Consider IBM x-ray machine will give temperature output in fahrenheit.</p>
     * @return
     */
    public double getTemperatureIBM(){
        return 32;// in Fahrenheit
    }
}
