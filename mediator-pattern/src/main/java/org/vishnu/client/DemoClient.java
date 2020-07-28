package org.vishnu.client;

import org.vishnu.demo.ComponentA;
import org.vishnu.demo.ComponentB;
import org.vishnu.demo.ConcreteMediator;
import org.vishnu.demo.Mediator;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 26/Jul/2020
 */
public class DemoClient {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        ComponentA componentA = new ComponentA(mediator);
        ComponentB componentB = new ComponentB(mediator);

        mediator.register(componentA);
        mediator.register(componentB);

        componentA.send();
        System.out.println();
        componentB.send();
    }
}
