package org.vishnu.message;

/**
 * Created By : vishnu.g
 * Created On : 30/Jun/2020
 *
 * @project org.vishnu.message : bridge-pattern
 */
public class EmailMessage extends Message {

    public EmailMessage(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }
}
