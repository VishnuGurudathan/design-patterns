package org.vishnu.message;

/**
 * @author vishnu.g
 * @project org.vishnu.observer : observer-pattern
 * @created 24/May/2020
 */
public class MessageSubscriberPhone  extends Observer {

    public MessageSubscriberPhone (MessagePublisher publisher) {
        this.publisher = publisher;
    }
    @Override
    public void update() {
        System.out.println(publisher.getMessage());
    }
}
