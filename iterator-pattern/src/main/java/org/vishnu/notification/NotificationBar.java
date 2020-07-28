package org.vishnu.notification;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 25/Jul/2020
 */
public class NotificationBar {

    NotificationCollection notifications;

    public NotificationBar(NotificationCollection notifications)
    {
        this.notifications = notifications;
    }

    public void printNotifications()
    {
        Iterator iterator = notifications.createIterator();
        System.out.println("-------NOTIFICATION BAR------------");
        while (iterator.hasNext())
        {
            Notification notification = (Notification)iterator.next();
            System.out.println(notification.getNotification());
        }
    }
}
