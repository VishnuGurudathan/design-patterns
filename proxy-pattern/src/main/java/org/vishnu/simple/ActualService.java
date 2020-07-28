package org.vishnu.simple;

/**
 * @author vishnu.g
 * @project org.vishnu.simple : proxy-pattern
 * @created 26/May/2020
 */
public class ActualService implements Service {
    public void execute() {
        System.out.println("Executing actual service !!!");
    }
}
