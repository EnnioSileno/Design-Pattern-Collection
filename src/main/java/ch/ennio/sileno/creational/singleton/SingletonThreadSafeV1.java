package ch.ennio.sileno.creational.singleton;

public class SingletonThreadSafeV1 {

    private static SingletonThreadSafeV1 INSTANCE;

    public static SingletonThreadSafeV1 getInstance() {

        // With this approach every thread has to wait before returning it,
        // even if the instance is already created. This is not optimal. -> look for V2
        synchronized (SingletonThreadSafeV1.class) {
            if(INSTANCE == null) {
                INSTANCE = new SingletonThreadSafeV1();
            }
        }
        return INSTANCE;
    }

    // Make default constructor private
    private SingletonThreadSafeV1() {}

    @Override
    public String toString() {
        return "I am SingletonThreadSafeV1 with hash code: " + this.hashCode();
    }
}
