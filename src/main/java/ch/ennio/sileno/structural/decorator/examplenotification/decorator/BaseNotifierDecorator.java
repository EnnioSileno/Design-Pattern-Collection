package ch.ennio.sileno.structural.decorator.examplenotification.decorator;

import ch.ennio.sileno.structural.decorator.examplenotification.decorator.db.DatabaseService;
import ch.ennio.sileno.structural.decorator.examplenotification.INotifier;

public abstract class BaseNotifierDecorator implements INotifier {
    protected final DatabaseService databaseService;
    private final INotifier wrappee;

    public BaseNotifierDecorator(INotifier source) {
        databaseService = DatabaseService.getInstance();
        this.wrappee = source;
    }

    @Override
    public void send(String message) {
        wrappee.send(message);
    }

    @Override
    public String getUsername() {
        return wrappee.getUsername();
    }
}
