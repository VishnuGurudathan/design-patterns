package org.vishnu.client;

import org.vishnu.automation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 23/Jul/2020
 */
public class Client {

    private Invoker invoker;
    private List<Command> commands;

    public static void main(String[] args) {
        Client client = new Client();
        client.run();
    }

    private void run() {
        commands = new ArrayList<>();
        Receiver receiverLight = new Light("Flash lamp");
        Command lightTurnOncommand = new TurnOnCommand(receiverLight);
        commands.add(lightTurnOncommand);

        invoker = new Invoker(lightTurnOncommand);
        invoker.executeCommand();

        Receiver receiverMotor = new Motor("Motor");
        Command motorOncommand = new TurnOnCommand(receiverMotor);
        commands.add(motorOncommand);

        invoker.setCommand(motorOncommand);
        invoker.executeCommand();

        commands.forEach(command -> {
            invoker.setCommand(command);
            invoker.undoCommand();
        });
    }
}
