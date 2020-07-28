package org.vishnu.message;

/**
 * Created By : vishnu.g
 * Created On : 30/Jun/2020
 *
 * @project org.vishnu.message : bridge-pattern
 */
public class TextMessageSender implements MessageSender {
    @Override
    public void sendMessage() {
        System.out.println("'TextMessageSender : ' Sending text message...");
    }
}
