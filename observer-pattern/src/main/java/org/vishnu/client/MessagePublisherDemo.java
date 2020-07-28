package org.vishnu.client;


import org.vishnu.message.MessagePublisher;
import org.vishnu.message.MessageSubscriberComputer;
import org.vishnu.message.MessageSubscriberPhone;

/**
 * @author vishnu.g
 * @project org.vishnu : observer-pattern
 * @created 24/May/2020
 */
public class MessagePublisherDemo {
    public static void main(String[] args) {

        MessagePublisher publisher = new MessagePublisher();

        MessageSubscriberPhone phone = new MessageSubscriberPhone(publisher);
        publisher.register(phone);

        MessageSubscriberPhone phone2 = new MessageSubscriberPhone(publisher);
        publisher.register(phone2);
        publisher.setMessage("Hi");
        MessageSubscriberComputer c1 = new MessageSubscriberComputer(publisher);
        publisher.register(c1);
        publisher.setMessage("Hello world");

    }
}
