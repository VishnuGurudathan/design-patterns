package org.vishnu.automation;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 23/Jul/2020
 */
public class Light extends Receiver {

    public Light(String name) {
        super(name);
    }

    @Override
    void on() {
        System.out.println("Light is on");
    }

    @Override
    void off() {
        System.out.println("Light is off");
    }
}
