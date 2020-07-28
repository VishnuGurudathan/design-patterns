package org.vishnu.xraymachine.adapter;

import org.vishnu.xraymachine.StandardMachine;
import org.vishnu.xraymachine.adaptee.IBMXRay;

/**
 * @author vishnu.g
 * @project org.vishnu.xraymachine.adapter : adapter-pattern
 * @created 07/Jun/2020
 */
public class IBMAdapter implements StandardMachine {

    IBMXRay ibmXrayMachine;

    public IBMAdapter(IBMXRay ibmXrayMachine) {
        this.ibmXrayMachine = ibmXrayMachine;
    }
    @Override
    public double getTemperature() {
        return this.ibmXrayMachine.getTemperatureIBM();
    }
}
