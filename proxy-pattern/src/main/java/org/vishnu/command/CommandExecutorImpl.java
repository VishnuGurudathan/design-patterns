package org.vishnu.command;

import java.io.IOException;

/**
 * @author vishnu.g
 * @project org.vishnu.command : proxy-pattern
 * @created 26/May/2020
 */
public class CommandExecutorImpl implements CommandExecutor {
    @Override
    public void runCommand(String cmd) throws IOException {
        Runtime.getRuntime().exec("cmd.exe /e"+cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
