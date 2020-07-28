package org.vishnu.client;

import org.vishnu.demo.LightBulb;
import org.vishnu.demo.OffState;
import org.vishnu.demo.OnState;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 27/Jul/2020
 */
public class DemoClient {
    public static void main(String[] args) {
        LightBulb bulb = new LightBulb();
        bulb.displayState();
        bulb.setCurrentState(new OnState(bulb));
        bulb.displayState();
        bulb.setCurrentState(new OffState(bulb));
        bulb.displayState();
    }
}
