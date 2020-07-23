package org.vishnu.automation;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 23/Jul/2020
 */
public class Motor extends Receiver {

    public Motor(String name) {
        super(name);
    }

    void on() {
        System.out.println("Motor is on");
    }

    void off() {
        System.out.println("Motor is off");
    }
}
