package ch.ennio.sileno.structural.decorator.examplenotification;

import ch.ennio.sileno.structural.decorator.examplenotification.decorator.FacebookDecorator;
import ch.ennio.sileno.structural.decorator.examplenotification.decorator.WhatsAppDecorator;

public class MainApp {
    public static void main(String[] args) {
        INotifier notifyAll = new FacebookDecorator(new WhatsAppDecorator(new Notifier("Ennio")));
        notifyAll.send("Hello World!");

        System.out.println("----------");

        INotifier notifyFBMail = new FacebookDecorator(new Notifier("Ennio"));
        notifyFBMail.send("Hello World 2!");
    }
}
