package org.vishnu.client;

import org.vishnu.command.CommandExecutor;
import org.vishnu.command.CommandExecutorProxy;

/**
 * @author vishnu.g
 * @project org.vishnu.client : proxy-pattern
 * @created 26/May/2020
 */
public class CommandExecutorClient {
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutorProxy("Admin");

        try {
            executor.runCommand("dir");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }
    }
}
