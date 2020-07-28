package org.vishnu.notification;
/**
 * Class description
 *
 * @author : vishnu.g
 * created on : 25/Jul/2020
 */
public class NotificationIterator implements Iterator {

    // Concrete Iterator class
    //We can even use java.util.Iterator also.

    Notification[] notifications;

    // maintains curr pos of iterator over the array
    int pos = 0;

    // Constructor takes the array of notifiactions.
    public NotificationIterator(Notification[] notifications)
    {
        /* Instead of passing array, we can pass NotificationCollection and expose getNotifications method to access the
            array. There by not keeping the actual dataset in concrete iterator class.
            NotificationIterator without actual data set is defined in defined in NotificationIteratorWAD class.
        */
        this.notifications = notifications;
    }


    public boolean hasNext() {
        if (pos >= notifications.length ||
                notifications[pos] == null)
            return false;
        else
            return true;
    }

    public Object next() {
        // return next element in the array and increment pos
        Notification notification =  notifications[pos];
        pos += 1;
        return notification;
    }
}
