package ch.ennio.sileno.creational.singleton;

public class SimpleSingleton {

    private static SimpleSingleton INSTANCE;

    public static SimpleSingleton getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new SimpleSingleton();
        }
        return INSTANCE;
    }

    // Make default constructor private
    private SimpleSingleton() {}

    @Override
    public String toString() {
        return "I am SimpleSingleton with hash code: " + this.hashCode();
    }
}
