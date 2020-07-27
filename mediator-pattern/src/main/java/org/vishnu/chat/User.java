package org.vishnu.chat;

/**
 * User class is a Colleague Class.
 *
 * @author : vishnu.g
 * created on : 26/Jul/2020
 */
public abstract class User {
    private ChatRoom chatRoomMediator;

    private String id;
    private String name;

    public User(ChatRoom room, String id, String name){
        this.chatRoomMediator = room;
        this.name = name;
        this.id = id;
    }

    public abstract void send(String message, String userId);
    public abstract void receive(String message);

    public ChatRoom getMediator() {
        return chatRoomMediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
