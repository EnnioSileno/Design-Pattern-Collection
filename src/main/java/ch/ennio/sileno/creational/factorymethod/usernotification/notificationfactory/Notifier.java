package ch.ennio.sileno.creational.factorymethod.usernotification.notificationfactory;

import ch.ennio.sileno.creational.factorymethod.usernotification.notification.Notification;

public abstract class Notifier {
    public void notifyUser() {
        Notification notification = createNotification();
        notification.notifyUser();
    }
    abstract Notification createNotification();
}
