package org.vishnu.chat;

/**
 * ChatRoom represents a Mediator Interface.
 *
 * @author : vishnu.g
 * created on : 26/Jul/2020
 */
public interface ChatRoom {
    void sendMessage(String message, String userId);
    void addUser(User user);
}
