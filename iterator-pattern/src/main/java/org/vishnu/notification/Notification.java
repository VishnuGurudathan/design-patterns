package org.vishnu.notification;

/**
 * A simple Notification class
 *
 * @author : vishnu.g
 * created on : 25/Jul/2020
 */
public class Notification {

    /* A Java program to demonstrate implementation of iterator pattern with the example of notifications */
    private String notification;

    public Notification(String notification) {
        this.notification = notification;
    }

    public void setNotification(String notification) {
        this.notification = notification;
    }

    public String getNotification() {
        return notification;
    }
}
