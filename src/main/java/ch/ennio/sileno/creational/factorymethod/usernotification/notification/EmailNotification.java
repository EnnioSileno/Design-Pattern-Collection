package ch.ennio.sileno.creational.factorymethod.usernotification.notification;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending an email notification");
    }
}
