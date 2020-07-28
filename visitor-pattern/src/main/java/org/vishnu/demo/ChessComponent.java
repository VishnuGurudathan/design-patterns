package org.vishnu.demo;

/**
 * Abstract component class.
 *
 * @author : vishnu.g
 * created on : 27/Jul/2020
 */
public abstract class ChessComponent {

    private String componentName;

    public ChessComponent(String componentName) {
        this.componentName = componentName;
    }

    public String getComponentName() {
        return componentName;
    }

    public abstract void accept(Visitor visitor);
}
