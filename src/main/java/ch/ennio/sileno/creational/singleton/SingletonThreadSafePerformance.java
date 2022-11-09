package ch.ennio.sileno.creational.singleton;

public class SingletonThreadSafePerformance {

    // Because this variable is now volatile, as soon we need access
    // to this variable we need to read it directly from the main memory.
    // In V3 we have the problem that we access it up to 3 times which is slow.
    private static volatile SingletonThreadSafePerformance INSTANCE;

    public static SingletonThreadSafePerformance getInstance() {

        // The simple usage of such a local variable can boost the performance
        // of the method by up to 25% compared to V3
        SingletonThreadSafePerformance cachedSingleton = INSTANCE;
        if (cachedSingleton == null) {
            synchronized (SingletonThreadSafePerformance.class) {
                // https://www.javacodemonk.com/threadsafe-singleton-design-pattern-java-806ad7e6
                // Refreshing local reference to the latest value after acquiring a lock, since volatile variable may
                // have changed by this time due.
                cachedSingleton = INSTANCE;
                if(cachedSingleton == null) {
                    INSTANCE = cachedSingleton = new SingletonThreadSafePerformance();
                }
            }
        }
        return cachedSingleton;
    }

    // Make default constructor private
    private SingletonThreadSafePerformance() {}

    @Override
    public String toString() {
        return "I am SingletonThreadSafePerformance with hash code: " + this.hashCode();
    }
}
