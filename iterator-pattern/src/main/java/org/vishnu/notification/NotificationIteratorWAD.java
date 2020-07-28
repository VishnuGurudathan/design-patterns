package org.vishnu.notification;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 26/Jul/2020
 */
public class NotificationIteratorWAD implements Iterator {

    NotificationCollection collection;
    int pos;

    public NotificationIteratorWAD(NotificationCollection collection) {
        this.collection = collection;
    }

    public boolean hasNext() {
        if (pos >= collection.getNotifications().length ||
                collection.notifications[pos] == null)
            return false;
        else
            return true;
    }

    public Object next() {
        Notification notification =  collection.getNotifications()[pos];
        pos += 1;
        return notification;
    }

    public void remove() {
        for (int i = pos-1; i < collection.getNotifications().length - 1; i++) {
            collection.getNotifications()[i] = collection.getNotifications()[i+1];
        }
        collection.getNotifications()[collection.getNotifications().length - 1] = null;
    }
}
