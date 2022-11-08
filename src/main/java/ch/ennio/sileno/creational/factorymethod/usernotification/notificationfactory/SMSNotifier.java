package ch.ennio.sileno.creational.factorymethod.usernotification.notificationfactory;

import ch.ennio.sileno.creational.factorymethod.usernotification.notification.Notification;
import ch.ennio.sileno.creational.factorymethod.usernotification.notification.SMSNotification;

public class SMSNotifier extends Notifier {
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
