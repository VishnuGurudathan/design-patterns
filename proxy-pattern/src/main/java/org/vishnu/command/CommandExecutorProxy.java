package org.vishnu.command;

import java.io.IOException;
import java.util.Arrays;

/**
 * @author vishnu.g
 * @project org.vishnu.command : proxy-pattern
 * @created 26/May/2020
 */
public class CommandExecutorProxy implements CommandExecutor {

    private CommandExecutor executor;
    private boolean isAdmin;
    private String userName;
    private String [] adminUsers = {"Admin", "Vishnu"};

    public CommandExecutorProxy(String userName) {
        this.userName = userName;
        this.executor = new CommandExecutorImpl();
        isAdmin();
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    private void isAdmin() {
        setAdmin(Arrays.asList(adminUsers).contains(userName));
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if(isAdmin){
            executor.runCommand(cmd);
        }else if (cmd.trim().startsWith("rm")) {
            throw new Exception("rm command is not allowed for non-admin users.");
        } else {
            executor.runCommand(cmd);
        }
    }
}
