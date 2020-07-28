package org.vishnu.message;

/**
 * Created By : vishnu.g
 * Created On : 30/Jun/2020
 *
 * @project org.vishnu.message : bridge-pattern
 */
public abstract class Message {

    protected final MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    /**
     * <p>
     *     Method to send message.
     * </p>
     */
    abstract public void send();
}
