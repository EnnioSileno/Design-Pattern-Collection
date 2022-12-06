package ch.ennio.sileno.structural.decorator.examplenotification;

import ch.ennio.sileno.structural.decorator.examplenotification.decorator.db.DatabaseService;

public class Notifier implements INotifier {
    private final DatabaseService databaseService;
    private final String username;

    public Notifier(String username) {
        databaseService = DatabaseService.getInstance();
        this.username = username;
    }

    @Override
    public void send(String message) {
        String mail = databaseService.getMailFromUsername(username);
        System.out.println("Sending " + message + " by Mail to: " + mail);

    }

    @Override
    public String getUsername() {
        return username;
    }
}
