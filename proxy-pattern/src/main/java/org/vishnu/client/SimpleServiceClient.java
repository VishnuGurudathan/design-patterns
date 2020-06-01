package org.vishnu.client;

import org.vishnu.simple.ProxyService;
import org.vishnu.simple.Service;

/**
 * @author vishnu.g
 * @project org.vishnu.client : proxy-pattern
 * @created 26/May/2020
 */
public class SimpleServiceClient {
    public static void main(String[] args) {
        Service service = new ProxyService();
        service.execute();
    }
}
