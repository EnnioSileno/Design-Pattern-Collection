package ch.ennio.sileno.creational.factorymethod.usernotification.notification;

public class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a sms notification");
    }
}
