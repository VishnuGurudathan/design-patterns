package org.vishnu.client;

import org.vishnu.notification.NotificationBar;
import org.vishnu.notification.NotificationCollection;

/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 25/Jul/2020
 */
public class NotificationIteratorClient {
    public static void main(String[] args) {
        NotificationCollection notificationCollection = new NotificationCollection();
        NotificationBar notificationBar = new NotificationBar(notificationCollection);
        notificationBar.printNotifications();
    }
}
