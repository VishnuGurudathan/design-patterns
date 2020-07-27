package org.vishnu.chat;

import java.util.HashMap;
import java.util.Map;

/**
 * ChatRoomImpl is a Concrete Mediator
 *
 * @author : vishnu.g
 * created on : 26/Jul/2020
 */
public class ChatRoomImpl implements ChatRoom {

    private Map<String, User> usersMap = new HashMap<>();

    @Override
    public void sendMessage(String message, String userId) {
        User user = usersMap.get(userId);
        user.receive(message);
    }

    @Override
    public void addUser(User user) {
        this.usersMap.put(user.getId(), user);
    }
}
