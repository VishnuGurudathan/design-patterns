package org.vishnu.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 26/Jul/2020
 */
public class ConcreteMediator implements Mediator {

    private static final String COMPONENT_A = "COMPONENT-A";
    private static final String COMPONENT_B = "COMPONENT-B";
    private Map<String, Component> regComponentMap =
            new HashMap<>();

    @Override
    public void notify(Component sender, String message) {
        String senderName = sender.getName();
        if (COMPONENT_A.equals(senderName)) {
            reactOnA(message);
        } else if (COMPONENT_B.equals(senderName)) {
            reactOnB(message);
        }
    }

    @Override
    public void register(Component component) {
        regComponentMap.put(component.getName(), component);
    }

    private void reactOnA(String message) {
        System.out.println("Mediator is in action");
        regComponentMap.get(COMPONENT_B).receive(message);
    }

    private void reactOnB(String message) {
        System.out.println("Mediator is in action");
        regComponentMap.get(COMPONENT_A).receive(message);
    }
}
