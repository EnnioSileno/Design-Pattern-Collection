package ch.ennio.sileno.creational.factorymethod.usernotification;

import ch.ennio.sileno.creational.factorymethod.usernotification.notificationfactory.EmailNotifier;
import ch.ennio.sileno.creational.factorymethod.usernotification.notificationfactory.Notifier;
import ch.ennio.sileno.creational.factorymethod.usernotification.notificationfactory.PushNotifier;
import ch.ennio.sileno.creational.factorymethod.usernotification.notificationfactory.SMSNotifier;

public class NotificationService {

    private static Notifier notifier;

    public static void main(String[] args) {
        NotificationType notificationType = NotificationType.EMAIL;
        initialize(notificationType);
        notifier.notifyUser();
    }

    public static void initialize(NotificationType notificationType) {
        notifier = switch (notificationType) {
            case SMS -> new SMSNotifier();
            case EMAIL -> new EmailNotifier();
            case PUSH -> new PushNotifier();
        };
    }
}
