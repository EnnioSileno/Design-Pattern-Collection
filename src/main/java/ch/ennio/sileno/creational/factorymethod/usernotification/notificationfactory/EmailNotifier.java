package ch.ennio.sileno.creational.factorymethod.usernotification.notificationfactory;

import ch.ennio.sileno.creational.factorymethod.usernotification.notification.EmailNotification;
import ch.ennio.sileno.creational.factorymethod.usernotification.notification.Notification;

public class EmailNotifier extends Notifier {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
