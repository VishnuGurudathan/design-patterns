package org.vishnu.xraymachine.adapter;

import org.vishnu.xraymachine.StandardMachine;
import org.vishnu.xraymachine.adaptee.CiscoXRay;

/**
 * @author vishnu.g
 * @project org.vishnu.xraymachine.adapter : adapter-pattern
 * @created 07/Jun/2020
 */
public class CiscoAdapter implements StandardMachine {

    CiscoXRay ciscoXRay;

    public CiscoAdapter(CiscoXRay ciscoXRay) {
        this.ciscoXRay = ciscoXRay;
    }
    @Override
    public double getTemperature() {
        return (ciscoXRay.getTemperatureCisco() * 1.8) + 32;
    }
}
