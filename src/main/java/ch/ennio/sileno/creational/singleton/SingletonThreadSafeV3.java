package ch.ennio.sileno.creational.singleton;

public class SingletonThreadSafeV3 {

    // The Problem of V2 is solved by making the object volatile.
    // This keyword ensures that the variable can't get cached and
    // therefore multiple threads will be able to handle the
    // singleton object correctly.
    private static volatile SingletonThreadSafeV3 INSTANCE;

    public static SingletonThreadSafeV3 getInstance() {

        if (INSTANCE == null) {
            synchronized (SingletonThreadSafeV3.class) {
                if(INSTANCE == null) {
                    INSTANCE = new SingletonThreadSafeV3();
                }
            }
        }
        return INSTANCE;
    }

    // Make default constructor private
    private SingletonThreadSafeV3() {}

    @Override
    public String toString() {
        return "I am SingletonThreadSafeV3 with hash code: " + this.hashCode();
    }
}
