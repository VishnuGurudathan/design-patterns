package org.vishnu.xraymachine.adaptee;

/**
 * @author vishnu.g
 * @project org.vishnu.xraymachine.adaptee : adapter-pattern
 * @created 07/Jun/2020
 */
public class CiscoXRay {
    /**
     * <p> Consider cisco x-ray machine will give temperature output in celsius.</p>
     * @return
     */
    public double getTemperatureCisco(){
        return 30;// in Celsius
    }
}
