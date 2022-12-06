package ch.ennio.sileno.structural.decorator.examplenotification.decorator;

import ch.ennio.sileno.structural.decorator.examplenotification.INotifier;

public class FacebookDecorator extends BaseNotifierDecorator {

    public FacebookDecorator(INotifier source) {
        super(source);
    }

    @Override
    public void send(String message) {
        super.send(message);
        String fbName = databaseService.getFBNameFromUsername(super.getUsername());
        System.out.println("Sending " + message + " on Facebook to " + fbName);
        // super.someMethod could also be called after business logic;
    }
}
