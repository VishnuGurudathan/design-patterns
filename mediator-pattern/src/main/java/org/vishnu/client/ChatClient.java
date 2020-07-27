package org.vishnu.client;

import org.vishnu.chat.ChatRoom;
import org.vishnu.chat.ChatRoomImpl;
import org.vishnu.chat.ChatUser;
import org.vishnu.chat.User;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 26/Jul/2020
 */
public class ChatClient {
    public static void main(String[] args) {
        ChatRoom chatroom = new ChatRoomImpl();

        User user1 = new ChatUser(chatroom,"1", "Alex");
        User user2 = new ChatUser(chatroom,"2", "Bob");
        User user3 = new ChatUser(chatroom,"3", "Charles");
        User user4 = new ChatUser(chatroom,"4", "David");

        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);

        user1.send("Hello Bob", "2");
        user2.send("Hey buddy", "1");
    }
}
