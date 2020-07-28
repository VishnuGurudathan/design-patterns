package org.vishnu.command;

import java.io.IOException;

/**
 * @author vishnu.g
 * @project org.vishnu.command : proxy-pattern
 * @created 26/May/2020
 */
public interface CommandExecutor {
    void runCommand(String cmd) throws Exception;
}
