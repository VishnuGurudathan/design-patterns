package org.vishnu.simple;

/**
 * @author vishnu.g
 * @project org.vishnu.simple : proxy-pattern
 * @created 26/May/2020
 */
public class ProxyService implements Service {
    Service service;

    public ProxyService() {
        this.service = new ActualService();
    }

    private boolean checkAccess() {
        System.out.println("Checking access...");
        return true;
    }

    @Override
    public void execute() {
        System.out.println("Invoking proxy...");

        if (!checkAccess())
            System.err.println("Execution interpreted, no access to perform the operation.");
        System.out.println("Accessing actual service...");

        service.execute();
    }
}
