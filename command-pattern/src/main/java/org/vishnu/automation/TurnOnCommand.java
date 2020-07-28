package org.vishnu.automation;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 23/Jul/2020
 */
public class TurnOnCommand implements Command {
    private final Receiver receiver;

    public TurnOnCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        receiver.on();
    }

    public void undo() {
        receiver.off();
    }
}
