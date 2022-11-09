package ch.ennio.sileno.creational.singleton;

public class SingletonThreadSafeV2 {

    private static SingletonThreadSafeV2 INSTANCE;

    public static SingletonThreadSafeV2 getInstance() {

        // The Problem of V1 is here solved with applying the double-checked locking idiom
        // by limiting synchronization to the rare case of constructing a new instance.
        // This is done via adding another null-check before the synchronized block
        //
        // However there could be a huge problem within this approach. Some programming languages
        // update the state of the variable stored in the memory, even if it is only partially constructed.
        // Example:
        //   1.   Thread A comes first and initializes SimpleSingletonThreadSafeV2.
        //   2.   While the object is under construction, Thread B needs an instance as well and sees, that
        //        the objects is partially created and therefore not null.
        //   3.   The check (INSTANCE == null) is false and Thread B returns the partially constructed object.
        //   4.   The application could or will crash.
        // To solve this issue look for V3.
        if (INSTANCE == null) {
            synchronized (SingletonThreadSafeV2.class) {
                if(INSTANCE == null) {
                    INSTANCE = new SingletonThreadSafeV2();
                }
            }
        }
        return INSTANCE;
    }

    // Make default constructor private
    private SingletonThreadSafeV2() {}

    @Override
    public String toString() {
        return "I am SingletonThreadSafeV2 with hash code: " + this.hashCode();
    }
}
