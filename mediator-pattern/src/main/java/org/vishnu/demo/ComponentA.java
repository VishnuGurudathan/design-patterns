package org.vishnu.demo;

/**
 * Concrete implementation of component/Colleague class.
 *
 * @author : vishnu.g
 * created on : 26/Jul/2020
 */
public class ComponentA extends Component {

    private static final String COMPONENT_NAME = "COMPONENT-A";

    public ComponentA(Mediator mediator) {
        super(COMPONENT_NAME,mediator);
    }

    @Override
    public void send() {
        String message = "Hello World";
        System.out.println(COMPONENT_NAME + " is sending message : " +  message);
        mediator.notify(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println(COMPONENT_NAME + " received message : " + message);
    }
}
