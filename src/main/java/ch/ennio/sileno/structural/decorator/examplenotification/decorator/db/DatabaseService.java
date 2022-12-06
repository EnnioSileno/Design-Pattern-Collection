package ch.ennio.sileno.structural.decorator.examplenotification.decorator.db;

public class DatabaseService {

    private static DatabaseService INSTANCE;

    private DatabaseService() {};

    public static DatabaseService getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new DatabaseService();
        }
        return INSTANCE;
    }

    public String getMailFromUsername(String username) {
        return username + "@Mail";
    }

    public String getPhoneNbrFromUsername(String username) {
        return username + "@Phone";
    }

    public String getFBNameFromUsername(String username) {
        return username + "@Facebook";
    }
}
