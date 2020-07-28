package org.vishnu.client;

import org.vishnu.xraymachine.StandardMachine;
import org.vishnu.xraymachine.adaptee.CiscoXRay;
import org.vishnu.xraymachine.adaptee.IBMXRay;
import org.vishnu.xraymachine.adapter.CiscoAdapter;
import org.vishnu.xraymachine.adapter.IBMAdapter;

import java.util.Arrays;

/**
 * @author vishnu.g
 * @project org.vishnu.client : adapter-pattern
 * @created 07/Jun/2020
 */
public class XrayMachineAdapterDriverClient {

    public static void main(String[] args) {
        IBMXRay ibmxRayMachine = new IBMXRay();
        CiscoXRay ciscoXRayMachine = new CiscoXRay();

        StandardMachine standardMachine = new IBMAdapter(ibmxRayMachine);
        double ibmTemp = standardMachine.getTemperature(); // getting temperature from ibm machine

        standardMachine = new CiscoAdapter(ciscoXRayMachine);

        System.out.println("Temperature from adaptee 'IBM' (in fahrenheit) : " + ibmTemp);
        System.out.println("Temperature from adaptee 'Cisco' (in celsius) : " + standardMachine.getTemperature());
    }
}
