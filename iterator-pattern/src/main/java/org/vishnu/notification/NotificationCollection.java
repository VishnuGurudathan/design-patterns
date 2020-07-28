package org.vishnu.notification;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 25/Jul/2020
 */
public class NotificationCollection implements Collection {

    // Concrete Collection class

    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    Notification[] notifications;

    public NotificationCollection() {
        notifications = new Notification[MAX_ITEMS];
        addDummyNotifications();
    }

    public void addItem(String notificationMessage)
    {
        Notification notification = new Notification(notificationMessage);
        addItem(notification);
    }

    public void addItem(Notification notification)
    {
        if (numberOfItems >= MAX_ITEMS)
            System.err.println("Full");
        else
        {
            notifications[numberOfItems] = notification;
            numberOfItems = numberOfItems + 1;
        }
    }

    public Iterator createIterator() {
        return new NotificationIterator(this.notifications);
    }

    private void addDummyNotifications() {
        addItem("Notification 1");
        addItem("Notification 2");
        addItem("Notification 3");
    }

    public Notification[] getNotifications() {
        return notifications;
    }
}
