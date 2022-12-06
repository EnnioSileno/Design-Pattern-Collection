package ch.ennio.sileno.structural.decorator.examplenotification.decorator;

import ch.ennio.sileno.structural.decorator.examplenotification.INotifier;

public class WhatsAppDecorator extends BaseNotifierDecorator {
    public WhatsAppDecorator(INotifier source) {
        super(source);
    }

    @Override
    public void send(String message) {
        super.send(message);
        String number = databaseService.getPhoneNbrFromUsername(super.getUsername());
        System.out.println("Sending " + message + " on Facebook to " + number);
        // super.someMethod could also be called after business logic;
    }
}
